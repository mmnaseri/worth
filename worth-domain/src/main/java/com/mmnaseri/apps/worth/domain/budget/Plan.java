package com.mmnaseri.apps.worth.domain.budget;

import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/7/16)
 */
@Document(collection = "plans")
public class Plan extends PersistentDomainObject {

    @DBRef
    private Plan parent;
    @DBRef
    private List<Section> sections;
    private String name;

    public Plan getParent() {
        return parent;
    }

    public Plan setParent(Plan parent) {
        this.parent = parent;
        return this;
    }

    public List<Section> getSections() {
        return sections;
    }

    public Plan setSections(List<Section> sections) {
        this.sections = sections;
        return this;
    }

    public String getName() {
        return name;
    }

    public Plan setName(String name) {
        this.name = name;
        return this;
    }
}
