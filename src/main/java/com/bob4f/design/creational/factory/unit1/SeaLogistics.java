package com.bob4f.design.creational.factory.unit1;

public class SeaLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
