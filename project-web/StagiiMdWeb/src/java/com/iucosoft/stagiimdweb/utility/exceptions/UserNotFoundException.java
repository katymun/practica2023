/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.utility.exceptions;

import java.sql.SQLException;

/**
 *
 * @author munka
 */
public class UserNotFoundException extends SQLException {

    public UserNotFoundException(String reason) {
        super(reason);
    }

    public UserNotFoundException() {
        super("UserNotFoundException");
    }
    
}
