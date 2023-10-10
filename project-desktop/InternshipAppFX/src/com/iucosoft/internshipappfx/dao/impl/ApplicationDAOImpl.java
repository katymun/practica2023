package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicationDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Application;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.sql.SQLS;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.exceptions.ApplicationNotFoundException;
import com.iucosoft.internshipappfx.utility.exceptions.CompanyNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class ApplicationDAOImpl implements ApplicationDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    @Override
    public boolean save(Application application) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Application application) throws SQLException {
        return false;
    }

    @Override
    public void delete(Application application) throws SQLException {
        PreparedStatement pstat = null;
        Connection conn = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.APPLICATIONS_DELETE);
            pstat.setInt(1, application.getId());
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
    public List<Application> findAllApplications() throws SQLException {
        List<Application> applications = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();) {
            ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_APPLICATIONS);

            while (rs.next()) {
                int id = rs.getInt(1);
                int idApplicant = rs.getInt(2);
                int idInternship = rs.getInt(3);
                LocalDate ld = LocalDate.parse(rs.getString(4));
                Date applicationDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                String cvFile = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String institution = rs.getString(7);
                String email = rs.getString(8);

                Application application = new Application(id, idApplicant, idInternship, applicationDate, cvFile, phoneNumber, institution, email);
                applications.add(application);
            }
            return applications;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }   
    }

    @Override
    public Application findById(int idApplication) throws SQLException {
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();) {
            ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_APPLICATIONS);

            if (rs.next()) {
                int id = rs.getInt(1);
                int idApplicant = rs.getInt(2);
                int idInternship = rs.getInt(3);
                LocalDate ld = LocalDate.parse(rs.getString(4));
                Date applicationDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                String cvFile = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String institution = rs.getString(7);
                String email = rs.getString(8);

                Application application = new Application(id, idApplicant, idInternship, applicationDate, cvFile, phoneNumber, institution, email);
                return application;
            }
            throw new ApplicationNotFoundException("Find by id = " + idApplication + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }   
    }

    @Override
    public Application findByName(String applicationName) throws SQLException {
        return null;
    }
}
