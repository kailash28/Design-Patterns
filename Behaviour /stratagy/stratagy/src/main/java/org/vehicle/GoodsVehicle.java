package org.vehicle;

import org.stratagy.NormalDriveStratgy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDriveStratgy());
    }
}
