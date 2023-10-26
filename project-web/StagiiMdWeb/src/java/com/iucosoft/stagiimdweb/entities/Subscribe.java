/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.entities;

import java.util.Objects;

/**
 *
 * @author munka
 */
public class Subscribe {
    private int id;
    private String position;
    private String fullName;
    private String email;

    public Subscribe() {
    }

    public Subscribe(int id, String position, String fullName, String email) {
        this.id = id;
        this.position = position;
        this.fullName = fullName;
        this.email = email;
    }

    public Subscribe(String position, String fullName, String email) {
        this.position = position;
        this.fullName = fullName;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.position);
        hash = 19 * hash + Objects.hashCode(this.fullName);
        hash = 19 * hash + Objects.hashCode(this.email);
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
        final Subscribe other = (Subscribe) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (!Objects.equals(this.fullName, other.fullName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Subscribe{" + "id=" + id + ", position=" + position + ", fullName=" + fullName + ", email=" + email + '}';
    }
    
    
}
