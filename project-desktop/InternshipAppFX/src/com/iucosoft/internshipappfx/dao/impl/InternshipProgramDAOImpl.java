package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Application;
import com.iucosoft.internshipappfx.entities.InternshipProgram;
import com.iucosoft.internshipappfx.sql.SQLS;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.exceptions.ApplicationNotFoundException;
import com.iucosoft.internshipappfx.utility.exceptions.InternshipProgramNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class InternshipProgramDAOImpl implements InternshipProgramDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    @Override
    public boolean save(InternshipProgram internshipProgram) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(InternshipProgram internshipProgram) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.PROGRAMMES_UPDATE);
            pstat.setString(1, internshipProgram.getiName());
            pstat.setString(2, internshipProgram.getDomain().toString());
            pstat.setString(3, internshipProgram.getStartDate().toString());
            pstat.setString(4, internshipProgram.getDuration());
            pstat.setString(5, internshipProgram.getDescription());
            pstat.setInt(6, internshipProgram.getId());

            pstat.executeUpdate();
            return true;
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            //throw ex;
            return false;
        } finally {
            if (pstat != null) {
                pstat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public void delete(InternshipProgram internshipProgram) throws SQLException {
        PreparedStatement pstat = null;
        Connection conn = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.PROGRAMMES_DELETE);
            pstat.setInt(1, internshipProgram.getId());
            pstat.executeUpdate();
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (pstat != null) {
                pstat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public List<InternshipProgram> findAll() throws SQLException {
        List<InternshipProgram> programs = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();) {
            ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_PROGRAMMES);

            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                LocalDate ld = LocalDate.parse(rs.getString(4));
                Date startDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                String duration = rs.getString(5);
                String description = rs.getString(6);
                int idCompany = rs.getInt(7);

                InternshipProgram program = new InternshipProgram(id, iName, domain, startDate, duration, description, idCompany);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

    @Override
    public InternshipProgram findById(int idInternshipProgram) throws SQLException {
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_PROGRAMME_BY_ID)) {

            if (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                LocalDate ld = LocalDate.parse(rs.getString(4));
                Date startDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                String duration = rs.getString(5);
                String description = rs.getString(6);
                int idCompany = rs.getInt(7);

                InternshipProgram program = new InternshipProgram(id, iName, domain, startDate, duration, description, idCompany);
                return program;
            }
            throw new InternshipProgramNotFoundException("Find by id = " + idInternshipProgram + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

}
