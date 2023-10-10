package com.iucosoft.stagiimdweb.entities;

import com.iucosoft.stagiimdweb.utility.Role;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author munka
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date registDate;
    protected Role role;

    public User() {
    }
    
    public User(int id, String username, String password, Date registDate, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.registDate = registDate;
        this.role = role;
    }

    public User(String username, String password, Date registDate, Role role) {
        this.username = username;
        this.password = password;
        this.registDate = registDate;
        this.role = role;
    }

    

    public Role getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.username);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + Objects.hashCode(this.registDate);
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
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.registDate, other.registDate)) {
            return false;
        }
        return true;
    }
    
    
}
