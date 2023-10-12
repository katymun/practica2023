package com.iucosoft.internshipappfx.dao.impl;

import com.iucosoft.internshipappfx.dao.intf.CompanyDAOIntf;
import com.iucosoft.internshipappfx.db.DataSource;
import com.iucosoft.internshipappfx.entities.Applicant;
import com.iucosoft.internshipappfx.entities.Company;
import com.iucosoft.internshipappfx.sql.SQLS;
import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.exceptions.CompanyNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CompanyDAOImpl implements CompanyDAOIntf {

    DataSource ds = DataSource.getInstance();
    private static final Logger LOG = Logger.getLogger(ApplicantDAOImpl.class.getName());

    public CompanyDAOImpl() {
    }

    //asta se decomenteaza cand trec la web, iar datasource trebuie 
    //sa fie de tipul java.sql.DataSource
//    public CompanyDAOImpl(DataSource ds) {
//        this.ds = ds;
//    }
    @Override
    public boolean save(Company company) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;

        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.COMPANIES_INSERT);
            pstat.setString(1, company.getTitle());
            pstat.setString(2, company.getDomain().toString());
            pstat.setString(3, company.getAbout());
            pstat.setString(4, company.getPhoneNumber());
            pstat.setString(5, company.getEmail());
            pstat.setString(6, company.getImagePath());

            int modificari = pstat.executeUpdate();

            if (modificari > 0) {
                return true;
            } else {
                throw new SQLException("Eroare la crearea companiei!");
            }
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            return false;
        }
    }

    @Override
    public boolean update(Company company) throws SQLException {
        Connection conn = null;
        PreparedStatement pstat = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.COMPANIES_UPDATE);
            pstat.setString(1, company.getTitle());
            pstat.setString(2, company.getDomain().toString());
            pstat.setString(3, company.getAbout());
            pstat.setString(4, company.getPhoneNumber());
            pstat.setString(5, company.getEmail());
            pstat.setString(6, company.getImagePath());
            pstat.setInt(6, company.getId());

            pstat.executeUpdate();
            return true;
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            //throw ex;
            return false;
        } finally {
            if (pstat != null) {
                pstat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public void delete(Company company) throws SQLException {
        PreparedStatement pstat = null;
        Connection conn = null;
        try {
            conn = ds.getConnection();
            pstat = conn.prepareStatement(SQLS.COMPANIES_DELETE);
            pstat.setInt(1, company.getId());
            pstat.executeUpdate();
        } catch (Exception ex) {
            LOG.severe(ex.toString());
            throw ex;
        } finally {
            if (pstat != null) {
                pstat.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    @Override
    public List<Company> findAll() throws SQLException {
        List<Company> companies = new ArrayList<>();
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_ALL_COMPANIES);) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                String about = rs.getString(4);
                String phoneNumber = rs.getString(5);
                String email = rs.getString(6);
                String imagePath = rs.getString(7);

                Company company = new Company(id, title, domain, about, phoneNumber, email, imagePath);
                companies.add(company);
            }
            return companies;
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

    @Override
    public Company findById(int idCompany) throws SQLException {
        try (Connection conn = ds.getConnection();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(SQLS.FIND_COMPANY_BY_ID)) {

            if (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                String about = rs.getString(4);
                String phoneNumber = rs.getString(5);
                String email = rs.getString(6);
                String imagePath = rs.getString(7);

                Company company = new Company(id, title, domain, about, phoneNumber, email, imagePath);
                return company;
            }
            throw new CompanyNotFoundException("Find by id = " + idCompany + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

    @Override
    public Company findByName(String companyTitle) throws SQLException {
        try (Connection conn = ds.getConnection();
                PreparedStatement pstat = conn.prepareStatement(SQLS.FIND_COMPANY_BY_NAME);
                ResultSet rs = pstat.executeQuery();) {

            pstat.setString(1, companyTitle);

            if (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                Domain domain = Domain.valueOf(rs.getString(3));
                String about = rs.getString(4);
                String phoneNumber = rs.getString(5);
                String email = rs.getString(6);
                String imagePath = rs.getString(7);

                Company company = new Company(id, title, domain, about, phoneNumber, email, imagePath);
                return company;
            }
            throw new CompanyNotFoundException("Find by name = " + companyTitle + " failed!");
        } catch (SQLException ex) {
            LOG.severe(ex.toString());
            throw ex;
        }
    }

}
