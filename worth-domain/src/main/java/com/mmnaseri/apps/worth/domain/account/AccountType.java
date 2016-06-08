package com.mmnaseri.apps.worth.domain.account;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 5:41 PM)
 */
public enum AccountType {

    /**
     * An asset that has value
     */
    ASSET,
    /**
     * A liability
     */
    LIABILITY,
    /**
     * Cash
     */
    CASH,
    /**
     * Debt you owe yet
     */
    DEBT,
    /**
     * A virtual account (PayPal, store credit, etc.)
     */
    VIRTUAL

}
