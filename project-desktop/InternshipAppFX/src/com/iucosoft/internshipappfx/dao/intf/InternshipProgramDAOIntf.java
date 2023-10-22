package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.InternshipProgram;

import java.sql.SQLException;
import java.util.List;

public interface InternshipProgramDAOIntf extends GenericDAOIntf<InternshipProgram>{
    List<InternshipProgram> findTopFiveProgramsByDate() throws SQLException;
}
