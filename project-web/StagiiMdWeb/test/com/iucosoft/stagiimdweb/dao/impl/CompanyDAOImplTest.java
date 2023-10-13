/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.entities.Company;
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
public class CompanyDAOImplTest {
    
    public CompanyDAOImplTest() {
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
     * Test of save method, of class CompanyDAOImpl.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Company company = null;
        CompanyDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.save(company);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CompanyDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Company company = null;
        CompanyDAOImpl instance = null;
        boolean expResult = false;
        boolean result = instance.update(company);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CompanyDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Company company = null;
        CompanyDAOImpl instance = null;
        instance.delete(company);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        CompanyDAOImpl instance = null;
        List<Company> expResult = null;
        List<Company> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idCompany = 0;
        CompanyDAOImpl instance = null;
        Company expResult = null;
        Company result = instance.findById(idCompany);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByName method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String companyTitle = "";
        CompanyDAOImpl instance = null;
        Company expResult = null;
        Company result = instance.findByName(companyTitle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
