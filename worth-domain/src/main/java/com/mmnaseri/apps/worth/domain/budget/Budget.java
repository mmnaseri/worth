package com.mmnaseri.apps.worth.domain.budget;

import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.util.List;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/7/16)
 */
@Document(collection = "budgets")
public class Budget extends PersistentDomainObject {

    @DBRef
    private Plan plan;
    private Date date;
    private List<Bucket> buckets;

    public Plan getPlan() {
        return plan;
    }

    public Budget setPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Budget setDate(Date date) {
        this.date = date;
        return this;
    }

    public List<Bucket> getBuckets() {
        return buckets;
    }

    public Budget setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
        return this;
    }

}
