package com.iucosoft.internshipappfx.dao.intf;

import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAOIntf <T>{
    boolean save(T t) throws SQLException;
    boolean update(T t) throws SQLException;
    void delete(T t) throws SQLException;
    List<T> findAll() throws SQLException;
    T findById(int idT) throws SQLException;

}
