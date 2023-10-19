/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.RecruiterDAOIntf;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.Recruiter;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.utility.DateConverter;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.Role;
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
public class RecruiterDAOImplTest extends BaseDAOImplTest {
    
    private RecruiterDAOIntf recruiterDao;
    
    public RecruiterDAOImplTest() {
        recruiterDao = new RecruiterDAOImpl();
    }

    /**
     * Test of findByName method, of class RecruiterDAOImpl.
     */
    @Test
    public void testFindByName() throws Exception {
        System.out.println("findByName");
        String recruiterName = "Iurie";
        String recruiterSurname = "Coropceanu";
        int expResult = 1;
        int result = recruiterDao.findByName(recruiterName, recruiterSurname).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of save method, of class RecruiterDAOImpl.
     */
    @Test
    public void testSave_3args() throws Exception {
        System.out.println("save cu 3 arg");
        User user = new User("climatehnic2", "password992", DateConverter.getNowTime(), Role.APPLICANT);
        Recruiter recruiter = new Recruiter("Munteanu2", "Ecaterina2", "munteanu.vladimir2@gmail.com");
        Company company = new Company("Climatehnic SRL2", Domain.ENGINEERING, "A good engineering company2", "079783222", "climatehnicmd2@gmail.com", "climatehnic2.jpg");
        boolean expResult = true;
        boolean result = recruiterDao.save(user, recruiter, company);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class RecruiterDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Recruiter recruiter = new Recruiter(3, "Iurie", "Coropceanu", 7, 1, "iurie.coropceanu@gmail.com");
        boolean expResult = true;
        boolean result = recruiterDao.update(recruiter);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class RecruiterDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Recruiter recruiter = recruiterDao.findById(1);
        recruiterDao.delete(recruiter);
        int expResult = 4;
        int result = recruiterDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class RecruiterDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        int expResult = 5;
        int result = recruiterDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findById method, of class RecruiterDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idRecruiter = 3;
        Recruiter expResult = new Recruiter(3, "Iurie", "Coropceanu", 7, 1, "iurie.coropceanu@iucosoft.com");
        Recruiter result = recruiterDao.findById(idRecruiter);
        assertEquals(expResult, result);
    }
    
}
