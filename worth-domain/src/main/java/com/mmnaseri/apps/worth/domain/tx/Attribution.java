package com.mmnaseri.apps.worth.domain.tx;

import com.mmnaseri.apps.worth.domain.access.Tracker;
import com.mmnaseri.apps.worth.domain.budget.Bucket;
import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/7/16)
 */
@Document(collection = "attributions")
public class Attribution extends PersistentDomainObject {

    @DBRef
    private Tracker tracker;
    @DBRef
    private Bucket bucket;
    @DBRef
    private Transaction transaction;

    public Tracker getTracker() {
        return tracker;
    }

    public Attribution setTracker(Tracker tracker) {
        this.tracker = tracker;
        return this;
    }

    public Bucket getBucket() {
        return bucket;
    }

    public Attribution setBucket(Bucket bucket) {
        this.bucket = bucket;
        return this;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public Attribution setTransaction(Transaction transaction) {
        this.transaction = transaction;
        return this;
    }

}
