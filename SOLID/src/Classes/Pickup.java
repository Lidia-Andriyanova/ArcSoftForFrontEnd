package Classes;

import java.awt.Color;

import Enumerators.BodyType;
import Enumerators.FuelType;
import Enumerators.GearBoxType;
import Interfaces.ICarWip;
import Interfaces.IFuelStation;

public class Pickup extends Car implements IFuelStation, ICarWip{

    private float loadCapacity;

    public Pickup(String make, String model, Color color, int wheellNum, GearBoxType gearBoxType,
            FuelType fuelType, float engineCapacity, float loadCapacity) {

        super(make, model, color, BodyType.PICKUP, wheellNum, gearBoxType, fuelType, engineCapacity);
     
        this.loadCapacity = loadCapacity; 
    }

    @Override
    public void fuel() {
    }

    @Override
    public void wipeWindShield() {
    }

    @Override
    public void wipeHeadLights() {
    }

    @Override
    public void wipeMirrows() {
    }
}
