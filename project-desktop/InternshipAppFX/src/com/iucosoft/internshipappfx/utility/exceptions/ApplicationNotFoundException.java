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
public class ApplicationNotFoundException extends SQLException {

    public ApplicationNotFoundException(String reason) {
        super(reason);
    }

    public ApplicationNotFoundException() {
        super("AplicationNotFoundException");
    }
    
}
