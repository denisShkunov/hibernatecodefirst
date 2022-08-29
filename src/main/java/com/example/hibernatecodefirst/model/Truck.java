package com.example.hibernatecodefirst.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "trucks")
public class Truck extends Vehicle{
    private static final String type = "TRUCK";

    @Column(name = "load_capacity")
    private double loadCapacity;

    public Truck(long id, String fuelType, String model, BigDecimal price, double loadCapacity) {
        super(id, fuelType, model, price, type);
        this.loadCapacity = loadCapacity;
    }

    public Truck() {
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
