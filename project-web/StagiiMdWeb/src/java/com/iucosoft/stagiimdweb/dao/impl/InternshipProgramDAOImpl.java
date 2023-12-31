package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.stagiimdweb.entities.InternshipProgram;
import com.iucosoft.stagiimdweb.sql.SQLS;
import com.iucosoft.stagiimdweb.utility.DateConverter;
import com.iucosoft.stagiimdweb.utility.Domain;
import com.iucosoft.stagiimdweb.utility.exceptions.InternshipProgramNotFoundException;
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
import javax.sql.DataSource;

public class InternshipProgramDAOImpl implements InternshipProgramDAOIntf {

    DataSource ds;
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    public InternshipProgramDAOImpl(javax.sql.DataSource ds) {
        this.ds = ds;   
    }
    
    @Override
    public boolean save(InternshipProgram internshipProgram) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;

        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.PROGRAMMES_INSERT);
            pstat.setString(1, internshipProgram.getiName());
            pstat.setString(2, internshipProgram.getDomain().toString());
            pstat.setDate(3, DateConverter.convert(internshipProgram.getStartDate()));
            pstat.setString(4, internshipProgram.getDuration());
            pstat.setInt(5, internshipProgram.getIdCompany());
            pstat.setString(6, internshipProgram.getDuties());
            pstat.setString(7, internshipProgram.getQualifications());
            pstat.setString(8, internshipProgram.getBenefits());
            pstat.setString(9, internshipProgram.getLocation());
            pstat.setBoolean(10, internshipProgram.isPaid());

            int modificari = pstat.executeUpdate();

            if (modificari > 0) {
                return true;
            } else {
                throw new SQLException("Eroare la crearea programei!");
            }
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            return false;
        }
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
            pstat.setDate(3, DateConverter.convert(internshipProgram.getStartDate()));
            pstat.setString(4, internshipProgram.getDuration());
            pstat.setString(5, internshipProgram.getDuties());
            pstat.setString(6, internshipProgram.getQualifications());
            pstat.setString(7, internshipProgram.getBenefits());
            pstat.setString(8, internshipProgram.getLocation());
            pstat.setBoolean(9, internshipProgram.isPaid());
            pstat.setInt(10, internshipProgram.getId());

            pstat.executeUpdate();
            return true;
        } catch (Exception ex) {
            System.out.println("been here");
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
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();) {
            rs = stat.executeQuery(SQLS.FIND_ALL_PROGRAMMES);

            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                int idCompany = rs.getInt(6);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);

                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, qualifications, 
                        benefits, location, paid);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    @Override
    public InternshipProgram findById(int idInternshipProgram) throws SQLException {
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_PROGRAMME_BY_ID);) {
            pstat.setInt(1, idInternshipProgram);
            rs = pstat.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                int idCompany = rs.getInt(6);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);


                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, 
                        qualifications, benefits, location, paid);
                return program;
            }
            throw new InternshipProgramNotFoundException("Find by id = " + 
                    idInternshipProgram + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    @Override
    public List<InternshipProgram> findAllByCompanyId(int idCompany) throws SQLException {
        List<InternshipProgram> programs = new ArrayList<>();
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_ALL_PROGRAMMES_BY_COMPANY);) {
            pstat.setInt(1, idCompany);
            rs = pstat.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);


                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, 
                        qualifications, benefits, location, paid);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
        
    }

    @Override
    public List<InternshipProgram> findAllByDomain(Domain domain) throws SQLException {
        List<InternshipProgram> programs = new ArrayList<>();
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_ALL_PROGRAMMES_BY_DOMAIN);) {
            pstat.setString(1, domain.toString());
            rs = pstat.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                int idCompany = rs.getInt(6);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);


                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, 
                        qualifications, benefits, location, paid);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    @Override
    public List<InternshipProgram> findAllByKeyword(String keyword) throws SQLException {
        List<InternshipProgram> programs = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_ALL_PROGRAMS_BY_KEYWORD);) {
            pstat.setString(1, "%"+keyword+"%");
            pstat.setString(2, "%"+keyword+"%");
            pstat.setString(3, "%"+keyword+"%");
            pstat.setString(4, "%"+keyword+"%");
            pstat.setString(5, "%"+keyword+"%");
            ResultSet rs = pstat.executeQuery();
            

            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                int idCompany = rs.getInt(6);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);

                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, qualifications, 
                        benefits, location, paid);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

    @Override
    public List<InternshipProgram> findTopFiveProgramsByDate() throws SQLException {
        List<InternshipProgram> programs = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();) {
            ResultSet rs = stat.executeQuery(SQLS.FIND_TOP_5_PROGRAMS_BY_DATE);

            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                int idCompany = rs.getInt(6);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);

                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, qualifications, 
                        benefits, location, paid);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

    @Override
    public List<InternshipProgram> findTwoByCompanyId(int idCompany) throws SQLException {
        List<InternshipProgram> programs = new ArrayList<>();
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_2_INTERNSHIPS_BY_COMPANY);) {
            pstat.setInt(1, idCompany);
            rs = pstat.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);


                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, 
                        qualifications, benefits, location, paid);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    @Override
    public List<InternshipProgram> findTwoByDomain(Domain domain, int idCompany) throws SQLException {
        List<InternshipProgram> programs = new ArrayList<>();
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_2_INTERNSHIPS_BY_DOMAIN);) {
            pstat.setString(1, domain.toString());
            pstat.setInt(2, idCompany);
            rs = pstat.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String iName = rs.getString(2);
                Date startDate = DateConverter.convert(rs.getDate(4));
                String duration = rs.getString(5);
                String duties = rs.getString(7);
                String qualifications = rs.getString(8);
                String benefits = rs.getString(9);
                String location = rs.getString(10);
                boolean paid = rs.getBoolean(11);


                InternshipProgram program = new InternshipProgram(id, iName, 
                        domain, startDate, duration, idCompany, duties, 
                        qualifications, benefits, location, paid);
                programs.add(program);
            }
            return programs;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }
    
}
