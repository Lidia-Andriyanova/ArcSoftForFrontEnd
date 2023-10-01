package ModelElements;

import java.util.List;

public class Scene {
    private static int currentSceneId = 0;

    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = ++currentSceneId;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public <Type extends SceneElement> Type method1(Type type) {
        return type;
    }    

    public <Type extends SceneElement> Type method2(Type type1, Type type2) {
        if (type1 != null)
            return type1;
        else    
            return type2;
    }        
}
