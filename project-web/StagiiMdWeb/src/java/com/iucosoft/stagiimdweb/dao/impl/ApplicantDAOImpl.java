package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.dao.intf.ApplicantDAOIntf;
import com.iucosoft.stagiimdweb.entities.Applicant;
import com.iucosoft.stagiimdweb.entities.User;
import com.iucosoft.stagiimdweb.sql.SQLS;
import com.iucosoft.stagiimdweb.utility.DateConverter;
import com.iucosoft.stagiimdweb.utility.Domain;
import com.iucosoft.stagiimdweb.utility.MyFile;
import com.iucosoft.stagiimdweb.utility.Status;
import com.iucosoft.stagiimdweb.utility.exceptions.ApplicantNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class ApplicantDAOImpl implements ApplicantDAOIntf {

    DataSource ds;
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    public ApplicantDAOImpl(javax.sql.DataSource ds) {
        this.ds = ds;
    }

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
            pstat.setInt(1, applicant.getAge());
            pstat.setString(2, applicant.getStatus().toString());
            pstat.setString(3, applicant.getDomain().toString());
            pstat.setString(4, applicant.getCvFile());
            pstat.setBytes(5, applicant.getFileBytes());
            pstat.setString(6, applicant.getEmail());
            pstat.setString(7, applicant.getPhoneNumber());
            pstat.setInt(8, applicant.getId());

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
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_APPLICANT_BY_ID);) {

            pstat.setInt(1, idApplicant);
            rs = pstat.executeQuery();
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
        } finally {
            if (rs != null) {
                rs.close();
            }
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
            pstat.setDate(3, DateConverter.convert(new Date()));
            pstat.setString(4, user.getRole().toString());

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
                    pstat2.setBytes(7, applicant.getFileBytes());
                    pstat2.setInt(8, applicant.getIdUser());
                    pstat2.setString(9, applicant.getEmail());
                    pstat2.setString(10, applicant.getPhoneNumber());

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
    public List<Applicant> findByName(String applicantName, String applicantSurname) throws SQLException {
        List<Applicant> applicants = new ArrayList<>();
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_APPLICANT_BY_NAME);) {

            pstat.setString(1, applicantName);
            pstat.setString(2, applicantSurname);
            rs = pstat.executeQuery();
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
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
        return applicants;
    }

    @Override
    public Applicant findByUserId(int idUser) throws SQLException {
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_APPLICANT_BY_USER_ID);) {

            pstat.setInt(1, idUser);
            rs = pstat.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                String aName = rs.getString(2);
                String aSurname = rs.getString(3);
                int age = rs.getInt(4);
                Status status = Status.valueOf(rs.getString(5));
                Domain domain = Domain.valueOf(rs.getString(6));
                String cvFile = rs.getString(7);
                byte[] fileBytes = rs.getBytes(8);
                String email = rs.getString(10);
                String phoneNumber = rs.getString(11);

                Applicant applicant = new Applicant(id, aName, aSurname, age, status, domain, cvFile, fileBytes, email, phoneNumber);
                return applicant;
            }
            throw new ApplicantNotFoundException("Find by idUser = " + idUser + " failed!");
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
    public List<MyFile> getFiles() throws SQLException {
        List<MyFile> files = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_APPLICANTS_FILES);) {

            while (rs.next()) {
                
                String cvFile = rs.getString(1);
                byte[] fileBytes = rs.getBytes(2);
                
                MyFile myFile = new MyFile(cvFile, fileBytes);
                System.out.println("myFile = " + myFile);
                files.add(myFile);
            }
            return files;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }
}
