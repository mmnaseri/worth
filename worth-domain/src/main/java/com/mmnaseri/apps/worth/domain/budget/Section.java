package com.mmnaseri.apps.worth.domain.budget;

import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/7/16)
 */
@Document(collection = "sections")
public class Section extends PersistentDomainObject {

    @DBRef
    private Plan plan;
    private String name;
    private String memo;

    public Plan getPlan() {
        return plan;
    }

    public Section setPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    public String getName() {
        return name;
    }

    public Section setName(String name) {
        this.name = name;
        return this;
    }

    public String getMemo() {
        return memo;
    }

    public Section setMemo(String memo) {
        this.memo = memo;
        return this;
    }

}
