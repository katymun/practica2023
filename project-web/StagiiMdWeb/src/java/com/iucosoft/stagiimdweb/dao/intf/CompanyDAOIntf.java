package com.iucosoft.stagiimdweb.dao.intf;

import com.iucosoft.stagiimdweb.entities.Company;
import java.sql.SQLException;

public interface CompanyDAOIntf extends GenericDAOIntf<Company> {
    Company findByName(String companyTitle) throws SQLException;
    
    //in compania returnata va fi info despre denumirea si datele imaginii
    Company getCompanyImage(int idCompany) throws SQLException;  
    boolean updateCompanyImage(int idCompany, String imagePath, byte[] imgData) throws SQLException;
}
