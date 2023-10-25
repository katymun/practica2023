/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.sql;

/**
 *
 * @author munka
 */
public class SQLS {

    // SQL for the 'users' entity
    public static String USERS_INSERT_DEMO = "INSERT INTO `users` VALUES (NULL,'username1','pword123','2023-01-01', 'RECRUITER')";
    public static final String USERS_INSERT = "INSERT INTO users VALUES (NULL, ?, ?, ?, ?)";

    // SQL for the 'recruiters' entity
    public static String RECRUITERS_INSERT_DEMO = "INSERT INTO `recruiters` VALUES (NULL,'nume1','prenume1','company1_id','user1_id','nume.prenume@gmail.com')";
    public static final String RECRUITERS_INSERT = "INSERT INTO recruiters VALUES (NULL, ?, ?, ?, ?, ?)";

    // SQL for the 'applicants' entity
    public static String APPLICANTS_INSERT_DEMO = "INSERT INTO `applicants` VALUES (NULL,'nume2','prenume2','20','student','IT','cv1.pdf','user1_id','nume.prenume@isa.utm.md','068111111')";
    public static final String APPLICANTS_INSERT = "INSERT INTO applicants VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    // SQL for the 'companies' entity
    public static String COMPANIES_INSERT_DEMO = "INSERT INTO `companies` VALUES (NULL,'title1','IT','This is an IT company.','060123456','companyname@gmail.com','img1.jpg')";
    public static final String COMPANIES_INSERT = "INSERT INTO companies VALUES (NULL, ?, ?, ?, ?, ?, ?)";

    // SQL for the 'programmes' entity
    public static String PROGRAMMES_INSERT_DEMO = "INSERT INTO `programmes` VALUES (NULL,NULL,'tilte2','IT','2023-01-01','3 months','company1_id','some duties','some qualifications','some benefits','Chisinau','false')";
    public static final String PROGRAMMES_INSERT = "INSERT INTO programmes VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    // SQL for the 'applications' entity
    public static String APPLICATIONS_INSERT_DEMO = "INSERT INTO `applications` VALUES (NULL,'applicant1_id','programme1_id','2023-01-01','cv1.pdf','068123123','nume.prenume@isa.utm.md','UTM')";
    public static final String APPLICATIONS_INSERT = "INSERT INTO applications VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)";

    // SQL query to select the maximum ID from the 'users' table
    public static final String SELECT_LAST_USER_ID = "SELECT MAX(id) FROM users";
    public static final String SELECT_LAST_COMPANY_ID = "SELECT MAX(id) FROM companies";
    public static final String SELECT_COMPANY_ID_BY_TITLE = "SELECT id FROM companies WHERE title = ?";

    public static final String SEARCH_APPLICANT = "SELECT * FROM applicants WHERE name LIKE ? OR surname LIKE ? OR statut = ? OR domain = ?";
    public static final String SEARCH_APPLICATION = "SELECT * FROM applications WHERE applicant_id = ? OR programme_id = ?";
    public static final String SEARCH_COMPANY = "SELECT * FROM companies WHERE title LIKE ? OR domain = ?";
    public static final String SEARCH_PROGRAMME = "SELECT * FROM programmes WHERE title LIKE ? OR domain = ? OR company_id = ?";
    public static final String SEARCH_RECRUITER = "SELECT * FROM recruiters WHERE name LIKE ? OR surname LIKE ? OR company_id = ?";
    public static final String SEARCH_USER = "SELECT * FROM users WHERE username LIKE ?";

    // Update queries
    public static final String USERS_UPDATE = "UPDATE users SET PASSWORD=? WHERE ID=?";
    public static final String APPLICANTS_UPDATE = "UPDATE applicants SET AGE=?, STATUT=?, DOMAIN=?, CV=?, EMAIL=?, PHONE_NUMBER=? WHERE ID=?";
    public static final String RECRUITERS_UPDATE = "UPDATE recruiters SET EMAIL=? WHERE ID=?";
    public static final String COMPANIES_UPDATE = "UPDATE companies SET TITLE=?, DOMAIN=?, ABOUT=?, PHONE_NUMBER=?, EMAIL=?, IMG_PATH=? WHERE ID=?";
    public static final String APPLICATIONS_UPDATE = "UPDATE applications SET CV=?, PHONE_NUMBER=?, EMAIL=? WHERE ID=?";
    public static final String PROGRAMMES_UPDATE = "UPDATE programmes SET TITLE=?, DOMAIN=?, START_DATA=?, DURATION=?, DUTIES=?, QUALIFICATIONS=?, BENEFITS=?, LOCATION=?, PAID=? WHERE ID=?";

    // Delete queries
    public static final String USERS_DELETE = "DELETE FROM USERS WHERE ID=?";
    public static final String APPLICANTS_DELETE = "DELETE FROM APPLICANTS WHERE ID=?";
    public static final String RECRUITERS_DELETE = "DELETE FROM RECRUITERS WHERE ID=?";
    public static final String COMPANIES_DELETE = "DELETE FROM COMPANIES WHERE ID=?";
    public static final String APPLICATIONS_DELETE = "DELETE FROM APPLICATIONS WHERE ID=?";
    public static final String PROGRAMMES_DELETE = "DELETE FROM PROGRAMMES WHERE ID=?";

    // Find all queries
    public static final String FIND_ALL_USERS = "SELECT * FROM USERS";
    public static final String FIND_ALL_APPLICANTS = "SELECT * FROM APPLICANTS";
    public static final String FIND_ALL_RECRUITERS = "SELECT * FROM RECRUITERS";
    public static final String FIND_ALL_COMPANIES = "SELECT * FROM COMPANIES";
    public static final String FIND_ALL_APPLICATIONS = "SELECT * FROM APPLICATIONS";
    public static final String FIND_ALL_PROGRAMMES = "SELECT * FROM PROGRAMMES";

    // Find by ID queries
    public static final String FIND_USER_BY_ID = "SELECT * FROM users WHERE ID=?";
    public static final String FIND_APPLICANT_BY_ID = "SELECT * FROM applicants WHERE ID=?";
    public static final String FIND_RECRUITER_BY_ID = "SELECT * FROM recruiters WHERE ID=?";
    public static final String FIND_COMPANY_BY_ID = "SELECT * FROM companies WHERE ID=?";
    public static final String FIND_APPLICATION_BY_ID = "SELECT * FROM applications WHERE ID=?";
    public static final String FIND_PROGRAMME_BY_ID = "SELECT * FROM programmes WHERE ID=?";
    public static final String FIND_ALL_PROGRAMMES_BY_COMPANY = "SELECT * FROM programmes WHERE company_id = ?";
    public static final String FIND_ALL_PROGRAMMES_BY_DOMAIN = "SELECT * FROM programmes WHERE domain = ?";
    
    
    // Find by Name queries
    
    public static final String FIND_COMPANY_BY_NAME = "SELECT * FROM companies WHERE TITLE=?";
    public static final String FIND_APPLICANT_BY_NAME = "SELECT * FROM applicants WHERE NAME=?";

    public static final String FIND_TOP_5_PROGRAMS_BY_DATE = "SELECT * FROM programmes WHERE start_data >= CURRENT_DATE() ORDER BY start_data LIMIT 5;";
    
    public static final String FIND_TOP_10_PROGRAMS = "";

    public static final String GET_COMPANY_IMAGE = "SELECT TITLE, IMG_PATH, IMG_DATA FROM companies WHERE ID=?";
    
}
