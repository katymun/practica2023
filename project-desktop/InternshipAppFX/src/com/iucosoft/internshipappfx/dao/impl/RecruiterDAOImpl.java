package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.RecruiterDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Recruiter;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class RecruiterDAOImpl implements RecruiterDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    @Override
    public boolean save(Recruiter recruiter) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Recruiter recruiter) throws SQLException {
        return false;
    }

    @Override
    public void delete(Recruiter recruiter) throws SQLException {

    }

    @Override
    public List<Recruiter> findAllRecruiters() throws SQLException {
        return null;
    }

    @Override
    public Recruiter findById(int idRecruiter) throws SQLException {
        return null;
    }

    @Override
    public Recruiter findByName(String recruiterName) throws SQLException {
        return null;
    }
}
