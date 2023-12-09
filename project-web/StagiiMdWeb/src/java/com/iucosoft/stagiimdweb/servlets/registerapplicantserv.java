/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.servlets;

import com.iucosoft.stagiimdweb.dao.impl.ApplicantDAOImpl;
import com.iucosoft.stagiimdweb.dao.intf.ApplicantDAOIntf;
import com.iucosoft.stagiimdweb.entities.Applicant;
import com.iucosoft.stagiimdweb.entities.User;
import com.iucosoft.stagiimdweb.utility.Domain;
import com.iucosoft.stagiimdweb.utility.ImageUtil;
import com.iucosoft.stagiimdweb.utility.Role;
import com.iucosoft.stagiimdweb.utility.Status;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author munka
 */
@WebServlet(name = "registerapplicantserv", urlPatterns = {"/registerapplicantserv"})
@MultipartConfig
public class registerapplicantserv extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(registerapplicantserv.class.getName());

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

        final String DIR = "uploads";
        final String path = request.getServletContext().getRealPath("") + DIR;
        System.out.println("path = " + path);
        final Part filePart = request.getPart("file");
        final String fileName = getFileName(filePart);
        final String fullPath = path + File.separator + fileName;

        ApplicantDAOIntf applicantDao = (ApplicantDAOImpl) request.getServletContext().getAttribute("applicantDao");
        System.out.println(applicantDao);

        String username = request.getParameter("USERNAME");
        String password = request.getParameter("PASSWORD");
        Role role = Role.valueOf(request.getParameter("ROLE"));

        User newUser = new User(username, password, new Date(), role);
        System.out.println("newUser din resiter serv = " + newUser);
        String firstName = request.getParameter("FIRST_NAME");
        String lastName = request.getParameter("LAST_NAME");
        String ageStr = request.getParameter("AGE");
        System.out.println("Age = " + ageStr);
        int age = Integer.parseInt("20");
        String email = request.getParameter("EMAIL");
        String statusStr = request.getParameter("STATUS");
        System.out.println("Status = " + statusStr);

        Status status = Status.valueOf(request.getParameter("STATUS"));
        String phoneNumber = request.getParameter("PHONE_NUMBER");
//        String cv = request.getParameter("CV");

        OutputStream out = null;
        InputStream filecontent = null;
        byte[] fileBytes = null;
        
        try {
            out = new FileOutputStream(new File(path + File.separator
                    + fileName));
            filecontent = filePart.getInputStream();

            //scrie in fisier
            ImageUtil.saveBytesToFile(filecontent, fullPath);

            log("Am scris in fisierul " + fullPath);
            //scrie in BD
            fileBytes = ImageUtil.readBytesFromFile(fullPath);

//            int read = 0;
//            final byte[] bytes = new byte[1024];
//
//            while ((read = filecontent.read(bytes)) != -1) {
//                out.write(bytes, 0, read);
//            }
//            LOGGER.log(Level.INFO, "File{0}being uploaded to {1}",
//                    new Object[]{fileName, path});
        } catch (FileNotFoundException fne) {
            LOGGER.log(Level.SEVERE, "Problems during file upload. Error: {0}",
                    new Object[]{fne.getMessage()});
        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }
        }

        Applicant newApplicant = new Applicant(firstName, lastName, 20, status, Domain.IT, fileName, fileBytes, "katymun@email.com", phoneNumber);
        System.out.println("newUser 1 = " + newUser);
        System.out.println("newApplicant = " + newApplicant);
        String page = "";
        try {
            applicantDao.save(newUser, newApplicant);
            page = "showloginserv";
        } catch (SQLException ex) {
            log(ex.getMessage());
            page = "newaccountserv";
        }

        response.sendRedirect("showloginserv");
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        LOGGER.log(Level.INFO, "Part Header = {0}", partHeader);
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
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
