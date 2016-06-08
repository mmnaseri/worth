package com.mmnaseri.apps.worth.domain.account;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 5:46 PM)
 */
@Document(collection = "payees")
public class Payee extends Recipient {
}
