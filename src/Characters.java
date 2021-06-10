import java.util.ArrayList;
import java.util.List;

public class Characters {
    private String name;
    private double defense;
    // private char movement;  Belki w-a-s-d
    private double strength;
    private Weapons weapons;
    private Clothes clothes;
    private Items items;
    private int hitPoint;// =getHitPoint()- weapons.getDamage();
    private ArrayList<Items> inventory;



    public Characters(String name,int hitPoint, double defense, double strength){
        this.name = name;
        this.hitPoint=hitPoint;
        this.defense=defense;
        this.strength=strength;
        inventory=new ArrayList<Items>();

    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }


    public ArrayList<Items> getInventory() {
        return inventory;
    }
    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }

    public void addInventory(ArrayList<Items> inventory) {
        this.inventory.addAll(inventory);
    }

    public void setInventory(Items e) {
        inventory.add(e);
    }
    public Characters() {
        name=null;
        defense=0;
        hitPoint=100;

    }public int attack(Characters characters) {
        if(characters != null) {
            double random = Math.random();
            if(!(random > defense)) {
                double a = Math.random() + 1;
                int damage = (int) (strength * a);
                if(damage>0)

                    characters.setHitPoint(characters.getHitPoint() - damage);
                if(characters.isDead()) {
                    addInventory(characters.getInventory());

                }
                return damage;

            }
        }
        return -1;
    }



    public void printStats() {

        String comment;

        if(hitPoint >= 200) {
            comment = "It looks uninjured";
        }else if(hitPoint < 200 && hitPoint >= 100) {
            comment = "It looks barely injured";
        }else if(hitPoint< 100 && hitPoint > 0 ) {
            comment = "It looks near death";
        }else {
            comment = "It looks death";
        }

        if(hitPoint >0)
            System.out.println(">> " + name.toUpperCase() + " || HP " + hitPoint + " || ATTACK " + strength + " [ " + comment + " ]");
        else
            System.out.println(">> " + name.toUpperCase() + " [ " + comment + " ]");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getDefense() {
        return defense;
    }



    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public boolean isDead() {
        return hitPoint <= 0;
    }
}