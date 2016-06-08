package com.mmnaseri.apps.worth.domain.common;

import org.springframework.data.annotation.*;

import java.util.Date;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 4:18 PM)
 */
public class PersistentDomainObject extends DomainObject {

    @Id
    private String id;
    @LastModifiedBy
    private String modifiedBy;
    @LastModifiedDate
    private Date modifiedDate;
    @CreatedBy
    private String createdBy;
    @CreatedDate
    private Date createdDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
