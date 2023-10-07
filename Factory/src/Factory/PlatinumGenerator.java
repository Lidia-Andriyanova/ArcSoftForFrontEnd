package Factory;

import Interfaces.IGameItem;
import Product.Platinum;

public class PlatinumGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
    
}
