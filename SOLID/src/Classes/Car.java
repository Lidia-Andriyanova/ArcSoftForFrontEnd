package Classes;
import java.awt.*;

import Enumerators.BodyType;
import Enumerators.FuelType;
import Enumerators.GearBoxType;

public abstract class Car {
    
    private String make;
    private String model;
    private Color color;
    private BodyType bodyType;
    private int wheellNum;
    private GearBoxType gearBoxType;
    private FuelType fuelType;
    private float engineCapacity;
    
    public Car(String make, String model, Color color, BodyType bodyType, int wheellNum, GearBoxType gearBoxType,
            FuelType fuelType, float engineCapacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.wheellNum = wheellNum;
        this.gearBoxType = gearBoxType;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public void movement() {}
    public void maintenance() {}
    public boolean turnLights() {return true;}
    public boolean turnWipers() {return true;}

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public int getWheellNum() {
        return wheellNum;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
