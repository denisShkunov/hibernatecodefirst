package com.example.hibernatecodefirst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "planes")
public class Plane extends Vehicle{
    private static final String type = "PLANE";

    private String airline;

    @Column(name = "passenger_capacity")
    private int passengerCapacity;

    public Plane(long id, String fuelType, String model, BigDecimal price, String airline, int passengerCapacity) {
        super(id, fuelType, model, price, type);
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
    }

    public Plane() {

    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
