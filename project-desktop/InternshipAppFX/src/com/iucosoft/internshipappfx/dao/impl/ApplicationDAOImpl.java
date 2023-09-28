package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicationDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Application;

import java.sql.SQLException;
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

    }

    @Override
    public List<Application> findAllApplications() throws SQLException {
        return null;
    }

    @Override
    public Application findById(int idApplication) throws SQLException {
        return null;
    }

    @Override
    public Application findByName(String applicationName) throws SQLException {
        return null;
    }
}
