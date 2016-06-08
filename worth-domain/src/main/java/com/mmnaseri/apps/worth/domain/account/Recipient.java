package com.mmnaseri.apps.worth.domain.account;

import com.mmnaseri.apps.worth.domain.access.Tracker;
import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 5:45 PM)
 */
public abstract class Recipient extends PersistentDomainObject {

    @DBRef
    private Tracker tracker;
    private String name;

    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
