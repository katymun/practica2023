package com.iucosoft.stagiimdweb.dao.intf;

import com.iucosoft.stagiimdweb.entities.Company;
import java.sql.SQLException;

public interface CompanyDAOIntf extends GenericDAOIntf<Company> {
    Company findByName(String companyTitle) throws SQLException;
    
}
