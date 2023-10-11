/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx;

import com.iucosoft.internshipappfx.dao.impl.ApplicantDAOImpl;
import com.iucosoft.internshipappfx.dao.impl.CompanyDAOImpl;
import com.iucosoft.internshipappfx.dao.impl.RecruiterDAOImpl;
import com.iucosoft.internshipappfx.dao.intf.ApplicantDAOIntf;
import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.dao.intf.RecruiterDAOIntf;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.Recruiter;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.Role;
import com.iucosoft.internshipappfx.utility.Status;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author munka
 */
public class Demo {
    public static void main(String[] args) throws SQLException {

        CompanyDAOIntf compDao = new CompanyDAOImpl();
        RecruiterDAOIntf recruiterDao = new RecruiterDAOImpl();
        Recruiter recruiter = new Recruiter("Vasile1", "Rotaru1", "vr@example.com");
        User user = new User("user13", "passw5", Role.RECRUITER);
        Company comp = new Company("comp13", Domain.DESIGN, "good company", "129348765", "comp1@example.com");
        recruiterDao.save(user, recruiter, comp);
        
        
                
        
        
        
    }
}
