package com.iucosoft.stagiimdweb.dao.intf;

import com.iucosoft.stagiimdweb.entities.User;
import java.sql.SQLException;

/**
 *
 * @author munka
 */
public interface UserDAOIntf extends GenericDAOIntf<User>{
    User findByUsername(String username) throws SQLException;
}
