package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.InternshipProgram;

import java.sql.SQLException;
import java.util.List;

public interface InternshipProgramDAOIntf {
    boolean save(InternshipProgram internshipProgram) throws SQLException;
    boolean update(InternshipProgram internshipProgram) throws SQLException;
    void delete(InternshipProgram internshipProgram) throws SQLException;
    List<InternshipProgram> findAllInternshipPrograms() throws SQLException;
    InternshipProgram findById(int idInternshipProgram) throws SQLException;
    InternshipProgram findByName(String internshipProgramName) throws SQLException;

}
