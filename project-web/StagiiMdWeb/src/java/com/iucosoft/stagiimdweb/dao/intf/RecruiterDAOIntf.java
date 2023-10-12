package com.iucosoft.stagiimdweb.dao.intf;

import com.iucosoft.stagiimdweb.entities.Applicant;
import com.iucosoft.stagiimdweb.entities.Company;
import com.iucosoft.stagiimdweb.entities.Recruiter;
import com.iucosoft.stagiimdweb.entities.User;
import java.sql.SQLException;
import java.util.List;

public interface RecruiterDAOIntf extends GenericDAOIntf<Recruiter> {
    List<Applicant> findByName(String recruiterName) throws SQLException;
    boolean save(User user, Recruiter recruiter) throws SQLException;
    boolean save(User user, Recruiter recruiter, Company company) throws SQLException;

}
