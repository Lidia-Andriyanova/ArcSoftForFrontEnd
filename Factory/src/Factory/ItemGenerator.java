package Factory;

import Interfaces.IGameItem;

public abstract class ItemGenerator {
    
    public abstract IGameItem createItem();
    
    public void openReward() {
        createItem().open();
    }
}
