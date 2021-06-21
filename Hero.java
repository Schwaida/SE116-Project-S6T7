package SE116Project;

import java.util.ArrayList;

public class Hero extends Characters{
    public static ArrayList<String> heroInventory = new ArrayList<>();
    private static final int hitPoint =200;
    private static final double defense =0.8;
    private static final double damage =50;
    public Hero(String name, int hitPoint,double defense,double damage) {
        super(name,hitPoint,defense,damage);

    }

    public Hero(String name){
        this(name,hitPoint,defense,damage);
    }
}
