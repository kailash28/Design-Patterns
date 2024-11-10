package org.vehicle;

import org.stratagy.DriveStratagy;

public class Vehicle {
    DriveStratagy driveStratagy;

    public Vehicle(DriveStratagy driveStratagy){
        this.driveStratagy = driveStratagy;
    }
    public void drive(){
       driveStratagy.drive();
    }
}
