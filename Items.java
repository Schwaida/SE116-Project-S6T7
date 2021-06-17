package SE116Project;

import java.util.Random;

public class Items extends CurrentItem {
    private String WeaponName,ClothesName;
    private double weight;
    private double value;
    static int clotheCounter;
    public static final Random rand = new Random();

    public Items(){
        WeaponName=null;
        ClothesName=null;
        weight=0;
        value=0;
        clotheCounter=0;
    }
    public Items(String weaponName, String clothesName, double weight, double value){
        this.WeaponName = weaponName;
        this.ClothesName = clothesName;
        this.weight=weight;
        this.value= value;
    }

    public void setWeaponName(String weaponName) {
        WeaponName = weaponName;
    }

    public void setClothesName(String clothesName) {
        ClothesName = clothesName;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public String getClothesName() {
        return ClothesName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setValue(double value) {
        this.value = value;
    }



    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

     public void display(){

     }
   public void pickUp(){

   }


}
