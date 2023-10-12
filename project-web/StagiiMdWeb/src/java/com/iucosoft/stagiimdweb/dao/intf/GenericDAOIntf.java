package com.iucosoft.stagiimdweb.dao.intf;




import java.sql.SQLException;
import java.util.List;

public interface GenericDAOIntf <T>{
    //CRUD - create, read, update, delete
    boolean save(T t) throws SQLException;
    boolean update(T t) throws SQLException;
    void delete(T t) throws SQLException;
    List<T> findAll() throws SQLException;
    T findById(int idT) throws SQLException;

}
