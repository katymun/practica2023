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
    private String imagePath;
    private byte[] imgData;
    
    

    public Company() {
    }

    public Company(int id, String title, Domain domain, String about, String phoneNumber, String email, String imagePath) {
        this.id = id;
        this.title = title;
        this.domain = domain;
        this.about = about;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imagePath = imagePath;
    }

    public Company(String title, Domain domain, String about, String phoneNumber, String email, String imagePath) {
        this.title = title;
        this.domain = domain;
        this.about = about;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imagePath = imagePath;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.domain);
        hash = 53 * hash + Objects.hashCode(this.about);
        hash = 53 * hash + Objects.hashCode(this.phoneNumber);
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.imagePath);
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
        if (!Objects.equals(this.imagePath, other.imagePath)) {
            return false;
        }
        if (this.domain != other.domain) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", title=" + title + ", domain=" + domain + ", about=" + about + ", phoneNumber=" + phoneNumber + ", email=" + email + ", imagePath=" + imagePath + '}';
    }

    public byte[] getImgData() {
        return imgData;
    }

    public void setImgData(byte[] imgData) {
        this.imgData = imgData;
    }
    
}
