/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

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
public class UserDAOImplTest {
    
    public UserDAOImplTest() {
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
     * Test of save method, of class UserDAOImpl.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        User t = null;
        UserDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        User user = null;
        UserDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.update(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UserDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        User user = null;
        UserDAOImpl instance = null;
        instance.delete(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class UserDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        UserDAOImpl instance = null;
        List<User> expResult = null;
        List<User> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class UserDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idUser = 0;
        UserDAOImpl instance = null;
        User expResult = null;
        User result = instance.findById(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
