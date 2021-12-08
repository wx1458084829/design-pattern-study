package com.namo.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("飞机");
        vehicle2.runRoad("摩托车");
    }
}

/**
 * 遵守单一职责原则
 * 方法级别遵单一职责
 */

class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中上运行...");
    }
}
