package SE116Project;

import java.util.ArrayList;

public class Monsters extends Characters{

   /* private static final int hitPoint=200;
    private static final double defense=0.6;
    private static final double damage=30;*/
    public static ArrayList<String> monsterInventory = new ArrayList<>();


    public Monsters(String name, int hitPoint, double defense,double damage) {
        super(name,hitPoint,defense,damage);
    }




}
