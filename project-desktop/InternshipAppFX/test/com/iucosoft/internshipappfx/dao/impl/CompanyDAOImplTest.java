/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.utility.Domain;
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
public class CompanyDAOImplTest extends BaseDAOImplTest {
    
    //pentru fiecare punem interfata sa
    private CompanyDAOIntf companyDao;
    
    //C:\Users\munka\OneDrive\Documents\git-projects\practica-2023-faf\project-desktop\InternshipAppFX\src\com\iucosoft\internshipappfx\sql\backupfortest
    public CompanyDAOImplTest() {
        companyDao = new CompanyDAOImpl();
    }

    /**
     * Test of save method, of class CompanyDAOImpl.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Company company = new Company("titlu1", Domain.DESIGN, "good company", "098457608", "c@gmail.com", "img.jpg");
        boolean expResult = true;
        boolean result = companyDao.save(company);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class CompanyDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Company company = new Company(19, "company-title1", Domain.DESIGN, "good company for all people", "0984545868", "c@gmail.com", "img.jpg");
        boolean expResult = true;
        boolean result = companyDao.update(company);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class CompanyDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Company company = null;
        CompanyDAOImpl instance = new CompanyDAOImpl();
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
        CompanyDAOImpl instance = new CompanyDAOImpl();
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
        CompanyDAOImpl instance = new CompanyDAOImpl();
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
        CompanyDAOImpl instance = new CompanyDAOImpl();
        Company expResult = null;
        Company result = instance.findByName(companyTitle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
