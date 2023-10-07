package Factory;

import Interfaces.IGameItem;
import Product.Pearl;

public class PearlGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Pearl();
    }
    
}
