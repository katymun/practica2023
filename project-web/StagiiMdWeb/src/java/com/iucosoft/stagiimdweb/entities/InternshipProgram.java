package com.iucosoft.stagiimdweb.entities;

import com.iucosoft.stagiimdweb.utility.Domain;
import java.util.Date;
import java.util.Objects;

public class InternshipProgram {
    private int id;
    private String iName;
    private Domain domain;
    private Date startDate;
    private String duration;
    private String description;
    private int idCompany;

    public InternshipProgram() {
    }

    public InternshipProgram(String iName, Domain domain, Date startDate, String duration, String description) {
        this.iName = iName;
        this.domain = domain;
        this.startDate = startDate;
        this.duration = duration;
        this.description = description;
    }

    public InternshipProgram(int id, String iName, Domain domain, Date startDate, String duration, String description, int idCompany) {
        this.id = id;
        this.iName = iName;
        this.domain = domain;
        this.startDate = startDate;
        this.duration = duration;
        this.description = description;
        this.idCompany = idCompany;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.iName);
        hash = 79 * hash + Objects.hashCode(this.domain);
        hash = 79 * hash + Objects.hashCode(this.startDate);
        hash = 79 * hash + Objects.hashCode(this.duration);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + this.idCompany;
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
        final InternshipProgram other = (InternshipProgram) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idCompany != other.idCompany) {
            return false;
        }
        if (!Objects.equals(this.iName, other.iName)) {
            return false;
        }
        if (!Objects.equals(this.domain, other.domain)) {
            return false;
        }
        if (!Objects.equals(this.duration, other.duration)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InternshipProgram{" + "id=" + id + ", iName=" + iName + ", domain=" + domain + ", startDate=" + startDate + ", duration=" + duration + ", description=" + description + ", idCompany=" + idCompany + '}';
    }
    
}
