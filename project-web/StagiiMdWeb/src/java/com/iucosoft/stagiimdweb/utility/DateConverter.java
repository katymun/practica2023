
package com.iucosoft.stagiimdweb.utility;

import java.time.Instant;

/**
 *
 * @author munka
 */
public class DateConverter {
    
    public static java.sql.Date convert(java.util.Date utilDate) {
        return new java.sql.Date(utilDate.getTime());
    }
    
    public static java.util.Date convert(java.sql.Date sqlDate) {
        return new java.util.Date(sqlDate.getTime());
    }
    
    public static java.util.Date getNowTime() {
        Instant instant = Instant.now();
        return java.util.Date.from(instant);
    }
}
