package com.mmnaseri.apps.worth.domain.tx;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 4:30 PM)
 */
@Document(collection = "transactions")
public class FlowTransaction extends Transaction {
}
