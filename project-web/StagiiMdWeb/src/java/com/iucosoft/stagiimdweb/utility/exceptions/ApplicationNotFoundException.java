package com.iucosoft.stagiimdweb.utility.exceptions;



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
