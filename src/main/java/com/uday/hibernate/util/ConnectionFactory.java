package com.uday.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionFactory {

    public static SessionFactory getSessionFactory() {
        SessionFactory sf=new Configuration()
                .configure("hibernate-cfg.xml")
                .buildSessionFactory();
        return sf;
    }
}
