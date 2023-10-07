package ModelElements;

import java.util.List;

import Stuff.Point3D;

import java.util.ArrayList;

public class PoligonalModel{
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();

        List<Point3D> points = new ArrayList<>();
        points.add(new Point3D());
        this.poligons.add(new Poligon(points));
    }
}