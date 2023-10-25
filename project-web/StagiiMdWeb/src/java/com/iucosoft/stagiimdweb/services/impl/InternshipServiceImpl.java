/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.services.impl;

import com.iucosoft.stagiimdweb.dao.intf.CompanyDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.stagiimdweb.entities.Company;
import com.iucosoft.stagiimdweb.entities.InternshipProgram;
import com.iucosoft.stagiimdweb.services.InternshipServiceIntf;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munka
 */
public class InternshipServiceImpl implements InternshipServiceIntf {

//    private InternshipProgramDAOIntf internshipDao;
    private CompanyDAOIntf companyDao;
    
    @Override
    public Map<InternshipProgram, Company> getInternshipCompanyMap(List<InternshipProgram> internships) throws IOException {
        Map<InternshipProgram, Company> internshipCompanyMap = new LinkedHashMap<>();
        
        for (InternshipProgram internship : internships) {
            try {
                Company company = companyDao.findById(internship.getIdCompany());
                internshipCompanyMap.put(internship, company);
            } catch (SQLException ex) {
                Logger.getLogger(InternshipServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                throw new IOException(ex);
            }
            
        }
        
        return internshipCompanyMap;
    }

    @Override
    public Company getCompany(InternshipProgram internship) throws IOException {
        try {
            Company company = companyDao.findById(internship.getIdCompany());
            return company;
        } catch (SQLException ex) {
            Logger.getLogger(InternshipServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new IOException(ex);
        }
        
    }

//    public void setInternshipDao(InternshipProgramDAOIntf internshipDao) {
//        this.internshipDao = internshipDao;
//    }

    public void setCompanyDao(CompanyDAOIntf companyDao) {
        this.companyDao = companyDao;
    }
    
}
