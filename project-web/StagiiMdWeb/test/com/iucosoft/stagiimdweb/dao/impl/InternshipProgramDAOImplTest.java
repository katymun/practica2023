/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.entities.InternshipProgram;
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
public class InternshipProgramDAOImplTest {
    
    public InternshipProgramDAOImplTest() {
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
     * Test of save method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        InternshipProgram internshipProgram = null;
        InternshipProgramDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(internshipProgram);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        InternshipProgram internshipProgram = null;
        InternshipProgramDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.update(internshipProgram);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        InternshipProgram internshipProgram = null;
        InternshipProgramDAOImpl instance = null;
        instance.delete(internshipProgram);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        InternshipProgramDAOImpl instance = null;
        List<InternshipProgram> expResult = null;
        List<InternshipProgram> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idInternshipProgram = 0;
        InternshipProgramDAOImpl instance = null;
        InternshipProgram expResult = null;
        InternshipProgram result = instance.findById(idInternshipProgram);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
