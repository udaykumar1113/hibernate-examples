package com.uday.hibernate;

import com.uday.hibernate.entities.AddressCompositeCollection;
import com.uday.hibernate.entities.UserCompositeCollection;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class CompositeCollectionMapping {
    public static void main(String args[]){

        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        AddressCompositeCollection address1=new AddressCompositeCollection();
        address1.setAddressLine1("Clifton street");
        address1.setAddressLine2("Apt #14");
        address1.setCity("Edison");
        address1.setState("NJ");

        AddressCompositeCollection address2=new AddressCompositeCollection();
        address2.setAddressLine1("Bruinswick street");
        address2.setAddressLine2("Apt #13");
        address2.setCity("Edison");
        address2.setState("NJ");

        List<AddressCompositeCollection> addressList=new ArrayList<AddressCompositeCollection>();
        addressList.add(address1);
        addressList.add(address2);

        UserCompositeCollection user=new UserCompositeCollection();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setAddressList(addressList);

        session.save(user);
        transaction.commit();
    }
}
