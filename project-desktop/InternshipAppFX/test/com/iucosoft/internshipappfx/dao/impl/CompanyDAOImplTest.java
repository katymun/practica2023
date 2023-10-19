/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.ImageUtil;
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
        byte[] data = {1, 2, 3, 4};
        Company company = new Company("Climatehnic SRL", Domain.ENGINEERING, "Air conditioneeing and warming solutions", "079783222", "climatehnicmd@gmail.com", "img6.jpg");
        company.setImgData(data);
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
        Company company = new Company(1, "IUCOSOFT", Domain.IT, "We work in JAVA", "060111111", "iurie.coropceanu@iucosoft.com", "img10.jpg");
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
        Company company = companyDao.findById(6);
        companyDao.delete(company);
        int expResult = 5;
        int result = companyDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        int expResult = 6;
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
        int idCompany = 1;
        Company expResult = new Company(1, "IUCOSOFT", Domain.IT, "We work in JAVA", "060111111", "email@iucosoft.com", "img1.png");
        Company result = companyDao.findById(idCompany);
        assertEquals(expResult, result);
    }

    /**
     * Test of findByName method, of class CompanyDAOImpl.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String companyTitle = "IUCOSOFT";
        Company expResult = new Company(1, "IUCOSOFT", Domain.IT, "We work in JAVA", "060111111", "email@iucosoft.com", "img1.png");
        Company result = companyDao.findByName(companyTitle);
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCompanyImage method, of class CompanyDAOImpl.
     */
    @Test
    public void testGetCompanyImage() throws Exception {
        System.out.println("getCompanyImage");
        
        
        
        int idCompany = 1;
        String imagePath = "img2.png";
        String title = "IUCOSOFT";
        Company expResult = new Company();
        expResult.setId(1);
        expResult.setTitle(title);
        expResult.setImagePath(imagePath);
        expResult.setImgData(ImageUtil.readImageData(expResult.getImagePath()));
        
        byte[] imgData = ImageUtil.readImageData(imagePath);
//        String imgDataFile = 
        String s = new String(imgData);
        
        System.out.println("????????????" + s);
        companyDao.updateCompanyImage(idCompany, imagePath, imgData);
        
        Company result = companyDao.getCompanyImage(idCompany);
        assertEquals("IUCOSOFT", result.getTitle());
        assertEquals("img2.png", result.getImagePath());
        assertArrayEquals(expResult.getImgData(), result.getImgData());
    }

    /**
     * Test of updateCompanyImage method, of class CompanyDAOImpl.
     */
    @Test
    public void testUpdateCompanyImage() throws Exception {
        System.out.println("updateCompanyImage");
        int idCompany = 1;
        String imagePath = "img2.png";
        
        byte[] imgData = ImageUtil.readImageData(imagePath);
        String s = new String(imgData);
        System.out.println("????????????" + s);
        boolean expResult = true;
        boolean result = companyDao.updateCompanyImage(idCompany, imagePath, imgData);
        assertEquals(expResult, result);
    }
    
}
