/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets.cms;

import com.iucosoft.stagiimdweb.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.stagiimdweb.entities.Company;
import com.iucosoft.stagiimdweb.entities.InternshipProgram;
import com.iucosoft.stagiimdweb.services.impl.InternshipServiceImpl;
import com.iucosoft.stagiimdweb.utility.Domain;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author munka
 */
@WebServlet(name = "cmsinternshipsbydomainserv", urlPatterns = {"/cms/cmsinternshipsbydomainserv"})
public class cmsinternshipsbydomainserv extends HttpServlet {

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
        InternshipServiceImpl internshipService = (InternshipServiceImpl) request.getServletContext().getAttribute("internshipService");

        try {
            Domain domainVal = Domain.BANKING;
            switch (domain) {
                case "IT":
                    domainVal = Domain.IT;
                    break;
                case "Design":
                    domainVal = Domain.DESIGN;
                    break;
                case "Marketing":
                    domainVal = Domain.MARKETING;
                    break;
                case "Management":
                    domainVal = Domain.MANAGEMENT;
                    break;
                case "Telecommunications":
                    domainVal = Domain.TELECOMMUNICATIONS;
                    break;
                case "Logistics":
                    domainVal = Domain.LOGISTICS;
                    break;
                case "Sales":
                    domainVal = Domain.SALES;
                    break;
                case "Accounting":
                    domainVal = Domain.ACCOUNTING;
                    break;
                case "Banking":
                    domainVal = Domain.BANKING;
                    break;
                case "Medicine":
                    domainVal = Domain.MEDICINE;
                    break;
            }
            List<InternshipProgram> internshipList = internshipDao.findAllByDomain(domainVal);
            Map<InternshipProgram, Company> internshipCompanyMap = internshipService.getInternshipCompanyMap(internshipList);
            //request.setAttribute cu lista 
            request.setAttribute("internshipCompanyMap", internshipCompanyMap);
            request.setAttribute("domain", domain);
        } catch (SQLException ex) {

            log("eroare" + ex.toString());

            throw new IOException(ex);
        }
        page = "../stagii/internships_by_domain_applicant.jsp";

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
