package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Company;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class CompanyDAOImpl implements CompanyDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());
    @Override
    public boolean save(Company company) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Company company) throws SQLException {
        return false;
    }

    @Override
    public void delete(Company company) throws SQLException {

    }

    @Override
    public List<Company> findAllCompanies() throws SQLException {
        return null;
    }

    @Override
    public Company findById(int idCompany) throws SQLException {
        return null;
    }

    @Override
    public Company findByName(String companyName) throws SQLException {
        return null;
    }
}
