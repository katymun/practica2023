package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.User;

import java.sql.SQLException;
import java.util.List;

public interface ApplicantDAOIntf extends GenericDAOIntf<Applicant> {
    List<Applicant> findByName(String applicantName, String applicantSurname) throws SQLException;
    boolean save(User user, Applicant applicant) throws SQLException;

}
