/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.entities.Applicant;
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
public class ApplicantDAOImplTest {
    
    public ApplicantDAOImplTest() {
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
     * Test of save method, of class ApplicantDAOImpl.
     */
    @Test
    public void testSave_Applicant() throws Exception {
        System.out.println("save");
        Applicant applicant = null;
        ApplicantDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(applicant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ApplicantDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Applicant applicant = null;
        ApplicantDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.update(applicant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ApplicantDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Applicant applicant = null;
        ApplicantDAOImpl instance = null;
        instance.delete(applicant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class ApplicantDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idApplicant = 0;
        ApplicantDAOImpl instance = null;
        Applicant expResult = null;
        Applicant result = instance.findById(idApplicant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ApplicantDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        ApplicantDAOImpl instance = null;
        List<Applicant> expResult = null;
        List<Applicant> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class ApplicantDAOImpl.
     */
    @Test
    public void testSave_User_Applicant() throws Exception {
        System.out.println("save");
        User user = null;
        Applicant applicant = null;
        ApplicantDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(user, applicant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByName method, of class ApplicantDAOImpl.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String applicantName = "";
        ApplicantDAOImpl instance = null;
        List<Applicant> expResult = null;
        List<Applicant> result = instance.findByName(applicantName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
