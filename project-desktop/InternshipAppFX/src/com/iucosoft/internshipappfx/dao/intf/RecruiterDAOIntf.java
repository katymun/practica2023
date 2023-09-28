package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.Recruiter;

import java.sql.SQLException;
import java.util.List;

public interface RecruiterDAOIntf {
    boolean save(Recruiter recruiter) throws SQLException;
    boolean update(Recruiter recruiter) throws SQLException;
    void delete(Recruiter recruiter) throws SQLException;
    List<Recruiter> findAllRecruiters() throws SQLException;
    Recruiter findById(int idRecruiter) throws SQLException;
    Recruiter findByName(String recruiterName) throws SQLException;

}
