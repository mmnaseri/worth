package com.mmnaseri.apps.worth.domain.tx;

import com.mmnaseri.apps.worth.domain.access.Tracker;
import com.mmnaseri.apps.worth.domain.account.Account;
import com.mmnaseri.apps.worth.domain.taxonomy.Tag;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (6/7/16, 4:22 PM)
 */
public abstract class Transaction {

    @DBRef
    private Tracker tracker;
    @DBRef
    private Account account;
    private Double amount;
    @DBRef
    private Set<Tag> tags;
    private String memo;
    @DBRef
    private Transaction reference;
    private Status status;
    private Date date;
    @DBRef
    private List<Attribution> attributions;

    public Tracker getTracker() {
        return tracker;
    }

    public void setTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Transaction getReference() {
        return reference;
    }

    public void setReference(Transaction reference) {
        this.reference = reference;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Attribution> getAttributions() {
        return attributions;
    }

    public Transaction setAttributions(List<Attribution> attributions) {
        this.attributions = attributions;
        return this;
    }

}
