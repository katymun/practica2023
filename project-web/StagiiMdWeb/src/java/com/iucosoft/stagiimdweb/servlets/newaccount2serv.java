/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets;

import com.iucosoft.stagiimdweb.entities.User;
import com.iucosoft.stagiimdweb.utility.Role;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author munka
 */
public class newaccount2serv extends HttpServlet {

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
        String username = request.getParameter("USERNAME");
        String password = request.getParameter("PASSWORD");
        Role role = Role.valueOf(request.getParameter("ROLE"));
        System.out.println("ROLE = " + role);
        Date date = new Date();
        
        User newUser = new User(username, password, date, role);
        
        request.setAttribute("newUser", newUser);
        System.out.println("newUser: " + username + " " + password + " " + role);
        String page = "";
        
        if (role == Role.APPLICANT) {
            page = "newaccountapplicantserv";
            System.out.println("Am intrat la applicant");
        } else if (role == Role.RECRUITER) {
            page = "newaccountcompanyserv";
            System.out.println("Am intrat la recruiter");
        } else {
            page = "newaccountserv";
            System.out.println("oops");
            response.sendRedirect(page);
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
