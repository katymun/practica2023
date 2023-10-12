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
import com.iucosoft.internshipappfx.utility.DateConverter;
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
        ApplicantDAOIntf applicantDao = new ApplicantDAOImpl();
        User user = new User("user15", "p1", DateConverter.getNowTime(), Role.APPLICANT);
        Applicant applicant = new Applicant("applicant1", "surname1", 20, Status.STUDENT, Domain.DESIGN, "cvFile1", "a1@gmail.com", "94376-2983");
        applicantDao.save(user, applicant);

        
    }
}
