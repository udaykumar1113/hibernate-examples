package com.uday.hibernate;

import com.uday.hibernate.entities.TemporalDateTime;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

public class TemporalUsage {
    public static void main(String args[]){
        SessionFactory sf= ConnectionFactory.getSessionFactory();
        Session session=sf.openSession();

        TemporalDateTime temporalDateTime=new TemporalDateTime();
        temporalDateTime.setDate(new Date());
        temporalDateTime.setDateTime(new Date());
        temporalDateTime.setTime(new Date());
        temporalDateTime.setTimeStamp(new Date());

        temporalDateTime.setSqlDate(new java.sql.Date(new Date().getTime()));
        temporalDateTime.setSqlDateTime(new java.sql.Timestamp(new Date().getTime()));
        temporalDateTime.setSqltime(new java.sql.Time(new Date().getTime()));
        temporalDateTime.setSqlTimestamp(new java.sql.Timestamp(new Date().getTime()));

        session.beginTransaction();
        session.save(temporalDateTime);
        session.close();
    }
}
