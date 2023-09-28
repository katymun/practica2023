package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicantDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Applicant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public List<Applicant> findAllApplicants() throws SQLException {
        return null;
    }

    @Override
    public Applicant findById(int idApplicant) throws SQLException {
        return null;
    }

    @Override
    public Applicant findByName(String applicantName) throws SQLException {
        return null;
    }
}
