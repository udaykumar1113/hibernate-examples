package com.uday.hibernate;

import com.uday.hibernate.entities.Address;
import com.uday.hibernate.entities.User;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CompositeValueMapping {
    public static void main(String args[]){
        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Address address=new Address();

        address.setAddressLine1("Clifton street");
        address.setAddressLine2("Apt #14");
        address.setCity("Edison");
        address.setState("NJ");

        User user=new User();
        user.setFirstName("John");
        user.setLastName("Wallace");
        user.setAddress(address);

        session.save(user);
        transaction.commit();

        session.close();
    }
}
