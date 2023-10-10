package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicantDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.sql.SQLS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Logger;

public class ApplicantDAOImpl implements ApplicantDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    @Override
    public boolean save(Applicant applicant) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Applicant applicant) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.APPLICANTS_UPDATE);
            pstat.setString(1, applicant.getaName());
            pstat.setString(2, applicant.getaSurname());
            pstat.setInt(3, applicant.getAge());
            pstat.setString(4, applicant.getStatus().toString());
            pstat.setString(5, applicant.getDomain().toString());
            pstat.setString(6, applicant.getCvFile());
            pstat.setString(7, applicant.getEmail());
            pstat.setString(8, applicant.getPhoneNumber());

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
    public void delete(Applicant applicant) throws SQLException {
        PreparedStatement pstat = null;
        Connection conn = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.APPLICANTS_DELETE);
            pstat.setInt(1, applicant.getId());
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
    public Applicant findById(int idApplicant) throws SQLException {
        return null;
    }

    @Override
    public List<Applicant> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(User user, Applicant applicant) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;

        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.USERS_INSERT);
            conn.setAutoCommit(false);
            pstat.setString(1, user.getUsername());
            pstat.setString(2, user.getPassword());
            pstat.setDate(3, java.sql.Date.valueOf("2023-12-12"));

            int modificari = pstat.executeUpdate();
            int modificari2 = 0; // la salvarea aplicantului

            if (modificari > 0) {
                //aici vom optine id-ul userului si il vom adauga la applicant
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.SELECT_LAST_USER_ID);
                if (rs.next()) {
                    int userId = rs.getInt(1);
                    applicant.setIdUser(userId);

                    PreparedStatement pstat2 = conn.prepareStatement(SQLS.APPLICANTS_INSERT);
                    pstat2.setString(1, applicant.getaName());
                    pstat2.setString(2, applicant.getaSurname());
                    pstat2.setInt(3, applicant.getAge());
                    pstat2.setString(4, applicant.getStatus().toString());
                    pstat2.setString(5, applicant.getDomain().toString());
                    pstat2.setString(6, applicant.getCvFile());
                    pstat2.setInt(7, applicant.getIdUser());
                    pstat2.setString(8, applicant.getEmail());
                    pstat2.setString(9, applicant.getPhoneNumber());

                    modificari2 = pstat2.executeUpdate();
                }
            } else {
                conn.setAutoCommit(true);
                throw new SQLException("Eroare la crearea userului!");

            }
            conn.commit();
            conn.setAutoCommit(true);

            if (modificari2 > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            conn.rollback();
            return false;
        }
    }

    @Override
    public List<Applicant> findByName(String applicantName) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
