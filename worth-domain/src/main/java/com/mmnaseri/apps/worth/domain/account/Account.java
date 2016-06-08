package com.mmnaseri.apps.worth.domain.account;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 4:22 PM)
 */
@Document(collection = "accounts")
public class Account extends Recipient {

    private AccountType accountType;
    private boolean budgetAccount;

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public boolean isBudgetAccount() {
        return budgetAccount;
    }

    public void setBudgetAccount(boolean budgetAccount) {
        this.budgetAccount = budgetAccount;
    }
}
