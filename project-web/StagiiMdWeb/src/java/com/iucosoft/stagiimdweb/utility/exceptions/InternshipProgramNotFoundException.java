/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.utility.exceptions;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 *
 * @author munka
 */
public class InternshipProgramNotFoundException extends SQLException {

    public InternshipProgramNotFoundException() {
        super("InternshipProgramNotFoundException");
    }
    
    public InternshipProgramNotFoundException(String reason) {
        super(reason);
    }

}
