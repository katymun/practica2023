package com.iucosoft.stagiimdweb.entities;

import com.iucosoft.stagiimdweb.utility.Role;
import java.util.Objects;

/**
 *
 * @author munka
 */
public class Recruiter extends User {
    private int id;
    private String rName;
    private String rSurname;
    private String company;
    private int idUser;
    private String email;

    public Recruiter() {
    }

    public Recruiter(int id, String name, String surname, String company, int idUser, String email) {
        this.id = id;
        this.rName = rName;
        this.rSurname = rSurname;
        this.company = company;
        this.idUser = idUser;
        this.email = email;
        Role role = Role.RECRUITER;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRName() {
        return rName;
    }

    public void setRName(String name) {
        this.rName = rName;
    }

    public String getRSurname() {
        return rSurname;
    }

    public void setRSurname(String surname) {
        this.rSurname = rSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.rName);
        hash = 89 * hash + Objects.hashCode(this.rSurname);
        hash = 89 * hash + Objects.hashCode(this.company);
        hash = 89 * hash + this.idUser;
        hash = 89 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recruiter other = (Recruiter) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idUser != other.idUser) {
            return false;
        }
        if (!Objects.equals(this.rName, other.rName)) {
            return false;
        }
        if (!Objects.equals(this.rSurname, other.rSurname)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
    
    
}
