package com.bob4f.design.creational.factory.unit1;


public class RouteLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
