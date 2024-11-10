package org.main;

import org.vehicle.GoodsVehicle;
import org.vehicle.SpeedVehicle;
import org.vehicle.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Stratgay Pattern implementation
        //Vehicle vehicle = new GoodsVehicle();
        Vehicle vehicle = new SpeedVehicle();
        vehicle.drive();
    }
}