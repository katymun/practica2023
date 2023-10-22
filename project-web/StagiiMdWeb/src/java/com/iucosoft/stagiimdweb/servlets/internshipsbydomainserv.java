/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets;

import com.iucosoft.stagiimdweb.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.stagiimdweb.entities.InternshipProgram;
import com.iucosoft.stagiimdweb.utility.Domain;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author munka
 */
@WebServlet(name = "internshipsbydomainserv", urlPatterns = {"/internshipsbydomainserv"})
public class internshipsbydomainserv extends HttpServlet {

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
        String domain = request.getParameter("domain");
        String page = "";
        InternshipProgramDAOIntf internshipDao = (InternshipProgramDAOIntf) request.getServletContext().getAttribute("internshipDao");
        try {
            Domain domainVal = Domain.BANKING;
            switch(domain) {
                case "IT": domainVal = Domain.IT; break;
                case "design": domainVal = Domain.DESIGN; break;
                case "marketing": domainVal = Domain.MARKETING; break;
                case "management": domainVal = Domain.MANAGEMENT; break;
            }
            List<InternshipProgram> internshipList = internshipDao.findAllByDomain(domainVal);
            
            //request.setAttribute cu lista 
            request.setAttribute("internshipList", internshipList);
        } catch (SQLException ex) {
            
            log("eroare" + ex.toString());
            
            throw new IOException(ex);
        }
        switch(domain) {
            case "IT": page = "stagii/IT.jsp"; break;
            case "design": page = "stagii/design.jsp"; break;
            case "marketing": page = "stagii/marketing.jsp"; break;
            case "management": page = "stagii/management.jsp"; break;
            default: page = "home.html";
        }
        
        request.getRequestDispatcher(page).forward(request, response);
        
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
