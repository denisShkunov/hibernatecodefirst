package com.example.hibernatecodefirst.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "bikes")
public class Bike extends Vehicle {
    private static final String type = "BIKE";

    public Bike(long id, String fuelType, String model, BigDecimal price) {
        super(id, fuelType, model, price, type);
    }

    public Bike() {

    }
}
