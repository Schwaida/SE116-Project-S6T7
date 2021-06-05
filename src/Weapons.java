public class Weapons extends Items {
    @Override
    public void setWeaponName(String weaponName) {
        super.setWeaponName(weaponName);
    }

    @Override
    public String getWeaponName() {
        return super.getWeaponName();
    }

    @Override
    public void display() {
            System.out.println("Weapon name: "+getWeaponName());

    }
    public Weapons(){
        super();

    }
    public Weapons(String weaponName, double value){

    }
}
class Swords extends Weapons {
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


