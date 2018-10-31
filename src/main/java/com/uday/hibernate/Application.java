package com.uday.hibernate;

import com.uday.hibernate.entities.AccountType;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class Application {
    public static void main(String args[]){
        SessionFactory sf= ConnectionFactory.getSessionFactory();
        Session session=sf.openSession();
        AccountType accountType=new AccountType();
        accountType.setCreatedBy("Uday");
        accountType.setCreatedDate(new Date());
        accountType.setLastUpdatedBy("Uday");
        accountType.setLastUpdatedDate(new Date());
        session.beginTransaction();
        session.save(accountType);
        session.close();
    }
}
