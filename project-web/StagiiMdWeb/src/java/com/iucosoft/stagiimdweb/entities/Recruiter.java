/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    private int idCompany;
    private int idUser;
    private String email;

    public Recruiter() {
    }

    public Recruiter(String rName, String rSurname, String email) {
        this.rName = rName;
        this.rSurname = rSurname;
        this.email = email;
    }
    
    public Recruiter(int id, String name, String surname, int idCompany, int idUser, String email) {
        this.id = id;
        this.rName = rName;
        this.rSurname = rSurname;
        this.idCompany = idCompany;
        this.idUser = idUser;
        this.email = email;
        this.role = Role.RECRUITER;
    }

    public Recruiter(String rName, String rSurname, int idCompany, int idUser, String email) {
        this.rName = rName;
        this.rSurname = rSurname;
        this.idCompany = idCompany;
        this.idUser = idUser;
        this.email = email;
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

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
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
        hash = 89 * hash + Objects.hashCode(this.idCompany);
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
        if (!Objects.equals(this.idCompany, other.idCompany)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Recruiter{" + "id=" + id + ", rName=" + rName + ", rSurname=" + rSurname + ", idCompany=" + idCompany + ", idUser=" + idUser + ", email=" + email + '}';
    }
    
}
