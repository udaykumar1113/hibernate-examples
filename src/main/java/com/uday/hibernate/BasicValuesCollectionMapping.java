package com.uday.hibernate;

import com.uday.hibernate.entities.Bank;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BasicValuesCollectionMapping {
    public static void main(String args[]){

        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Bank bank=new Bank();
        bank.setBankName("BANK OF AMERICA");

        bank.getContacts().add("111-111-1111");
        bank.getContacts().add("222-222-2222");

        System.out.println(bank);
        session.save(bank);
        transaction.commit();

        session.close();
    }
}
