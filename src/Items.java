abstract class Items {
    private String WeaponName,ClothesName;
    private double totalWeight;
    private double value;
    static int clotheCounter;

    public Items(){
        WeaponName=null;
        ClothesName=null;
        totalWeight=0;
        value=0;
        clotheCounter=0;
    }
    public Items(String weaponName, String clothesName, double totalWeight, double value){
        this.WeaponName = weaponName;
        this.ClothesName = clothesName;
        this.totalWeight=totalWeight;
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

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setValue(double value) {
        this.value = value;
    }



    public double getTotalWeight() {
        return totalWeight;
    }

    public double getValue() {
        return value;
    }

    abstract public void display();


}
