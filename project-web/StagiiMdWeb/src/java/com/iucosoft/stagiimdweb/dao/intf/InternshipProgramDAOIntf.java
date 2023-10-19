package com.iucosoft.stagiimdweb.dao.intf;

import com.iucosoft.stagiimdweb.entities.InternshipProgram;
import com.iucosoft.stagiimdweb.utility.Domain;
import java.sql.SQLException;
import java.util.List;

public interface InternshipProgramDAOIntf extends GenericDAOIntf<InternshipProgram>{
    List<InternshipProgram> findAllByCompanyId(int idCompany) throws SQLException;
    List<InternshipProgram> findAllByDomain(Domain domain) throws SQLException;
    List<InternshipProgram> findAllByKeyword(String keyword) throws SQLException;
}
