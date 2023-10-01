package ModelElements;

import java.util.List;
import java.util.ArrayList;

public class PoligonalModel extends SceneElement{
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
    }
}