package com.iucosoft.stagiimdweb.dao.intf;


import com.iucosoft.stagiimdweb.entities.Applicant;
import com.iucosoft.stagiimdweb.entities.User;
import com.iucosoft.stagiimdweb.utility.MyFile;
import java.sql.SQLException;
import java.util.List;

public interface ApplicantDAOIntf extends GenericDAOIntf<Applicant> {
    List<Applicant> findByName(String applicantName, String applicantSurname) throws SQLException;
    boolean save(User user, Applicant applicant) throws SQLException;

    Applicant findByUserId(int idUser) throws SQLException;
    List<MyFile> getFiles() throws SQLException;

}
