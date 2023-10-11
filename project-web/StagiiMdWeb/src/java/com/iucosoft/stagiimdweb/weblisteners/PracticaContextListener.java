/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.weblisteners;

import com.iucosoft.internshipappfx.entities.Company;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.sql.DataSource;

public class PracticaContextListener implements ServletContextListener {

    private static final Logger LOG = Logger.getLogger(PracticaContextListener.class.getName());
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //obtin conexiunea la baza de date
        //creez obiectele dao/servicii si le pun in memoria aplicatiei
        ServletContext sc = sce.getServletContext();
        sc.setAttribute("mainAttribute", "textulAtributului main");

        try {
            InitialContext ic = new InitialContext();  // JNDI initial context
            DataSource ds = (DataSource) ic.lookup("jdbc/practica"); // JNDI lookup
            Connection conn = ds.getConnection();  // database connection through data source
//            CompanyDAOIntf companyDao = new CompanyDAOImpl(ds);
//            sc.setAttribute("companyDao", companyDao);
            //ultimele doua randuri se repeta pentru toate clase dao/servicii
        } catch (SQLException se) {
            LOG.severe(se.toString());
        } catch (NamingException ne) {
            LOG.severe(ne.toString());
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //scoti toate obiectele din memoria aplicatiei

        ServletContext sc = sce.getServletContext();
        //obtin conexiunea ca in metoda precendenta
        //conn.close();
        //faci remove la toate atributele pe care le-am pus in sce
        
    }
}
