package SE116Project;

import java.util.ArrayList;
import static SE116Project.Game.scanner;

public class Characters {
    private String name;
    private double defense;
    // private char movement;  Belki w-a-s-d
    private double damage;
    private double hitPoint;// =getHitPoint()- weapons.getDamage();
    private ArrayList<String> heroInventory;
    private ArrayList<String> monsterInventory;


    public Characters(String name) {
        this.name = name;
    }


    public Characters(String name, double hitPoint, double defense, double damage) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.defense = defense;
        this.damage = damage;
        heroInventory = new ArrayList<String>();
        monsterInventory = new ArrayList<String>();

    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    public Characters() {
        name = null;
        defense = 0;
        hitPoint = 100;

    }

   /* public int attack(Characters characters) {  //burası random yerine range ve damagelerle ayarlanabilir
        if (characters != null) {
            double random = Math.random();
            if (!(random > defense)) {
                double a = Math.random() + 1;
                int damage = (int) (this.damage * a);
                if (damage > 0) {
                    characters.setHitPoint(characters.getHitPoint() - damage);
                }
                if (characters.getHitPoint()-damage <=0) {
                    addHeroInventory(characters.getMonsterInventory());
               /* if(characters.isDead()) { // if monster is dead add its inventory to hero
                    addHeroInventory(characters.getMonsterInventory());
                }
                }
                return damage;
            }
        }
        return -1;
    }*/




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

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

   /* public boolean isDead() {
        return hitPoint <= 0;
    }*/


    public ArrayList<String> getHeroInventory() {
        return heroInventory;
    }
    public ArrayList<String >getMonsterInventory(){
        return monsterInventory;
    }

    public void setHeroInventory(ArrayList<String> heroInventory) {
        this.heroInventory = heroInventory;
    }


    public void addHeroInventory(ArrayList<String> heroInventory) {

        for (String items:heroInventory)
            heroInventory.add(String.valueOf(items));
    }


    /*public void setInventory(String items) {
        heroInventory.add(items);
    }*/

    public static void showHeroInventory(){
        Characters characters = new Characters();
        if(Game.hero.getHeroInventory() != null && !Game.hero.getHeroInventory().isEmpty()) {
            System.out.println("-------------------");
            for(String items : Game.hero.getHeroInventory()) {
                System.out.println(items);
            } System.out.println("-------------------");
            //dropItem();
        }else {
            System.out.println("-------------------");
            System.out.println("No item to display");
            System.out.println("-------------------");
        }
    }
    public static void showHeroInventoryDrop(){
        Characters characters = new Characters();
        if(Game.hero.getHeroInventory() != null && !Game.hero.getHeroInventory().isEmpty()) {
            System.out.println("-------------------");
            for(String items : Game.hero.getHeroInventory()) {
                System.out.println(items);
            } System.out.println("-------------------");
            dropItem();
        }else {
            System.out.println("-------------------");
            System.out.println("No item to display");
            System.out.println("-------------------");
        }
    }
    public static void dropItem(){
        System.out.println("Would you like to drop an item? ");
        String choose = scanner.nextLine();
        if (choose.equals("yes")){
            System.out.println("Enter the item name you want to delete from your inventory: ");
            String item = scanner.nextLine();
            if (Game.hero.getHeroInventory().contains(item)) {
                Rooms.getDroppedItem().add(item);
                Game.hero.getHeroInventory().remove(item);
                System.out.println("You successfully removed " + item + " from your inventory. Dropped in " + Map.currentRoom.getRoomName());


                if (Rooms.getDroppedItem() != null && !Rooms.getDroppedItem().isEmpty()) {
                    //Map.currentRoom.setDroppedInfo(String.valueOf(item));

                    Map.currentRoom.setDroppedInfo(item);
                }


                //System.out.println("thr is "+Map.currentRoom.getDefinition());

                //System.out.println("there is " + Map.currentRoom.getDroppedInfo());
                //System.out.println("There is " + Rooms.getDroppedItem() + " in " + Map.currentRoom.getRoomName());
                // odaya düşürülen şeyleri set et

                try{
                    if (Game.currentItem.getWeaponName().contains(item)){
                        Game.currentItem.setWeaponName(null);
                    }
                }catch (NullPointerException nullPointerException) {
                    System.out.println("empty weapon");
                }

                try {
                    if (Game.currentItem.getClothName().contains(item)) {
                        Game.currentItem.setClothName(null);
                    }
                }catch (NullPointerException nullPointerException){
                    System.out.println("empty cloth");
                }

                // burda sorun



            }else
                System.out.println("there is no item like "+item);
        }else
            System.out.println("Continuing the game");

    }
    public void setMonsterInventory(ArrayList<String> monsterInventory) {
        this.monsterInventory = monsterInventory;
    }
    /*public void addMonsterInventory(String monsterInventory){
        this.heroInventory.addAll(Collections.singleton(monsterInventory));
    }*/
    public void addMonsterInventory(String monsterInv){
        //this.heroInventory.add(String.valueOf(monsterInventory));
        monsterInventory.add(String.valueOf(monsterInv));
    }


    public static void showMonsterInventory(){
        if (Game.monsters.getMonsterInventory()!=null && !Game.monsters.getMonsterInventory().isEmpty()){
            for (String items : Game.monsters.getMonsterInventory()){
                System.out.println(items);
            }
        }
    }
    public void printStats() {

        String status;

        if(hitPoint >= 200) {
            status = "Still looking strong ";
        }else if(hitPoint < 200 && hitPoint >= 100) {
            status = "It looks barely injured";
        }else if(hitPoint< 100 && hitPoint > 0 ) {
            status = "It looks near dead";
        }else {
            status = "It looks dead";
        }

        if(hitPoint >0)
            System.out.println(" ** " + name.toUpperCase() + " HP --> " + hitPoint+ " [ " + status + " ] "); //+ " ** Damage power (?) " + damage + " [ " + status + " ] ");
        else
            System.out.println(" ** " + name.toUpperCase() + "  [ DEFEATED ] ");
    }
    public int attack(Characters characters) {   // burası random yerine canavarın ve hero nun sahip oldugu edvantere göre olmalı

        if(characters != null) {
            double random = Math.random();
            if(!(random > defense)) {
                double random2 = Math.random() + 1;
                int damage = (int) (this.damage * random2);
                if(damage>0)
                    characters.setHitPoint(characters.getHitPoint() - damage);
                if(characters.isDead()) {
                    addHeroInventory(Monsters.monsterInventory);
                }
                return damage;

            }
        }
        return -1;


    }

    public boolean isDead() {
        return hitPoint <= 0;
    }



}