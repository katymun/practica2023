/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.utility.exceptions;

import java.sql.SQLException;

/**
 *
 * @author munka
 */
public class ApplicantNotFoundException extends SQLException {

    public ApplicantNotFoundException(String reason) {
        super(reason);
    }

    public ApplicantNotFoundException() {
        super("ApplicantNotFoundException");
    }
    
    
}
