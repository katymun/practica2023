package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Company;

import java.sql.SQLException;
import java.util.List;

public interface CompanyDAOIntf {
    boolean save(Company company) throws SQLException;
    boolean update(Company company) throws SQLException;
    void delete(Company company) throws SQLException;
    List<Company> findAllCompanies() throws SQLException;
    Company findById(int idCompany) throws SQLException;
    Company findByName(String companyName) throws SQLException;
}
