package com.uday.hibernate;

import com.uday.hibernate.entities.Customer;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MapOfBasicValueMapping {

    public static void main(String args[]){

        SessionFactory sessionFactory=ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Customer customer=new Customer();
        customer.setCustomerName("Ron Johnson");
        customer.getCars().put("HONDA","ACCORD");
        customer.getCars().put("NISSAN","MAXIMA");

        session.save(customer);
        transaction.commit();
        session.close();
    }
}
