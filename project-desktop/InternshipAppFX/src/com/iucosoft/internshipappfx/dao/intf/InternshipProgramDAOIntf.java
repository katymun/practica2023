package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.entities.InternshipProgram;
import com.iucosoft.internshipappfx.utility.Domain;

import java.sql.SQLException;
import java.util.List;

public interface InternshipProgramDAOIntf extends GenericDAOIntf<InternshipProgram>{
    List<InternshipProgram> findAllByCompanyId(int idCompany) throws SQLException;
    List<InternshipProgram> findAllByDomain(Domain domain) throws SQLException;
    List<InternshipProgram> findAllByKeyword(String keyword) throws SQLException;
    
}
