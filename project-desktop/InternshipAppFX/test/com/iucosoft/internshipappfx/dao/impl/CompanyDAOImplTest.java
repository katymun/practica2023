/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.exceptions.CompanyNotFoundException;
import java.time.LocalDate;
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
        Company company = new Company(2,"t3",Domain.EDUCATION,"about3","203984567","c3@gmail.com",null);
        
    }

    /**
     * Test of findAll method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        int expResult = 12;
        List<Company> allCompanies = companyDao.findAll();
        int result = allCompanies.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findById method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idCompany = 19;
        Company expResult = new Company(19, "company-title1", Domain.DESIGN, "good company 1", "203985723", "company1@example.com", "img.img");
        Company result = companyDao.findById(idCompany);
        assertEquals(expResult, result);
    }

    /**
     * Test of findByName method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String companyTitle = "company-title1";
        Company expResult = new Company(19, "company-title1", Domain.DESIGN, "good company 1", "203985723", "company1@example.com", "img.img");
        Company result = companyDao.findByName(companyTitle);
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
