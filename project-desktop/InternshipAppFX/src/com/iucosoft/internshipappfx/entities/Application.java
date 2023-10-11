/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.internshipappfx.entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author munka
 */
public class Application {

    private int id;
    private int idApplicant;
    private int idInternship;
    private Date applicationDate;
    private String cvFile;
    private String phoneNumber;
    private String email;

    public Application() {
    }

    public Application(int id, int idApplicant, int idInternship, Date applicationDate, String cvFile, String phoneNumber, String email) {
        this.id = id;
        this.idApplicant = idApplicant;
        this.idInternship = idInternship;
        this.applicationDate = applicationDate;
        this.cvFile = cvFile;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdApplicant() {
        return idApplicant;
    }

    public void setIdApplicant(int idApplicant) {
        this.idApplicant = idApplicant;
    }

    public int getIdInternship() {
        return idInternship;
    }

    public void setIdInternship(int idInternship) {
        this.idInternship = idInternship;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getCvFile() {
        return cvFile;
    }

    public void setCvFile(String cvFile) {
        this.cvFile = cvFile;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        hash = 89 * hash + this.idApplicant;
        hash = 89 * hash + this.idInternship;
        hash = 89 * hash + Objects.hashCode(this.applicationDate);
        hash = 89 * hash + Objects.hashCode(this.cvFile);
        hash = 89 * hash + Objects.hashCode(this.phoneNumber);
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
        final Application other = (Application) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idApplicant != other.idApplicant) {
            return false;
        }
        if (this.idInternship != other.idInternship) {
            return false;
        }
        if (!Objects.equals(this.cvFile, other.cvFile)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.applicationDate, other.applicationDate)) {
            return false;
        }
        return true;
    }

    
    
}
