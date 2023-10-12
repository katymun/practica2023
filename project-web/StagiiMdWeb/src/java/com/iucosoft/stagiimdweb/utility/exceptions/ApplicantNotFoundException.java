package com.iucosoft.stagiimdweb.utility.exceptions;



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
