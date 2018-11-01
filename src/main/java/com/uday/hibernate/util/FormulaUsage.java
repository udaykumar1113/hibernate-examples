package com.uday.hibernate.util;

import com.uday.hibernate.entities.TemporalDateTime;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FormulaUsage {
    public static void main(String args[]){

        SessionFactory sessionFactory=ConnectionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        TemporalDateTime temporalDateTime=session.get(TemporalDateTime.class,1);
        System.out.println("The date of first inserted record is "+temporalDateTime.getFirstIdDate());
        session.close();
    }
}
