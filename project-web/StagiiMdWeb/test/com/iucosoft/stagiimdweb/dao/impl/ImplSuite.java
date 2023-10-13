/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author munka
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.iucosoft.stagiimdweb.dao.impl.ApplicantDAOImplTest.class, com.iucosoft.stagiimdweb.dao.impl.ApplicationDAOImplTest.class, com.iucosoft.stagiimdweb.dao.impl.InternshipProgramDAOImplTest.class, com.iucosoft.stagiimdweb.dao.impl.RecruiterDAOImplTest.class, com.iucosoft.stagiimdweb.dao.impl.UserDAOImplTest.class, com.iucosoft.stagiimdweb.dao.impl.CompanyDAOImplTest.class})
public class ImplSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
