/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets;

import com.iucosoft.stagiimdweb.dao.impl.UserDAOImpl;
import com.iucosoft.stagiimdweb.dao.intf.UserDAOIntf;
import com.iucosoft.stagiimdweb.entities.User;
import com.iucosoft.stagiimdweb.utility.Authenticator;
import com.iucosoft.stagiimdweb.utility.Role;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author munka
 */
@WebServlet(name = "loginserv", urlPatterns = {"/loginserv"})
public class loginserv extends HttpServlet {

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
        String password = request.getParameter("PASSWORD"); //add encryption later
        UserDAOIntf userDao = (UserDAOImpl) request.getServletContext().getAttribute("userDao");
        try {
            User mainUser = Authenticator.authenticate(username, password, userDao);
            
            HttpSession session = request.getSession(true);
            session.setAttribute("mainUser", mainUser);
            
            String pageRedirect = "";
            Role role = mainUser.getRole();
            switch (role) {
                case ADMIN: pageRedirect = "cms/cmsadminhomeserv"; break;
                case APPLICANT: pageRedirect = "cms/cmsapplicanthomeserv"; break;
                case RECRUITER: pageRedirect = "cms/cmsrecruiterhomeserv"; break;
                default: pageRedirect = "homeserv";  // de trimis la logoutserv pentru a distruge sesiunea
            }
            
            response.sendRedirect(pageRedirect);
        } catch (Exception ex) {
            request.setAttribute("error", "Exceptie in login " + ex.getMessage());
            log("eroare" + ex.toString());
            request.getRequestDispatcher("showloginserv").forward(request, response);
            //throw new IOException(ex);
        }
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
