package com.uday.hibernate.service;

import com.uday.hibernate.entities.TemporalDateTime;
import com.uday.hibernate.util.ConnectionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class SongIdGenerator implements IdentifierGenerator {

    private static int identifier=0;
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {

        return "PRS"+1;
    }
}
