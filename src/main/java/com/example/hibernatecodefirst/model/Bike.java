package com.example.hibernatecodefirst.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bikes")
public class Bike extends Vehicle {
    private static final String type = "BIKE";

    public Bike(long id, String fuelType, String model, long price, String type) {
        super(id, fuelType, model, price, type);
    }

    public Bike() {

    }
}
