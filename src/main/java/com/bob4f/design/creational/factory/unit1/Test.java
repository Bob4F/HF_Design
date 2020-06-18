package com.bob4f.design.creational.factory.unit1;


public class Test {

    public static void main(String[] args) {
        Logistics logistics = new RouteLogistics();
        String result = logistics.planDeliver(logistics.createTransport());
        System.out.println("logistics:" + result);
    }

}
