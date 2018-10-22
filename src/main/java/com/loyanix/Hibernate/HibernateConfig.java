package com.loyanix.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    static { sessionFactory = new Configuration().configure().buildSessionFactory(); }

    public static SessionFactory getSessionFactory() { return sessionFactory; }
}
