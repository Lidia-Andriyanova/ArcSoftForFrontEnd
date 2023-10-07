package Factory;

import Interfaces.IGameItem;
import Product.Wood;

public class WoodGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Wood();
    }
    
}
