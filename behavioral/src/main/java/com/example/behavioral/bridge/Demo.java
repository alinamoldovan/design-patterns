package com.example.behavioral.bridge;

import com.example.behavioral.bridge.devices.Device;
import com.example.behavioral.bridge.devices.Radio;
import com.example.behavioral.bridge.devices.TV;
import com.example.behavioral.bridge.remote.AdvancedRemote;
import com.example.behavioral.bridge.remote.BasicRemote;

public class Demo {

    /**
     * The Bridge pattern is a structural design pattern that separates an abstraction from its implementation,
     * allowing them to vary independently. This is useful when you want to decouple the interface from the
     * implementation, enabling flexibility and extensibility.
     *
     * In this example, we have a `Device` interface representing different devices (like TV and Radio),
     * and a `Remote` interface for controlling these devices. The `BasicRemote` and `AdvancedRemote` classes
     * implement the `Remote` interface, allowing for basic and advanced functionalities respectively.
     */
 public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
