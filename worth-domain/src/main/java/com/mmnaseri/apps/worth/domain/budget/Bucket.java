package com.mmnaseri.apps.worth.domain.budget;

import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/7/16)
 */
@Document(collection = "buckets")
public class Bucket extends PersistentDomainObject {

    @DBRef
    private Category category;
    @DBRef
    private Budget budget;
    private Double amount;

    public Category getCategory() {
        return category;
    }

    public Bucket setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Budget getBudget() {
        return budget;
    }

    public Bucket setBudget(Budget budget) {
        this.budget = budget;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public Bucket setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

}
