package com.creational.builder.builders;

import com.creational.builder.components.Engine;
import com.creational.builder.components.GPSNavigator;
import com.creational.builder.components.Transmission;
import com.creational.builder.components.TripComputer;
import com.creational.builder.products.CarType;

public interface  Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
