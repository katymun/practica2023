/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.dao.impl;

import com.iucosoft.stagiimdweb.dao.intf.SubscribeDAOIntf;
import com.iucosoft.stagiimdweb.entities.Subscribe;
import com.iucosoft.stagiimdweb.sql.SQLS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author munka
 */
public class SubscribeDAOImpl implements SubscribeDAOIntf {

    DataSource ds;
    private static final Logger LOG = Logger.getLogger(SubscribeDAOImpl.class.getName());

    public SubscribeDAOImpl(DataSource ds) {
        this.ds = ds;
    }
    
    @Override
    public boolean save(Subscribe sb) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;

        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.SUBSCRIBE_INSERT);
            pstat.setString(1, sb.getPosition());
            pstat.setString(2, sb.getFullName());
            pstat.setString(3, sb.getEmail());
            
            

            int modificari = pstat.executeUpdate();

            if (modificari > 0) {
                return true;
            } else {
                throw new SQLException("Eroare la crearea subscribe!");
            }
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            return false;
        }
    }

    @Override
    public boolean update(Subscribe t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Subscribe t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Subscribe> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Subscribe findById(int idT) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
