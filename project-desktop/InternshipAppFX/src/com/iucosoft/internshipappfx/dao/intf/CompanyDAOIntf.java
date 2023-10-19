package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Company;

import java.sql.SQLException;
import java.util.List;

public interface CompanyDAOIntf extends GenericDAOIntf<Company> {
    Company findByName(String companyTitle) throws SQLException;
    
    //in compania returnata va fi info despre denumirea si datele imaginii
    Company getCompanyImage(int idCompany) throws SQLException;  
    boolean updateCompanyImage(int idCompany, String imagePath, byte[] imgData) throws SQLException;
    
    
}
