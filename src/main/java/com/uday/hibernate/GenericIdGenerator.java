package com.uday.hibernate;

import com.uday.hibernate.entities.Song;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenericIdGenerator {
    public static void main(String args[]){
        SessionFactory sessionFactory= ConnectionFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Song song1=new Song();
        song1.setSongName("DRAKE");
        song1.setLength(4);
        session.save(song1);
        session.close();
    }
}
