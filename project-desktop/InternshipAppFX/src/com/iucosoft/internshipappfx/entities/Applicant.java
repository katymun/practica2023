/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.entities;

import com.iucosoft.internshipappfx.utility.Domain;
import com.iucosoft.internshipappfx.utility.Role;
import com.iucosoft.internshipappfx.utility.Status;

import java.util.Objects;

/**
 *
 * @author munka
 */
public class Applicant extends User {
    private int id;
    private String aName;
    private String aSurname;
    private int age;
    private Status status;  //din enum
    private Domain domain;  //din enum
    private String cvFile;
    private int idUser;
    private String email;
    private String phoneNumber;

    public Applicant() {
    }

    public Applicant(String aName, String aSurname, int age, Status status, Domain domain, String cvFile,
                     int idUser, String email, String phoneNumber) {
        this.aName = aName;
        this.aSurname = aSurname;
        this.age = age;
        this.status = status;
        this.domain = domain;
        this.cvFile = cvFile;
        this.idUser = idUser;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = Role.APPLICANT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaSurname() {
        return aSurname;
    }

    public void setaSurname(String aSurname) {
        this.aSurname = aSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public String getCvFile() {
        return cvFile;
    }

    public void setCvFile(String cvFile) {
        this.cvFile = cvFile;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.aName);
        hash = 97 * hash + Objects.hashCode(this.aSurname);
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.status);
        hash = 97 * hash + Objects.hashCode(this.domain);
        hash = 97 * hash + Objects.hashCode(this.cvFile);
        hash = 97 * hash + this.idUser;
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.phoneNumber);
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
        final Applicant other = (Applicant) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.idUser != other.idUser) {
            return false;
        }
        if (!Objects.equals(this.aName, other.aName)) {
            return false;
        }
        if (!Objects.equals(this.aSurname, other.aSurname)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.domain, other.domain)) {
            return false;
        }
        if (!Objects.equals(this.cvFile, other.cvFile)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        return true;
    }    
    
}
