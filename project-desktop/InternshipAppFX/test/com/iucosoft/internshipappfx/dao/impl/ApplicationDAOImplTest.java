/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.ApplicationDAOIntf;
import com.iucosoft.internshipappfx.entities.Application;
import com.iucosoft.internshipappfx.utility.DateConverter;
import com.iucosoft.internshipappfx.utility.Domain;
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
public class ApplicationDAOImplTest extends BaseDAOImplTest {
    
    private ApplicationDAOIntf applicationDao;
    
    public ApplicationDAOImplTest() {
        applicationDao = new ApplicationDAOImpl();
    }

    /**
     * Test of save method, of class ApplicationDAOImpl.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Application application = new Application(1, 1, DateConverter.convert(LocalDate.of(2023, 10, 10)), "cv1.pdf", "060123456", "elena.nidelcu@isa.utm.md");
        boolean expResult = true;
        boolean result = applicationDao.save(application);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class ApplicationDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Application application = new Application(1, 1, 1, DateConverter.convert(LocalDate.of(2023, 10, 10)), "cv10.pdf", "060123400", "elena.nidelcu@isa.utm.md");
        boolean expResult = true;
        boolean result = applicationDao.update(application);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class ApplicationDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Application application = applicationDao.findById(1);
        applicationDao.delete(application);
        int expResult = 4;
        int result = applicationDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findById method, of class ApplicationDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idApplication = 1;
        Application expResult = new Application(1, 1, 1, DateConverter.convert(LocalDate.of(2023, 10, 10)), "cv1.pdf", "060123456", "elena.nidelcu@isa.utm.md");
        Application result = applicationDao.findById(idApplication);
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class ApplicationDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        int expResult = 5;
        int result = applicationDao.findAll().size();
        assertEquals(expResult, result);
    }
    
}
