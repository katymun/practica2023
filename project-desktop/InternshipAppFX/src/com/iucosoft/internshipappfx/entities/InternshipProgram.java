package com.iucosoft.internshipappfx.entities;

import com.iucosoft.internshipappfx.utility.Domain;
import java.util.Date;
import java.util.Objects;

public class InternshipProgram {
    private int id;
    private String iName;
    private Domain domain;
    private Date startDate;
    private String duration;
    private String duties;
    private String qualifications;
    private String benefits;
    private String location;
    private boolean paid;
    private int idCompany;

    public InternshipProgram() {
    }

    public InternshipProgram(String iName, Domain domain, Date startDate, 
            String duration, int idCompany, String duties, String qualifications, 
            String benefits, String location, boolean paid) {
        this.iName = iName;
        this.domain = domain;
        this.startDate = startDate;
        this.duration = duration;
        this.duties = duties;
        this.qualifications = qualifications;
        this.benefits = benefits;
        this.location = location;
        this.paid = paid;
        this.idCompany = idCompany;
    }

    public InternshipProgram(int id, String iName, Domain domain, Date startDate, 
            String duration, int idCompany, String duties, String qualifications, 
            String benefits, String location, boolean paid) {
        this.id = id;
        this.iName = iName;
        this.domain = domain;
        this.startDate = startDate;
        this.duration = duration;
        this.duties = duties;
        this.qualifications = qualifications;
        this.benefits = benefits;
        this.location = location;
        this.paid = paid;
        this.idCompany = idCompany;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.iName);
        hash = 67 * hash + Objects.hashCode(this.domain);
        hash = 67 * hash + Objects.hashCode(this.startDate);
        hash = 67 * hash + Objects.hashCode(this.duration);
        hash = 67 * hash + Objects.hashCode(this.duties);
        hash = 67 * hash + Objects.hashCode(this.qualifications);
        hash = 67 * hash + Objects.hashCode(this.benefits);
        hash = 67 * hash + Objects.hashCode(this.location);
        hash = 67 * hash + (this.paid ? 1 : 0);
        hash = 67 * hash + this.idCompany;
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
        if (this.paid != other.paid) {
            return false;
        }
        if (this.idCompany != other.idCompany) {
            return false;
        }
        if (!Objects.equals(this.iName, other.iName)) {
            return false;
        }
        if (!Objects.equals(this.duration, other.duration)) {
            return false;
        }
        if (!Objects.equals(this.duties, other.duties)) {
            return false;
        }
        if (!Objects.equals(this.qualifications, other.qualifications)) {
            return false;
        }
        if (!Objects.equals(this.benefits, other.benefits)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (this.domain != other.domain) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InternshipProgram{" + "id=" + id + ", iName=" + iName + ", domain=" + domain + ", startDate=" + startDate + ", duration=" + duration + ", duties=" + duties + ", qualifications=" + qualifications + ", benefits=" + benefits + ", location=" + location + ", paid=" + paid + ", idCompany=" + idCompany + '}';
    }
    
    
}
