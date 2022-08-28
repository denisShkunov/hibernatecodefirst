package com.example.hibernatecodefirst;

import com.example.hibernatecodefirst.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure().addAnnotatedClass(Vehicle.class);
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Plane plane = new Plane(1, "fuel", "TU-134", new BigDecimal("32.2"), "airline", 80);
//        session.save(plane);
//
//        session.getTransaction().commit();
//        session.close();

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Vehicle.class)
                .addAnnotatedClass(Plane.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Truck.class)
                .addAnnotatedClass(Bike.class)
                .buildSessionFactory();

        try {
            //todo  исправить long на BigDecimal по заданию
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Plane plane = new Plane(2, "fuel", "TU-134",121, "airline", 80);
            session.save(plane);
        } finally {
            sessionFactory.close();
        }

    }
}
