package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Company;

import java.sql.SQLException;
import java.util.List;

public interface CompanyDAOIntf extends GenericDAOIntf<Company> {
    Company findByName(String companyTitle) throws SQLException;
    
}
