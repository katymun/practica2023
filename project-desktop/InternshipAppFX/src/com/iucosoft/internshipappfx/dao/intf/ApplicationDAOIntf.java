package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Application;
import com.iucosoft.internshipappfx.entities.Company;

import java.sql.SQLException;
import java.util.List;

public interface ApplicationDAOIntf extends GenericDAOIntf<Company> {
    boolean save(Application application) throws SQLException;
    boolean update(Application application) throws SQLException;
    void delete(Application application) throws SQLException;
    List<Application> findAllApplications() throws SQLException;
    

}
