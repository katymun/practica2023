/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.UserDAOIntf;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.utility.DateConverter;
import com.iucosoft.internshipappfx.utility.Role;
import java.time.LocalDate;
import java.util.Date;
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
public class UserDAOImplTest extends BaseDAOImplTest {
    
    private UserDAOIntf userDao;
    
    public UserDAOImplTest() {
        userDao = new UserDAOImpl();
    }

    /**
     * Test of save method, of class UserDAOImpl.
     */
    //@Test
    public void testSave() throws Exception {
        System.out.println("save");
        User user = new User("climatehnic","password100",DateConverter.getNowTime(), Role.RECRUITER);
        boolean expResult = true;
        boolean result = userDao.save(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class UserDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        LocalDate ld = LocalDate.of(2008,7,4);
        User user = new User(1, "munkatea", "new password", DateConverter.convert(ld), Role.ADMIN);
        boolean expResult = true;
        boolean result = userDao.update(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class UserDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        User user = userDao.findById(13);
        userDao.delete(user);
        int expResult = 12;
        int result = userDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class UserDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        int expResult = 13;
        int result = userDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findById method, of class UserDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idUser = 1;
        LocalDate ld = LocalDate.of(2008,7,4);
        User expResult = new User(1, "munkatea", "pass1", DateConverter.convert(ld), Role.ADMIN);
        User result = userDao.findById(idUser);
        assertEquals(expResult, result);
    }
    
}
