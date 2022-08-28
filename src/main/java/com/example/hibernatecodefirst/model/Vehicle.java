package com.example.hibernatecodefirst.model;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fuel_type")
    private String fuelType;
    private String model;
    private long price;
    @Basic
    private String type;

    protected Vehicle() {
    }

    public Vehicle(long id, String fuelType, String model, long price, String type) {
        this.id = id;
        this.fuelType = fuelType;
        this.model = model;
        this.price = price;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuel_type) {
        this.fuelType = fuel_type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
