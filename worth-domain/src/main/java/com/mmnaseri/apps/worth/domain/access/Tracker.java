package com.mmnaseri.apps.worth.domain.access;

import com.mmnaseri.apps.worth.domain.common.PersistentDomainObject;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 4:17 PM)
 */
@Document(collection = "trackers")
public class Tracker extends PersistentDomainObject {
}
