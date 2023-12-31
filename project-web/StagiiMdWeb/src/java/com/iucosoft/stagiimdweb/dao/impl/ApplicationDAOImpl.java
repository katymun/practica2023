package com.iucosoft.stagiimdweb.dao.impl;


import com.iucosoft.stagiimdweb.dao.intf.ApplicationDAOIntf;
import com.iucosoft.stagiimdweb.entities.Application;
import com.iucosoft.stagiimdweb.sql.SQLS;
import com.iucosoft.stagiimdweb.utility.DateConverter;
import com.iucosoft.stagiimdweb.utility.exceptions.ApplicationNotFoundException;
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

public class ApplicationDAOImpl implements ApplicationDAOIntf {

    DataSource ds;
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    public ApplicationDAOImpl(javax.sql.DataSource ds) {
        this.ds = ds;   
    }
    

    @Override
    public boolean save(Application application) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;

        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.APPLICATIONS_INSERT);
            pstat.setInt(1, application.getIdApplicant());
            pstat.setInt(2, application.getIdInternship());
            pstat.setDate(3, DateConverter.convert(application.getApplicationDate()));
            pstat.setString(4, application.getCvFile());
            pstat.setString(5, application.getPhoneNumber());
            pstat.setString(6, application.getEmail());
            pstat.setString(7, application.getInstitution());
            
            int modificari = pstat.executeUpdate();

            if (modificari > 0) {
                return true;
            } else {
                throw new SQLException("Eroare la crearea aplicarii!");
            }
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            return false;
        }
    }

    @Override
    public boolean update(Application application) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.APPLICATIONS_UPDATE);
            pstat.setString(1, application.getCvFile());
            pstat.setString(2, application.getPhoneNumber());
            pstat.setString(3, application.getEmail());
            pstat.setInt(4, application.getId());

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
    public Application findById(int idApplication) throws SQLException {
        ResultSet rs = null;
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_APPLICATION_BY_ID);) {
            pstat.setInt(1, idApplication);
            rs = pstat.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                int idApplicant = rs.getInt(2);
                int idInternship = rs.getInt(3);
                Date applicationDate = DateConverter.convert(rs.getDate(4));
                String cvFile = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String email = rs.getString(7);

                Application application = new Application(id, idApplicant, idInternship, applicationDate, cvFile, phoneNumber, email);
                return application;
            }
            throw new ApplicationNotFoundException("Find by id = " + idApplication + " failed!");
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
    public List<Application> findAll() throws SQLException {
        List<Application> applications = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();) {
            ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_APPLICATIONS);

            while (rs.next()) {
                int id = rs.getInt(1);
                int idApplicant = rs.getInt(2);
                int idInternship = rs.getInt(3);
                Date applicationDate = DateConverter.convert(rs.getDate(4));
                String cvFile = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String email = rs.getString(7);

                Application application = new Application(id, idApplicant, idInternship, applicationDate, cvFile, phoneNumber, email);
                applications.add(application);
            }
            return applications;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }
}
