public class Characters {
    private char movement;
    private Weapons weapons;
    private Clothes clothes;
    private Items items;
    private int hitPoint;// =getHitPoint()- weapons.getDamage();


    public Characters(int hitPoint){
        this.hitPoint=hitPoint;
        hitPoint=100;

    }

    public char getMovement() {
        return movement;
    }

    public void setMovement(char movement) {
        this.movement = movement;
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