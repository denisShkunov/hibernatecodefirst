package com.example.hibernatecodefirst.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car extends Vehicle {
    private static final String type = "CAR";

    private int seats;

    public Car(long id, String fuelType, String model, BigDecimal price, int seats) {
        super(id, fuelType, model, price, type);
        this.seats = seats;
    }

    public Car() {

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
