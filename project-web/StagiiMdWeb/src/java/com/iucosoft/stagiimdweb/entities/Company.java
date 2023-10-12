/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package com.iucosoft.stagiimdweb.entities;

import com.iucosoft.stagiimdweb.utility.Domain;
import java.util.Objects;

/**
 *
 * @author munka
 */
public class Company {
    private int id;
    private String title;
    private Domain domain;
    private String about;
    private String phoneNumber;
    private String email;

    public Company() {
    }

    public Company(int id, String title, Domain domain, String about, String phoneNumber, String email) {
        this.id = id;
        this.title = title;
        this.domain = domain;
        this.about = about;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Company(String title, Domain domain, String about, String phoneNumber, String email) {
        this.title = title;
        this.domain = domain;
        this.about = about;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
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
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.title);
        hash = 71 * hash + Objects.hashCode(this.domain);
        hash = 71 * hash + Objects.hashCode(this.about);
        hash = 71 * hash + Objects.hashCode(this.phoneNumber);
        hash = 71 * hash + Objects.hashCode(this.email);
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
        final Company other = (Company) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.about, other.about)) {
            return false;
        }
        if (!Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (this.domain != other.domain) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", title=" + title + ", domain=" + domain + ", about=" + about + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
    
    
    
    
}
