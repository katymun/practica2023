/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author munka
 */
public class DispatcherServlet extends HttpServlet {

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
        String page = "index.jsp";
        String path = request.getServletPath();
        log("path = " + path);
        
        switch(path) {
            case "/home.html": page = "/homeserv"; break;
            case "/internships.html": page = "/internshipserv";  break;
            case "/companies.html": page = "/companiesserv"; break;
            case "/internship_details.html": page = "/internshipdetailsserv"; break;
            case "/companies_details.html": page = "/companydetailsserv"; break;
            case "/newaccount.html": page = "/newaccountserv"; break;
            case "/signin.html": page = "/showloginserv"; break;
//            case "/applicant_home.html": page = "/cmsapplicanthomeserv"; break;
//            case "/applicant_internships.html": page = "/cmsapplicantinternshipsserv"; break;
//            case "/applicant_companies.html": page = "/cmsapplicantcompaniesserv"; break;
            
            
            case "/newaccount-applicant.html": page = "/newaccountapplserv"; break;
            case "/recruiteraccount.html": page = "/newaccountrecrserv"; break;
            case "/addinternship.html": page = "/addinternshipserv"; break;
            case "/postinternship.html": page = "/postinternshipserv"; break;
            
            case "/logout.html": page = "/logoutserv"; break;
            
//            case "/seeapplicants.html": page = "/seeapplicantsserv"; break;
//            case "/seeprofile.html": page = "/seeprofileserv"; break;
//            case "/seeprofile-edit.html": page = "/seeprofileeditserv"; break;
//            case "/companypage-register.html": page = "/companyregisterserv"; break;
//            case "/generalcompany.html": page = "/generalcompanyserv"; break;
            default: page = "index.jsp";
        }
        log("page = " + page);
        
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
