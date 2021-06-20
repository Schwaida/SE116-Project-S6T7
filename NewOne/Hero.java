package NewOne;

import Try.Item;

import java.util.ArrayList;

public class Hero extends Characters{
    public static ArrayList<String> heroInventory = new ArrayList<>();

    private static final int hitPoint =2000;
    private static final double defense =0.8;
    private static final double damage = 50;     // damage = current item a göre olmalı



    public Hero(String name, int hitPoint,double defense,double damage) {
        super(name,hitPoint,defense,damage);

    }

    public Hero(String name){
        this(name,hitPoint,defense,damage);
    }



    /*public int attack(){
     return Items.rand.nextInt();
    }*/
}
