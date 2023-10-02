package ModelElements;

import Stuff.Angel3D;
import Stuff.Point3D;

public class Camera{
    public Point3D location;
    public Angel3D angle;    

    public Camera(Point3D location, Angel3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate(Angel3D angle) {
        this.angle = angle;
    }

    public void Move(Point3D location) {
        this.location = location;
    }      
}
