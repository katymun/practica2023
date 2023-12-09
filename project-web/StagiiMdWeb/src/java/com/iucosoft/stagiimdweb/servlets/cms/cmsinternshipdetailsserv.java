/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets.cms;

import com.iucosoft.stagiimdweb.dao.intf.CompanyDAOIntf;
import com.iucosoft.stagiimdweb.dao.intf.InternshipProgramDAOIntf;
import com.iucosoft.stagiimdweb.entities.Company;
import com.iucosoft.stagiimdweb.entities.InternshipProgram;
import com.iucosoft.stagiimdweb.services.impl.InternshipServiceImpl;
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
@WebServlet(name = "cmsinternshipdetailsserv", urlPatterns = {"/cms/cmsinternshipdetailsserv"})
public class cmsinternshipdetailsserv extends HttpServlet {

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
        String idInternshipStr = request.getParameter("ID_INTERNSHIP");
        int idInternship = Integer.parseInt(idInternshipStr);
        
        InternshipProgramDAOIntf internshipDao = (InternshipProgramDAOIntf) request.getServletContext().getAttribute("internshipDao");
        CompanyDAOIntf companyDao = (CompanyDAOIntf) request.getServletContext().getAttribute("companyDao");
                InternshipServiceImpl internshipService = (InternshipServiceImpl) request.getServletContext().getAttribute("internshipService");

        try {
            InternshipProgram internshipProgram = internshipDao.findById(idInternship);
            Company company = companyDao.findById(internshipProgram.getIdCompany());
            
            List<InternshipProgram> internshipList1 = internshipDao.findTwoByCompanyId(company.getId());
            Map<InternshipProgram, Company> internshipCompanyMapByCompany = internshipService.getInternshipCompanyMap(internshipList1);
            
            List<InternshipProgram> internshipList2 = internshipDao.findTwoByDomain(internshipProgram.getDomain(), company.getId());
            Map<InternshipProgram, Company> internshipCompanyMapByDomain = internshipService.getInternshipCompanyMap(internshipList2);

            //request.setAttribute cu lista 
            request.setAttribute("internshipProgram", internshipProgram);
            request.setAttribute("company", company);
            request.setAttribute("internshipCompanyMapByCompany", internshipCompanyMapByCompany);
            request.setAttribute("internshipCompanyMapByDomain", internshipCompanyMapByDomain);
        } catch (SQLException ex) {
            
            log("eroare" + ex.toString());
            
            throw new IOException(ex);
        }
        
        request.getRequestDispatcher("../stagii/internship_details_applicant.jsp").forward(request, response);
    
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
