public class Weapons extends Items {

    private double damage;
    private double range;

    public Weapons() {

    }
    //block action



    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    @Override
    public void display() {

            System.out.println("Weapon name: "+getWeaponName());

    }

    @Override
    public void pickUp() {

    }

    public Weapons(String weaponName, double value){

    }
}
class Swords extends Weapons {
    public Swords(String weaponName, double value) {
        super(weaponName, value);
        setValue(4);
        setWeight(15);
    }

    public Swords() {
        super();
    }


    @Override
    public void setWeaponName(String weaponName) {
        super.setWeaponName(weaponName);
    }
    @Override
    public String getWeaponName() {
        return super.getWeaponName();
    }

 }
 class Axes extends Weapons{
     public Axes(String weaponName, double value) {
         super(weaponName, value);
         setValue(5);
         setWeight(30);
     }

     @Override
     public void setWeaponName(String weaponName) {
         super.setWeaponName(weaponName);
     }

     @Override
     public String getWeaponName() {
         return super.getWeaponName();
     }
 }
 class Bows extends Weapons{
     public Bows(String weaponName, double value) {
         super(weaponName, value);
         setValue(6);
         setWeight(45);
     }

     @Override
     public void setWeaponName(String weaponName) {
         super.setWeaponName(weaponName);
     }

     @Override
     public String getWeaponName() {
         return super.getWeaponName();
     }
 }
 /*public String getSwordType() {
        return swordType;
    }
    @Override
    public int givenDamage() {
        switch (swordType) {
            case "dagger":
                return setDamage(10);
            case "short sword":
                return setDamage(30);
            case "long sword":
                return setDamage(50);
            default:
                System.out.println("wrong");
                break;
        }
        return 0;
    }
}*/







    /*
    private static double damage;
    public int setDamage(int damage) {
        Weapons.damage = damage;
        return  damage;
    }

    public double getDamage() {
        return damage;
    }

    public int givenDamage() {
        System.out.println("given damage is calculating...");
        return 0;

    }
}
*/


