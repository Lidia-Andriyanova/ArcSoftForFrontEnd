package InMemoryModel;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;
import Stuff.Angel3D;
import Stuff.Point3D;

public class ModelStore implements iModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;

    public ModelStore(iModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        List<Texture> Textures = new ArrayList<>();
        models.add(new PoligonalModel(Textures));
        flashes.add(new Flash(new Point3D(), new Angel3D(), new Color(0, 0, 0), (float)0));
        cameras.add(new Camera(new Point3D(), new Angel3D()));
        scenes.add(new Scene(0, models, flashes, cameras));         
    }

    public Scene getScena(int id) 
    {
        for (int i = 0; i < scenes.size(); i++)
        {
            if (scenes.get(i).id == id)
            {
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange(iModelChanger sender) {
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }
}
    
