package ModelElements;

import java.awt.Color;

import Stuff.Angel3D;
import Stuff.Point3D;

public class Flash{
    public Point3D location;
    public Angel3D angle;
    public Color color;
    public Float power;


    public Flash(Point3D location, Angel3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void Rotate(Angel3D angle) {
        this.angle = angle;
    }

    public void Move(Point3D location) {
        this.location = location;
    }    

}
