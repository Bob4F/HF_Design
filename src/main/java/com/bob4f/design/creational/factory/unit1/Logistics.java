package com.bob4f.design.creational.factory.unit1;

public abstract class Logistics {

    String planDeliver(Transport t){
        return t.deliver();
    }

    abstract Transport createTransport();

}
