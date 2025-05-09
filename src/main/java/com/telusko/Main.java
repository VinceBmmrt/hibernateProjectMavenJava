package com.telusko;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Laptop l1 = session.get(Laptop.class, 2);
        System.out.println(l1);
        session.close();


        Session session1 = sf.openSession();

        Laptop l2 = session1.get(Laptop.class, 2);
        System.out.println(l2);

        session1.close();


        sf.close();


    }
}