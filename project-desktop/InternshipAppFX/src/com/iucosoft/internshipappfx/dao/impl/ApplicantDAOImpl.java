package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicantDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.sql.SQLS;
import com.iucosoft.internshipappfx.utility.DateConverter;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.Status;
import com.iucosoft.internshipappfx.utility.exceptions.ApplicantNotFoundException;
import com.iucosoft.internshipappfx.utility.exceptions.CompanyNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_APPLICANT_BY_ID);) {

            if (rs.next()) {
                int id = rs.getInt(1);
                String aName = rs.getString(2);
                String aSurname = rs.getString(3);
                int age = rs.getInt(4);
                Status status = Status.valueOf(rs.getString(5));
                Domain domain = Domain.valueOf(rs.getString(6));
                String cvFile = rs.getString(7);
                int idUser = rs.getInt(8);
                String email = rs.getString(9);
                String phoneNumber = rs.getString(10);

                Applicant applicant = new Applicant(id, aName, aSurname, age, status, domain, cvFile, idUser, email, phoneNumber);
                return applicant;
            }
            throw new ApplicantNotFoundException("Find by id = " + idApplicant + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }   
    }

    @Override
    public List<Applicant> findAll() throws SQLException {
        List<Applicant> applicants = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_APPLICANTS);) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String aName = rs.getString(2);
                String aSurname = rs.getString(3);
                int age = rs.getInt(4);
                Status status = Status.valueOf(rs.getString(5));
                Domain domain = Domain.valueOf(rs.getString(6));
                String cvFile = rs.getString(7);
                int idUser = rs.getInt(8);
                String email = rs.getString(9);
                String phoneNumber = rs.getString(10);

                Applicant applicant = new Applicant(id, aName, aSurname, age, status, domain, cvFile, idUser, email, phoneNumber);
                applicants.add(applicant);
            }
            return applicants;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
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
            pstat.setDate(3, DateConverter.convert(user.getRegistDate()));
            pstat.setString(4, user.getRole().toString());
            System.out.println("rolul userului - " + user.getRole().toString());
            
            int modificari = pstat.executeUpdate();
            System.out.println("Modificari = " + modificari);
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
            ex.getStackTrace();
            conn.rollback();
            return false;
        }
    }

    @Override
    public List<Applicant> findByName(String applicantName) throws SQLException {
        List<Applicant> applicants = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_APPLICANT_BY_NAME);
                ResultSet rs = pstat.executeQuery();) {

            pstat.setString(1, applicantName);

            while (rs.next()) {
                int id = rs.getInt(1);
                String aName = rs.getString(2);
                String aSurname = rs.getString(3);
                int age = rs.getInt(4);
                Status status = Status.valueOf(rs.getString(5));
                Domain domain = Domain.valueOf(rs.getString(6));
                String cvFile = rs.getString(7);
                int idUser = rs.getInt(8);
                String email = rs.getString(9);
                String phoneNumber = rs.getString(10);

                Applicant applicant = new Applicant(id, aName, aSurname, age, status, domain, cvFile, idUser, email, phoneNumber);
                applicants.add(applicant);
            }
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
        return applicants;
    }
}
