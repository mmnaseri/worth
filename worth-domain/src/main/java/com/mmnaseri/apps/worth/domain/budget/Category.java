package com.mmnaseri.apps.worth.domain.budget;

import com.mmnaseri.apps.worth.domain.access.Tracker;
import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/7/16)
 */
@Document(collection = "categories")
public class Category extends PersistentDomainObject {

    @DBRef
    private Tracker tracker;
    private String name;
    private String memo;
    private Double defaultAmount;
    @DBRef
    private Section section;
    @DBRef
    private Plan plan;

    public Tracker getTracker() {
        return tracker;
    }

    public Category setTracker(Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getMemo() {
        return memo;
    }

    public Category setMemo(String memo) {
        this.memo = memo;
        return this;
    }

    public Double getDefaultAmount() {
        return defaultAmount;
    }

    public Category setDefaultAmount(Double defaultAmount) {
        this.defaultAmount = defaultAmount;
        return this;
    }

    public Section getSection() {
        return section;
    }

    public Category setSection(Section section) {
        this.section = section;
        return this;
    }

    public Plan getPlan() {
        return plan;
    }

    public Category setPlan(Plan plan) {
        this.plan = plan;
        return this;
    }
}
