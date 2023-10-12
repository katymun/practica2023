package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.Recruiter;
import com.iucosoft.internshipappfx.entities.User;

import java.sql.SQLException;
import java.util.List;

public interface RecruiterDAOIntf extends GenericDAOIntf<Recruiter> {
    List<Applicant> findByName(String recruiterName) throws SQLException;
    boolean save(User user, Recruiter recruiter) throws SQLException;
    boolean save(User user, Recruiter recruiter, Company company) throws SQLException;

}
