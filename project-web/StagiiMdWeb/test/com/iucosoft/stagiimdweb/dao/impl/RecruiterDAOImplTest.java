/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.entities.Applicant;
import com.iucosoft.stagiimdweb.entities.Company;
import com.iucosoft.stagiimdweb.entities.Recruiter;
import com.iucosoft.stagiimdweb.entities.User;
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
public class RecruiterDAOImplTest {
    
    public RecruiterDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findByName method, of class RecruiterDAOImpl.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String recruiterName = "";
        RecruiterDAOImpl instance = null;
        List<Applicant> expResult = null;
        List<Applicant> result = instance.findByName(recruiterName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class RecruiterDAOImpl.
     */
    @Test
    public void testSave_User_Recruiter() throws Exception {
        System.out.println("save");
        User user = null;
        Recruiter recruiter = null;
        RecruiterDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(user, recruiter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class RecruiterDAOImpl.
     */
    @Test
    public void testSave_Recruiter() throws Exception {
        System.out.println("save");
        Recruiter recruiter = null;
        RecruiterDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(recruiter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class RecruiterDAOImpl.
     */
    @Test
    public void testSave_3args() throws Exception {
        System.out.println("save");
        User user = null;
        Recruiter recruiter = null;
        Company company = null;
        RecruiterDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(user, recruiter, company);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RecruiterDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Recruiter recruiter = null;
        RecruiterDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.update(recruiter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RecruiterDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Recruiter recruiter = null;
        RecruiterDAOImpl instance = null;
        instance.delete(recruiter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class RecruiterDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        RecruiterDAOImpl instance = null;
        List<Recruiter> expResult = null;
        List<Recruiter> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class RecruiterDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idRecruiter = 0;
        RecruiterDAOImpl instance = null;
        Recruiter expResult = null;
        Recruiter result = instance.findById(idRecruiter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
