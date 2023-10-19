/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.db.StaticPropertyClass;
import com.iucosoft.internshipappfx.entities.Company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import org.apache.ibatis.jdbc.ScriptRunner;
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
public class BaseDAOImplTest {

    public BaseDAOImplTest() {
        ds = DataSource.getInstance();
    }
   
    protected static DataSource ds = null;
    protected Connection conn = null;
    protected static final Logger LOG = Logger.getLogger(BaseDAOImplTest.class.getName());
    String dir = "C:\\Users\\munka\\OneDrive\\Documents\\git-projects\\"
            + "practica-2023-faf\\project-desktop\\InternshipAppFX\\src\\com\\"
            + "iucosoft\\internshipappfx\\sql\\backupfortest\\";
    
    protected static boolean DEBUG_TEMP = false;

    @BeforeClass
    public static void setUpClass() {
        
        StaticPropertyClass.DEBUG = true;
    }

    @AfterClass
    public static void tearDownClass() {
        StaticPropertyClass.DEBUG = false;
    }

    @Before
    public void setUp() {
        try {
            conn = ds.getConnection();
            ScriptRunner sr = new ScriptRunner(conn);
            String sqlCreateSchema = dir + "createsqlstruct.sql";
            Reader readerSchema = new BufferedReader(new FileReader(sqlCreateSchema));
            sr.runScript(readerSchema);
            
            String sqlInsertData = dir + "sqldata.sql";
            Reader readerData = new BufferedReader(new FileReader(sqlInsertData));
            sr.runScript(readerData);

            System.out.println("Tabelul s-a creat!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
        } catch (FileNotFoundException ex) {
            LOG.severe(ex.toString());
        }

    }

    @After
    public void tearDown() {
//        try {
//            conn = instance.getConnection();
//            ScriptRunner sr = new ScriptRunner(conn);
//            String sqlDropSchema = dir + "java2dbdrop.sql";
//            Reader readerSchema = new BufferedReader(new FileReader(sqlDropSchema));
//            sr.runScript(readerSchema);
//            System.out.println("Tabelul s-a sters");
//        } catch (FileNotFoundException ex) {
//            LOG.severe(ex.toString());
//        } catch (SQLException ex) {
//            LOG.severe(ex.toString());
//        } 
    }

    /**
     * Test of save method, of class CompanyDAOImpl.
     */
    //@Test
    public void testSave() throws Exception {
        System.out.println("save");
        Company company = null;
        CompanyDAOImpl instance = new CompanyDAOImpl();
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
        CompanyDAOImpl instance = new CompanyDAOImpl();
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
    //@Test
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
