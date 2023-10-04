package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicantDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.User;

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
        String sql = "INSERT INTO useri (login, password, data_conexiunii, id_curs, id_persoana) VALUES(?, ?, ?, ?, ?)";

        try (Connection conn = ds.getConnection();
             PreparedStatement pstat = conn.prepareStatement(sql);) {
            conn.setAutoCommit(true);
            pstat.setString(1, applicant.getaName());
            pstat.setString(2, applicant.getaSurname());
            pstat.setInt(3, applicant.getAge());
            pstat.setString(4, applicant.getStatus().toString());
            pstat.setInt(5, applicant.getId_persoana());

            int modificari = pstat.executeUpdate();
            System.out.println("Save done " + applicant.getUsername());
            if (modificari > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            return false;
        }
    }

    @Override
    public boolean update(Applicant applicant) throws SQLException {
        return false;
    }

    @Override
    public void delete(Applicant applicant) throws SQLException {

    }

    @Override
    public Applicant findById(int idApplicant) throws SQLException {
        return null;
    }

    @Override
    public Applicant findByName(String applicantName) throws SQLException {
        return null;
    }

    @Override
    public List<Applicant> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(User user, Applicant applicant) throws SQLException {
        String sqlUserInsert = "INSERT INTO users VALUES (NULL, ?, ?, ?)";
        String sqlSelectLastUserId = "SELECT MAX(id) FROM users";
        String sqlApplicantInsert = "INSERT INTO applicants VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement pstat = null;
             
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(sqlUserInsert);
            conn.setAutoCommit(false);
            pstat.setString(1, applicant.getaName());
            pstat.setString(2, applicant.getaSurname());
            pstat.setInt(3, applicant.getAge());
            pstat.setString(4, applicant.getStatus().toString());

            int modificari = pstat.executeUpdate();
            conn.commit();
            
            int modificari2 = 0; // la salvarea aplicantului
            System.out.println("Save done " + applicant.getUsername());
            
            if (modificari > 0) {
                //aici vom optine id-ul userului si il vom adauga la applicant
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sqlSelectLastUserId);
                conn.commit(); //de verificat daca merge fara dansul
                if (rs.next()) {
                    int userId = rs.getInt(1);
                    
                    applicant.setIdUser(userId);
                    
                    PreparedStatement pstat2 = conn.prepareStatement(sqlApplicantInsert);
                    pstat2.setString(1, applicant.getaName());
                    // asa le scrii pe toate
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
}
