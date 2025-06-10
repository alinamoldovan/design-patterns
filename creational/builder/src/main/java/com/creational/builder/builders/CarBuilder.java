package com.creational.builder.builders;

import com.creational.builder.components.Engine;
import com.creational.builder.components.GPSNavigator;
import com.creational.builder.components.Transmission;
import com.creational.builder.components.TripComputer;
import com.creational.builder.products.Car;
import com.creational.builder.products.CarType;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, "black",engine,seats, transmission,gpsNavigator, tripComputer);
    }

}
