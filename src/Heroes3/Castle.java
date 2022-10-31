package Heroes3;

import java.util.Random;

public class Castle {
    private String name;
    private String[] castlesName = { "Fortress" , "Stronghold" , "Necropolis" , "Dungeon" , "Rampart"};
    private int[] army = new int[7];

    public void setName() {
        Random rand = new Random();
        this.name = this.castlesName[rand.nextInt(5)];
    }

    public String getName() {
        return name;
    }

    public void ustawArmie() {
        Random rand = new Random();
        for (int x =0; x< 7; x++) {
            army[x] = rand.nextInt(100);
        }

    }

    public int[] getArmy() {
        return army;
    }

    public void setArmy(int[] army) {
        this.army = army;
    }
}
