import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Factory.BronzeGenerator;
import Factory.GemGenerator;
import Factory.GoldGenerator;
import Factory.IronGenerator;
import Factory.ItemGenerator;
import Factory.PearlGenerator;
import Factory.PlatinumGenerator;
import Factory.SilverGenerator;
import Factory.WoodGenerator;

public class App {
    public static void main(String[] args) throws Exception {

        List<ItemGenerator> generatorList = new ArrayList<>();

        for(int i = 0; i < 2; i++) {
            generatorList.add(new GemGenerator());
        }

        for(int i = 0; i < 3; i++) {
            generatorList.add(new PearlGenerator());
        }        

        for(int i = 0; i < 5; i++) {
            generatorList.add(new PlatinumGenerator());
        }        

        for(int i = 0; i < 10; i++) {
            generatorList.add(new GoldGenerator());
        }

        for(int i = 0; i < 15; i++) {
            generatorList.add(new SilverGenerator());        
        }

        for(int i = 0; i < 25; i++) {
            generatorList.add(new BronzeGenerator());        
        }

        for(int i = 0; i < 30; i++) {
            generatorList.add(new IronGenerator());        
        }      
        
        for(int i = 0; i < 30; i++) {
            generatorList.add(new WoodGenerator());        
        }           

        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            int index = random.nextInt(120);
            generatorList.get(index).openReward();
        }
    }
}
