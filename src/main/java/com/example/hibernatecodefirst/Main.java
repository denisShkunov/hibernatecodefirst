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
            // дописать CRUD операции
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Plane plane = new Plane(2, "fuel", "TU-134", new BigDecimal("121"), "airline", 80);
            Car car = new Car(3, "fuel", "BMW", new BigDecimal("50000"), 12);
            Bike bike = new Bike(4, "fuel", "KAWASAKI", new BigDecimal("20000"));
            Truck truck = new Truck(5, "fuel", "VOLVO", new BigDecimal("66666"), 12.2);
            session.save(plane);
            session.save(car);
            session.save(bike);
            session.save(truck);
            // Get query
            System.out.println(session.get(Plane.class, 1L));
            // Delete query
            session.delete(session.get(Plane.class, 1L));
            session.createQuery("delete Plane where id = 1").executeUpdate();
            //Update query
            truck.setLoadCapacity(13.2);
            session.save(truck);


        } finally {
            sessionFactory.close();
        }

    }
}
