package Heroes3;

import java.util.Random;

public class Castle {
    private String name;
    private String[] castlesName = { "Fortress" , "Stronghold" , "Necropolis" , "Dungeon" , "Rampart"};

    public void setName() {
        Random rand = new Random();
        this.name = this.castlesName[rand.nextInt(5)];
    }
}
