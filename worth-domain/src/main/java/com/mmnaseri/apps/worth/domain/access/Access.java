package com.mmnaseri.apps.worth.domain.access;

import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 4:24 PM)
 */
@Document(collection = "access")
public class Access extends PersistentDomainObject {

    @DBRef
    private User user;
    @DBRef
    private Tracker tracker;
    private Set<AccessRight> accessRights;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public Set<AccessRight> getAccessRights() {
        return accessRights;
    }

    public void setAccessRights(Set<AccessRight> accessRights) {
        this.accessRights = accessRights;
    }

}
