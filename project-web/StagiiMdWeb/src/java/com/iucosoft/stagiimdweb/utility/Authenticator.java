/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.utility;

import com.iucosoft.stagiimdweb.dao.intf.UserDAOIntf;
import com.iucosoft.stagiimdweb.entities.User;

/**
 *
 * @author munka
 */
public class Authenticator {
    public static User authenticate(String username, String password, UserDAOIntf userDao) throws Exception {
        User user = userDao.findByUsername(username);
        if (user == null) {
            throw new Exception("No such user! " + username);
        }
        if (user.getPassword().equals(password)) {
            return user;
        }
        throw new Exception("Invalid password!");
    }

}
