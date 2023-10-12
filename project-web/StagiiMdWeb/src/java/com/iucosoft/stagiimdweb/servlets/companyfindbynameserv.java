/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets;

import com.iucosoft.stagiimdweb.dao.intf.CompanyDAOIntf;
import com.iucosoft.stagiimdweb.entities.Company;
import com.iucosoft.stagiimdweb.utility.Domain;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author munka
 */
@WebServlet(name = "companyfindbynameserv", urlPatterns = {"/companyfindbynameserv"})
public class companyfindbynameserv extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        
        CompanyDAOIntf companyDao = (CompanyDAOIntf) request.getServletContext().getAttribute("companyDao");
        try {
//            if (companyDao == null) {
//                System.out.println("CompanyDao este null");
//            }
            Company company = companyDao.findByName(title);
            request.setAttribute("company", company);
        } catch (SQLException ex) {
            //Logger.getLogger(companysaveserv.class.getName()).log(Level.SEVERE, null, ex);
            log(ex.toString());   //peste tot in loc de logger, si sout
//            ex.printStackTrace();
            throw new IOException(ex);
        }
        
        request.getRequestDispatcher("public/companyview.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
