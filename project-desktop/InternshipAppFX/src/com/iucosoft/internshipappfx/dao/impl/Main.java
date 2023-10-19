/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.utility.ImageUtil;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munka
 */
public class Main {
    public static void main(String[] args) {
        try {
            CompanyDAOIntf companyDao = new CompanyDAOImpl();
            companyDao.updateCompanyImage(2, "img77.png", "salut".getBytes());
            //companyDao.updateCompanyImage(2, "img77.png", ImageUtil.readImageData("img1.png"));
        } catch (Exception ex) {
            ex.toString();
        }
    }
    
}
