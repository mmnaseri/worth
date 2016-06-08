package com.mmnaseri.apps.worth.domain.tx;

import com.mmnaseri.apps.worth.domain.account.Account;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 5:49 PM)
 */
@Document(collection = "transactions")
public class TransferTransaction extends Transaction {

    @DBRef
    private Account target;

    public Account getTarget() {
        return target;
    }

    public void setTarget(Account target) {
        this.target = target;
    }

}
