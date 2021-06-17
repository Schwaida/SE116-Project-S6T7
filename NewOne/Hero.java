package NewOne;

import java.util.ArrayList;

public class Hero extends Characters{
    public static ArrayList<String> heroInventory = new ArrayList<>();

    private static final int hitPoint =1000;
    private static final double defense =0.8;
    private static final double strength =50;     // damage = current item a göre olmalı



    public Hero(String name, int hitPoint,double defense,double strength) {
        super(name,hitPoint,defense,strength);

    }

    public Hero(String name){
        this(name,hitPoint,defense,strength);
    }



    /*public int attack(){
     return Items.rand.nextInt();
    }*/
}
