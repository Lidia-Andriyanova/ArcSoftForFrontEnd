package Factory;

import Interfaces.IGameItem;
import Product.Iron;

public class IronGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Iron();
    }
    
}
