/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.InternshipProgram;
import com.iucosoft.internshipappfx.utility.DateConverter;
import com.iucosoft.internshipappfx.utility.Domain;
import java.time.LocalDate;
import java.time.Month;
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
public class InternshipProgramDAOImplTest extends BaseDAOImplTest {
    
    private InternshipProgramDAOIntf programDao;
    
    public InternshipProgramDAOImplTest() {
        programDao = new InternshipProgramDAOImpl();
    }

    /**
     * Test of save method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Date startDate = DateConverter.convert(LocalDate.of(2020, Month.MARCH, 5));
        InternshipProgram program = new InternshipProgram("JAVA Developer", Domain.IT, startDate, "3 months", 1, "Develop desktop apps", "Know JAVA well", "Work remotely", "ONLINE", false);
        boolean expResult = true;
        boolean result = programDao.save(program);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Date startDate = DateConverter.convert(LocalDate.of(2020, Month.MARCH, 5));
        InternshipProgram program = new InternshipProgram(1, "JAVA Developer", Domain.IT, startDate, "2 months", 1, "Develop desktop apps", "Know JAVA very well", "Work remotely or in a good office", "ONLINE", false);
        boolean expResult = true;
        boolean result = programDao.update(program);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        InternshipProgram internshipProgram = programDao.findById(6);
        programDao.delete(internshipProgram);
        int expResult = 5;
        int result = programDao.findAll().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of findAll method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        InternshipProgramDAOImpl instance = new InternshipProgramDAOImpl();
        int expResult = 6;
        List<InternshipProgram> allPrograms = programDao.findAll();
        int result = allPrograms.size();
        assertEquals(expResult, result);

    }    
        
    /**
     * Test of findById method, of class InternshipProgramDAOImpl.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        int idInternshipProgram = 1;
        Date startDate = DateConverter.convert(LocalDate.of(2020, Month.MARCH, 5));
        InternshipProgram expResult = new InternshipProgram(1, "JAVA Developer", Domain.IT, startDate, "3 months", 1, "Develop desktop apps", "Know JAVA well", "Work remotely", "ONLINE", false);
        InternshipProgram result = programDao.findById(idInternshipProgram);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFindAllByCompanyId() throws Exception {
        System.out.println("findAllByCompanyId");
        InternshipProgramDAOImpl instance = new InternshipProgramDAOImpl();
        int expResult = 1;
        List<InternshipProgram> allPrograms = programDao.findAllByCompanyId(1);
        int result = allPrograms.size();
        assertEquals(expResult, result);

    }    
    
    @Test
    public void testFindAllByDomain() throws Exception {
        System.out.println("findAllByDomain");
        InternshipProgramDAOImpl instance = new InternshipProgramDAOImpl();
        int expResult = 1;
        List<InternshipProgram> allPrograms = programDao.findAllByDomain(Domain.IT);
        int result = allPrograms.size();
        assertEquals(expResult, result);
    }    
    
}
