package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;

import java.sql.SQLException;
import java.util.List;

public interface ApplicantDAOIntf {
    boolean save(Applicant applicant) throws SQLException;
    boolean update(Applicant applicant) throws SQLException;
    void delete(Applicant applicant) throws SQLException;
    List<Applicant> findAllApplicants() throws SQLException;
    Applicant findById(int idApplicant) throws SQLException;
    Applicant findByName(String applicantName) throws SQLException;

}
