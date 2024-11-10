package org.vehicle;

import org.stratagy.SpecialDriveStratagy;

public class SpeedVehicle extends Vehicle{
    public SpeedVehicle(){
        super(new SpecialDriveStratagy());
    }
}
