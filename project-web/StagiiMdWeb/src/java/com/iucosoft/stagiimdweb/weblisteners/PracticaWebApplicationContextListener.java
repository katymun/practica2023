/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.weblisteners;

import com.iucosoft.stagiimdweb.dao.impl.ApplicantDAOImpl;
import com.iucosoft.stagiimdweb.dao.impl.ApplicationDAOImpl;
import com.iucosoft.stagiimdweb.dao.impl.CompanyDAOImpl;
import com.iucosoft.stagiimdweb.dao.impl.InternshipProgramDAOImpl;
import com.iucosoft.stagiimdweb.dao.impl.RecruiterDAOImpl;
import com.iucosoft.stagiimdweb.dao.impl.SubscribeDAOImpl;
import com.iucosoft.stagiimdweb.dao.impl.UserDAOImpl;
import com.iucosoft.stagiimdweb.dao.intf.ApplicantDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.ApplicationDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.CompanyDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.RecruiterDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.SubscribeDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.UserDAOIntf;
import com.iucosoft.stagiimdweb.services.InternshipServiceIntf;
import com.iucosoft.stagiimdweb.services.impl.InternshipServiceImpl;
import com.iucosoft.stagiimdweb.utility.ImageUtil;
import com.iucosoft.stagiimdweb.utility.MyFile;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class PracticaWebApplicationContextListener implements ServletContextListener {

    private static final Logger LOG = Logger.getLogger(PracticaWebApplicationContextListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //obtin conexiunea la baza de date
        //creez obiectele dao/servicii si le pun in memoria aplicatiei
        ServletContext sc = sce.getServletContext();
        //de testare
        //sc.setAttribute("mainAttribute", "textulAtributului main");

        try {
            InitialContext ic = new InitialContext();  // JNDI initial context
            Context envContext = (Context) ic.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/practica"); // JNDI lookup
            if (ds != null) {
                System.out.println("DataSource is not null " + ds.toString());
            }
            sc.setAttribute("ds", ds);

            Connection conn = ds.getConnection();  // database connection through data source
            if (conn != null) {
                System.out.println("Connection is ok " + conn.toString());   //de inlocuit cu logger

            }

            CompanyDAOIntf companyDao = new CompanyDAOImpl(ds);
            sc.setAttribute("companyDao", companyDao);

            ApplicantDAOIntf applicantDao = new ApplicantDAOImpl(ds);
            sc.setAttribute("applicantDao", applicantDao);

            ApplicationDAOIntf applicationDao = new ApplicationDAOImpl(ds);
            sc.setAttribute("applicationDao", applicationDao);

            UserDAOIntf userDao = new UserDAOImpl(ds);
            sc.setAttribute("userDao", userDao);

            InternshipProgramDAOIntf internshipDao = new InternshipProgramDAOImpl(ds);
            sc.setAttribute("internshipDao", internshipDao);

            RecruiterDAOIntf recruiterDao = new RecruiterDAOImpl(ds);
            sc.setAttribute("recruiterDao", recruiterDao);

            InternshipServiceImpl internshipService = new InternshipServiceImpl();
            internshipService.setCompanyDao(companyDao);
//            internshipService.setInternshipDao(internshipDao);
            sc.setAttribute("internshipService", internshipService);

            SubscribeDAOIntf subscribeDao = new SubscribeDAOImpl(ds);
            sc.setAttribute("subscribeDao", subscribeDao);

//            ultimele doua randuri se repeta pentru toate clase dao/servicii
            //cod care restabileste fisierele din baza de date
            //restabilim cv-urile din pdf
            //1 extragem prin dao numele fisierului si continutul lui
            //2 pentru toate inregistrarile unde si numele si continutul nu sunt null
            //3 inscriem in mapa uploads fisierul cu datele respective cu imageUtil
            String path = sc.getRealPath("") + "uploads";
            List<MyFile> files = applicantDao.getFiles();

            for (MyFile myFile : files) {
                String fileName = myFile.getFileName();
                String fullPath = path + File.separator + fileName;
                ImageUtil.saveBytesToFile(myFile.getFileBytes(), fullPath);
            }

        } catch (SQLException se) {
            LOG.severe(se.toString());
        } catch (NamingException ne) {
            LOG.severe(ne.toString());
        } catch (IOException ex) {
            LOG.severe(ex.toString());
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //scoti toate obiectele din memoria aplicatiei

        ServletContext sc = sce.getServletContext();

        sc.removeAttribute("companyDao");
        sc.removeAttribute("applicantDao");
        sc.removeAttribute("applicationDao");
        sc.removeAttribute("userDao");
        sc.removeAttribute("internshipDao");
        sc.removeAttribute("recruiterDao");
        //de sters toate 6 dao
        DataSource ds = (DataSource) sc.getAttribute("ds");
        if (ds != null) {
            try {
                Connection conn = ds.getConnection();
                if (conn != null) {
                    conn.close();
                }

                sc.removeAttribute("ds");

            } catch (SQLException ex) {
                Logger.getLogger(PracticaWebApplicationContextListener.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //obtin conexiunea ca in metoda precendenta

        //faci remove la toate atributele pe care le-am pus in sce
    }
}
