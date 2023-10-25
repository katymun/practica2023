/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.services;

import com.iucosoft.stagiimdweb.entities.Company;
import com.iucosoft.stagiimdweb.entities.InternshipProgram;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author munka
 */
public interface InternshipServiceIntf {
    Map<InternshipProgram, Company> getInternshipCompanyMap(List<InternshipProgram> internships) throws IOException;
    Company getCompany(InternshipProgram internship) throws IOException;
    
}
