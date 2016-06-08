package com.mmnaseri.apps.worth.domain.taxonomy;

import com.mmnaseri.apps.worth.domain.access.Tracker;
import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 4:23 PM)
 */
@Document(collection = "tags")
public class Tag extends PersistentDomainObject {

    @DBRef
    private Tracker tracker;
    private String name;
    private String description;
    private String color;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
