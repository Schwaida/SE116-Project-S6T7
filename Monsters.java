package NewOne;

import java.util.ArrayList;

public class Monsters extends Characters{
    public static ArrayList<String> monsterInventory = new ArrayList<>();


    public Monsters(String name, int hitPoint, double defense,double damage) {
        super(name,hitPoint,defense,damage);
    }


    public Monsters() {

    }



}
