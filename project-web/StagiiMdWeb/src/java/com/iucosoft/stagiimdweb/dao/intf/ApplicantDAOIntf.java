package com.iucosoft.stagiimdweb.dao.intf;


import com.iucosoft.stagiimdweb.entities.Applicant;
import com.iucosoft.stagiimdweb.entities.User;
import java.sql.SQLException;
import java.util.List;

public interface ApplicantDAOIntf extends GenericDAOIntf<Applicant> {
    List<Applicant> findByName(String applicantName) throws SQLException;
    boolean save(User user, Applicant applicant) throws SQLException;

}
