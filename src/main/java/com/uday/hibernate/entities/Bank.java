package com.uday.hibernate.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="BANK_ID")
    private int bankId;
    private String bankName;

    @ElementCollection
    @CollectionTable(name="BANK_CONTACTS",
            joinColumns = @JoinColumn(name="BANK_ID"))
    @Column(name="BANK_CONTACT")
    private List<String> contacts=new ArrayList<String>();

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }
}
