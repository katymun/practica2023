public class SQLS {

    //sql pentru entitatea users
    public static String usersInsertDemo = "INSERT INTO `users` VALUES (NULL,'username1','pword123','2023-01-01','role1')";
    public static final String usersInsert = "INSERT INTO users VALUES (NULL, ?, ?, ?, ?)";

    //sql pentru entitatea recruiters
    public static String recruitersInsertDemo = "INSERT INTO `recruiters` VALUES (NULL,'name1','surname1','user1_id','company1_id','nume.prenume@gmail.com')";
    public static final String recruitersInsert = "INSERT INTO recruiters VALUES (NULL, ?, ?, ?, ?, ?)";

    //sql pentru entitatea aplicants
    public static String applicantsInsertDemo = "INSERT INTO `applicants` VALUES (NULL,'name2','surname2','20','student','IT','cv1.pdf','user1_id','nume.prenume@isa.utm.md','068111111')";
    public static final String applicantsInsert = "INSERT INTO applicants VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    //sql pentru entitatea companies
    public static String companiesInsertDemo = "INSERT INTO `companies` VALUES (NULL,'title1','IT','This is an IT company.','060123456','companyname@gmail.com','img1.jpg')";
    public static final String companiesInsert = "INSERT INTO companies VALUES (NULL, ?, ?, ?, ?, ?, ?)";

    //sql pentru entitatea programmes
    public static String programmesInsertDemo = "INSERT INTO `programmes` VALUES (NULL,'tilte2','IT','2023-01-01','3 months','company1_id','some duties','some qualifications','some benefits','Chisinau','No')";
    public static final String programmesInsert = "INSERT INTO programmes VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    //sql pentru entitatea applications
    public static String applicationsInsertDemo = "INSERT INTO `applications` VALUES (NULL,'applicant1_id','programme1_id','2023-01-01','cv1.pdf','068123123','nume.prenume@isa.utm.md','UTM')";
    public static final String applicationsInsert = "INSERT INTO applications VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)";

    //search-uri
    String searchApplicant = "SELECT * FROM applicants WHERE name LIKE ? OR surname LIKE ? OR statut = ? OR domain = ?";

    String searchApplication = "SELECT * FROM applications WHERE applicant_id = ? OR programme_id = ?";

    String searchCompany = "SELECT * FROM companies WHERE title LIKE ? OR domain = ?";

    String searchProgramme = "SELECT * FROM programmes WHERE tilte LIKE ? OR domain = ? OR company_id = ?";

    String searchRecruiter = "SELECT * FROM recruiters WHERE name LIKE ? OR surname LIKE ? OR company_id = ?";

    String searchUser = "SELECT * FROM users WHERE username LIKE ?";

    // update-uri
    String USERS_UPDATE = "UPDATE users SET PASSWORD=? WHERE ID=?";

    String APPLICANTS_UPDATE = "UPDATE applicants SET AGE=?, STATUT=?, DOMAIN=?, CV=?, EMAIL=?, PHONE_NUMBER=? WHERE ID=?";

    String RECRUITERS_UPDATE = "UPDATE recruiters SET EMAIL=? WHERE ID=?";

    String COMPANIES_UPDATE = "UPDATE companies SET TITLE=?, DOMAIN=?, ABOUT=?, PHONE_NUMBER=?, EMAIL=?, IMG_PATH=? WHERE ID=?";

    String APPLICATIONS_UPDATE = "UPDATE applications SET CV=?, PHONE_NUMBER=?, EMAIL=? WHERE ID=?";

    String PROGRAMMES_UPDATE = "UPDATE programmes SET TITLE=?, DOMAIN=?, START_DATA=?, DURATION=?, DUTIES=?, QUALIFICATIONS=?, BENEFITS=?, LOCATION=?, PAID=? WHERE ID=?";

    //delete-uri
    String USERS_DELETE = "DELETE FROM USERS WHERE ID=?";

    String APPLICANTS_DELETE = "DELETE FROM APPLICANTS WHERE ID=?";

    String RECRUITERS_DELETE = "DELETE FROM RECRUITERS WHERE ID=?";

    String COMPANIES_DELETE = "DELETE FROM COMPANIES WHERE ID=?";

    String APPLICATIONS_DELETE = "DELETE FROM APPLICATIONS WHERE ID=?";

    String PROGRAMMES_DELETE = "DELETE FROM PROGRAMMES WHERE ID=?";

    //find all
    String FIND_ALL_USERS = "SELECT * FROM USERS";

    String FIND_ALL_APPLICANTS = "SELECT * FROM APPLICANTS";

    String FIND_ALL_RECRUITERS = "SELECT * FROM RECRUITERS";

    String FIND_ALL_COMPANIES = "SELECT * FROM COMPANIES";

    String FIND_ALL_APPLICATIONS = "SELECT * FROM APPLICATIONS";

    String FIND_ALL_PROGRAMMES = "SELECT * FROM PROGRAMMES";

    //find by id
    String FIND_USER_BY_ID = "SELECT * FROM users WHERE ID=?";

    String FIND_APPLICANT_BY_ID = "SELECT * FROM applicants WHERE ID=?";

    String FIND_RECRUITER_BY_ID = "SELECT * FROM recruiters WHERE ID=?";

    String FIND_COMPANY_BY_ID = "SELECT * FROM companies WHERE ID=?";

    String FIND_APPLICATION_BY_ID = "SELECT * FROM applications WHERE ID=?";

    String FIND_PROGRAMME_BY_ID = "SELECT * FROM programmes WHERE ID=?";

    String findAllProgrammesByCompanyId = "SELECT * FROM programmes WHERE company_id = ?";

    String findAllProgrammesByDomain = "SELECT * FROM programmes WHERE domain = ?";
}