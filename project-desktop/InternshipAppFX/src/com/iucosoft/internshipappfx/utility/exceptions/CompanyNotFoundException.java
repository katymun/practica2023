package com.iucosoft.internshipappfx.utility.exceptions;

import java.sql.SQLException;

/**
 *
 * @author munka
 */
public class CompanyNotFoundException extends SQLException {

    public CompanyNotFoundException(String reason) {
        super(reason);
    }

    public CompanyNotFoundException() {
        super("Company not found exception!");
    }
    
    
}
