package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.dao.intf.RecruiterDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.Recruiter;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.sql.SQLS;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.exceptions.CompanyNotFoundException;
import com.iucosoft.internshipappfx.utility.exceptions.RecruiterNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class RecruiterDAOImpl implements RecruiterDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    @Override
    public List<Applicant> findByName(String recruiterName) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(User user, Recruiter recruiter) throws SQLException {
//        Connection conn = null;
//        PreparedStatement pstat = null;
//        CompanyDAOIntf companyDao = null;
//             
//        try {
//            conn = ds.getConnection();
//            pstat = conn.prepareStatement(SQLS.USERS_INSERT);
//            conn.setAutoCommit(false);
//            pstat.setString(1, user.getUsername());
//            pstat.setString(2, user.getPassword());
//            pstat.setDate(3, java.sql.Date.valueOf("2023-12-24"));
//            pstat.executeUpdate();
//            //user.getRegistDate().toString()
//            int modificari = 0; // la salvarea recruiterului
//            Statement stat = conn.createStatement();
//            ResultSet rs = stat.executeQuery(SQLS.SELECT_LAST_USER_ID);
//            if (rs.next()) {
//                System.out.println("rs");
//                int userId = rs.getInt(1);
//                System.out.println(userId + " user id nou salvat");
//                recruiter.setIdUser(userId);
//                    //De adaugat company id !!!
//                Statement stat2 = conn.createStatement();
//                ResultSet rs2 = stat2.executeQuery(SQLS.SELECT_LAST_COMPANY_ID);
//                
//                if (rs2.next()) {
//                    System.out.println("rs2");
//                    int companyId = rs2.getInt(1);
//                    recruiter.setIdCompany(companyId);
//                    
//                    PreparedStatement pstat2 = conn.prepareStatement(SQLS.RECRUITERS_INSERT);
//                    pstat2.setString(1, recruiter.getRName());
//                    pstat2.setString(2, recruiter.getRSurname());
//                    pstat2.setInt(3, recruiter.getIdCompany());
//                    System.out.println(companyId);
//                    pstat2.setInt(4, recruiter.getIdUser());
//
//                    pstat2.setString(5, recruiter.getEmail());
//
//                    pstat2.executeUpdate();
//                } else {
//                    conn.setAutoCommit(true);
//                    throw new SQLException("Eroare la crearea userului!");
//                }
//            } else {
//                conn.setAutoCommit(true);
//                throw new SQLException("Eroare la crearea userului!");
//                
//            }       
//            conn.commit();
//            conn.setAutoCommit(true);
//            
//            if (modificari > 0) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (Exception ex) {
//            LOG.severe(ex.toString());
//            conn.rollback();
//            return false;
//        }
        return false;
    }

    @Override
    public boolean save(Recruiter recruiter) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean save(User user, Recruiter recruiter, Company company) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;

        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.USERS_INSERT);
            conn.setAutoCommit(false);
            pstat.setString(1, user.getUsername());
            pstat.setString(2, user.getPassword());
            pstat.setDate(3, java.sql.Date.valueOf("2023-12-24"));
            pstat.executeUpdate();
            //conn.commit();
            //user.getRegistDate().toString()
            int modificari = 0; // la salvarea recruiterului
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(SQLS.SELECT_LAST_USER_ID);
            if (rs.next()) {
                System.out.println("rs");
                int userId = rs.getInt(1);
                recruiter.setIdUser(userId);
                //De adaugat company id !!!

                pstat = conn.prepareStatement(SQLS.COMPANIES_INSERT);
                pstat.setString(1, company.getTitle());
                pstat.setString(2, company.getDomain().toString());
                pstat.setString(3, company.getAbout());
                pstat.setString(4, company.getPhoneNumber());
                pstat.setString(5, company.getEmail());

                pstat.executeUpdate();
                //conn.commit();

                Statement stat2 = conn.createStatement();
                ResultSet rs2 = stat2.executeQuery(SQLS.SELECT_LAST_COMPANY_ID);

                if (rs2.next()) {
                    int companyId = rs2.getInt(1);
                    recruiter.setIdCompany(companyId);

                    pstat = conn.prepareStatement(SQLS.RECRUITERS_INSERT);
                    pstat.setString(1, recruiter.getRName());
                    pstat.setString(2, recruiter.getRSurname());
                    pstat.setInt(3, recruiter.getIdUser());
                    pstat.setInt(4, recruiter.getIdCompany());
                    pstat.setString(5, recruiter.getEmail());

                    pstat.executeUpdate();
//                    conn.commit();
                } else {
                    conn.setAutoCommit(true);
                    throw new SQLException("Eroare la crearea userului!");
                }
            } else {
                conn.setAutoCommit(true);
                throw new SQLException("Eroare la crearea userului!");

            }
            conn.commit();
            conn.setAutoCommit(true);

            if (modificari > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            conn.rollback();
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Recruiter recruiter) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.RECRUITERS_UPDATE);
            pstat.setString(1, recruiter.getRName());
            pstat.setString(2, recruiter.getRSurname());
            pstat.setString(3, recruiter.getEmail());

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
    public void delete(Recruiter recruiter) throws SQLException {
        PreparedStatement pstat = null;
        Connection conn = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.RECRUITERS_DELETE);
            pstat.setInt(1, recruiter.getId());
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
    public List<Recruiter> findAll() throws SQLException {
        List<Recruiter> recruiters = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_RECRUITERS);) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String rName = rs.getString(2);
                String rSurname = rs.getString(3);
                int idCompany = rs.getInt(4);
                int idUser = rs.getInt(5);
                String email = rs.getString(6);

                Recruiter recruiter = new Recruiter(id, rName, rSurname, idCompany, idUser, email);
                recruiters.add(recruiter);
            }
            return recruiters;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

    @Override
    public Recruiter findById(int idRecruiter) throws SQLException {
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_RECRUITER_BY_ID)) {

            if (rs.next()) {
                int id = rs.getInt(1);
                String rName = rs.getString(2);
                String rSurname = rs.getString(3);
                int idCompany = rs.getInt(4);
                int idUser = rs.getInt(5);
                String email = rs.getString(6);

                Recruiter recruiter = new Recruiter(id, rName, rSurname, idCompany, idUser, email);
                return recruiter;
            }
            throw new RecruiterNotFoundException("Find by id = " + idRecruiter + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

}
