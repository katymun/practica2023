
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.db;


import static com.iucosoft.internshipappfx.db.StaticPropertyClass.DEBUG;
import static com.iucosoft.internshipappfx.db.StaticPropertyClass.JDBC_FILE;
import static com.iucosoft.internshipappfx.db.StaticPropertyClass.JDBC_FILE_TEST;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author munka
 */
public class DataSource {
    private static final Logger LOG = Logger.getLogger(DataSource.class.getName());
    
    private String dbUsername; //root -- cand s-a creat baza de date
    private String dbPassword; //free -- cand s-a creat baza de date
    private String dbUrl; //unde se afla baza de date
    private String dbName; //bdnivel2 = numele bazei de date
    private String dbDriverName; 
    private Connection connection;
    
    private DataSource() {
        try {
            loadProperties();
            loadDriver();
            openConnection();
            
        } catch (Exception ex) {
            LOG.severe(ex.getMessage());
        }
    }
    
    public static DataSource getInstance() {
        return SingletonJDBCHolder.INSTANCE;
    }
    
    private static class SingletonJDBCHolder {

        private static final DataSource INSTANCE = new DataSource();
    }

    public boolean loadProperties() {
        try {
            Properties pr = new Properties();
            
            String fisierProprietati = null;
            if(!DEBUG) {
                fisierProprietati = JDBC_FILE;
            } else {
                fisierProprietati = JDBC_FILE_TEST;
            }
            
            pr.load(new FileReader(fisierProprietati));
            dbUsername = pr.getProperty("dbUsername");
            if (dbUsername == null) throw new IOException("dbUsername este null");
            dbPassword = pr.getProperty("dbPassword");
            if (dbPassword == null) throw new IOException("dbPassword este null");
            dbName = pr.getProperty("dbName");
            if (dbName == null) throw new IOException("dbName este null");
            dbDriverName = pr.getProperty("dbDriverName");
            if (dbDriverName == null) throw new IOException("dbDriverName este null");
            dbUrl=pr.getProperty("dbUrl")+dbName;
            if (dbUrl == null) throw new IOException("dbUrl este null");
            return true;
        } catch(IOException ex) {
            LOG.severe(ex.toString());
            return false;
        }
  
        
    }
    
    public Connection getConnection() throws SQLException {
        if(openConnection()) {
            return connection;
        } else {
            throw new SQLException("Eroare la deschiderea conexiunii - openConnection()");
        }
    }
    
    public boolean openConnection() {
        try {
            if (connection == null || (connection != null && connection.isClosed()))
        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        LOG.info("Conectat cu succes la BD");
        return true;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            return false;
        }
        
    }
    
    public boolean loadDriver() {
        try {
            Class.forName(dbDriverName);
            return true;
        } catch (ClassNotFoundException ex) {
            LOG.severe(ex.toString());
            return false;
        }
    }
}
