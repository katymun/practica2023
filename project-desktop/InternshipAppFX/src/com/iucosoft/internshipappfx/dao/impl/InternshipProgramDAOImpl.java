package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.InternshipProgram;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class InternshipProgramDAOImpl implements InternshipProgramDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    @Override
    public boolean save(InternshipProgram internshipProgram) throws SQLException {
        return false;
    }

    @Override
    public boolean update(InternshipProgram internshipProgram) throws SQLException {
        return false;
    }

    @Override
    public void delete(InternshipProgram internshipProgram) throws SQLException {

    }

    @Override
    public List<InternshipProgram> findAllInternshipPrograms() throws SQLException {
        return null;
    }

    @Override
    public InternshipProgram findById(int idInternshipProgram) throws SQLException {
        return null;
    }

    @Override
    public InternshipProgram findByName(String internshipProgramName) throws SQLException {
        return null;
    }
}
