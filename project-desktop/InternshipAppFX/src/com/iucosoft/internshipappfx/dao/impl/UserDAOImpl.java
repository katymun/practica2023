/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.UserDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.InternshipProgram;
import com.iucosoft.internshipappfx.entities.User;
import com.iucosoft.internshipappfx.sql.SQLS;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.Role;
import com.iucosoft.internshipappfx.utility.exceptions.InternshipProgramNotFoundException;
import com.iucosoft.internshipappfx.utility.exceptions.UserNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author munka
 */
public class UserDAOImpl implements UserDAOIntf {
    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    @Override
    public boolean save(User t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User user) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.USERS_UPDATE);
            pstat.setString(1, user.getPassword());
            pstat.setInt(2, user.getId());

            pstat.executeUpdate();
            return true;
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            //throw ex;
            return false;
        } finally {
            if (pstat != null) {
                pstat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public void delete(User user) throws SQLException {
        PreparedStatement pstat = null;
        Connection conn = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.USERS_DELETE);
            pstat.setInt(1, user.getId());
            pstat.executeUpdate();
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (pstat != null) {
                pstat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public List<User> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(int idUser) throws SQLException {
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_USER_BY_ID)) {

            if (rs.next()) {
                int id = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                LocalDate ld = LocalDate.parse(rs.getString(4));
                Date registerDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                Role role = Role.valueOf(rs.getString(5));

                User user = new User(id, username, password, registerDate, role);
                return user;
            }
            throw new UserNotFoundException("Find by id = " + idUser + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

    
}
