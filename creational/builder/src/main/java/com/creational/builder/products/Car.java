package com.creational.builder.products;

import com.creational.builder.components.Engine;
import com.creational.builder.components.GPSNavigator;
import com.creational.builder.components.Transmission;
import com.creational.builder.components.TripComputer;

public class Car {
    private CarType type;
    private String color;
    private Engine engine;
    private int seats;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    private TripComputer tripComputer;
    private double fuel = 0;

    public Car(CarType type, String color, Engine engine, int seats, Transmission transmission,
               GPSNavigator gpsNavigator, TripComputer tripComputer) {
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
        this.tripComputer.setCar(this);
    }

    public CarType getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }
    public Transmission getTransmission() {
        return transmission;
    }
    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
    public TripComputer getTripComputer() {
        return tripComputer;
    }
    public double getFuel() {
        return fuel;
    }
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public void fill(double fuel) {
        if (fuel < 0) {
            System.err.println("Cannot fill negative fuel!");
            return;
        }
        this.fuel += fuel;
        System.out.println("Added " + fuel + " liters of fuel. Total: " + this.fuel + " liters.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", seats=" + seats +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator.getRoute() +
                ", tripComputer=" + tripComputer +
                ", fuel=" + fuel +
                '}';
    }

}

