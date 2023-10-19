/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicantDAOIntf;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.utility.DateConverter;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.Role;
import com.iucosoft.internshipappfx.utility.Status;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author munka
 */
public class ApplicantDAOImplTest extends BaseDAOImplTest {
    
    private ApplicantDAOIntf applicantDao;
    
    public ApplicantDAOImplTest() {
        applicantDao = new ApplicantDAOImpl();
    }
    
    /**
     * Test of save method, of class ApplicantDAOImpl.
     */
//    @Test
//    public void testSave_Applicant() throws Exception {
//        System.out.println("save");
//        Applicant applicant = null;
//        boolean expResult = false;
//        boolean result = instance.save(applicant);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of update method, of class ApplicantDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Applicant applicant = new Applicant(1, "Elena", "Nidelcu", 19, Status.STUDENT, Domain.IT, "cv10.pdf", 4, "elena.nidelcu@gmail.com", "060123456");
        boolean expResult = true;
        boolean result = applicantDao.update(applicant);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class ApplicantDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Applicant applicant = applicantDao.findById(6);
        applicantDao.delete(applicant);
        int expResult = 5;
        int result = applicantDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findById method, of class ApplicantDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idApplicant = 1;
        Applicant expResult = new Applicant(1, "Elena", "Nidelcu", 19, Status.STUDENT, Domain.IT, "cv1.pdf", 4, "elena.nidelcu@isa.utm.md", "060123456");
        Applicant result = applicantDao.findById(idApplicant);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class ApplicantDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        int expResult = 6;
        int result = applicantDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of save method, of class ApplicantDAOImpl.
     */
    @Test
    public void testSave_User_Applicant() throws Exception {
        System.out.println("save");
        User user = new User("climatehnic", "password99", DateConverter.getNowTime(), Role.APPLICANT);
        Applicant applicant = new Applicant("Munteanu", "Vladimir", 49, Status.WORKING, Domain.ENGINEERING, "cv99.pdf", "climatehnic@gmail.com", "079783222");
        boolean expResult = true;
        boolean result = applicantDao.save(user, applicant);
        assertEquals(expResult, result);
    }

    /**
     * Test of findByName method, of class ApplicantDAOImpl.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String applicantName = "Elena";
        String applicantSurname = "Nidelcu";
        int expResult = 1;
        int result = applicantDao.findByName(applicantName, applicantSurname).size();
        assertEquals(expResult, result);
    }
    
}
