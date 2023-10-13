/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.entities.Application;
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
public class ApplicationDAOImplTest {
    
    public ApplicationDAOImplTest() {
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
     * Test of save method, of class ApplicationDAOImpl.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Application application = null;
        ApplicationDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(application);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ApplicationDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Application application = null;
        ApplicationDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.update(application);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ApplicationDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Application application = null;
        ApplicationDAOImpl instance = null;
        instance.delete(application);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class ApplicationDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idApplication = 0;
        ApplicationDAOImpl instance = null;
        Application expResult = null;
        Application result = instance.findById(idApplication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class ApplicationDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        ApplicationDAOImpl instance = null;
        List<Application> expResult = null;
        List<Application> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
