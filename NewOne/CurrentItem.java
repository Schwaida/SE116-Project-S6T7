package NewOne;

public class CurrentItem implements ItemStats{
    private int axeDamage,AxeWeight,axeBlockPower,AxeRange,AxeValue;
    private int swordDamage,swordWeight,swordBlockPower,swordRange,swordValue;
    private int bowDamage,bowWeight,bowRange,bowValue;
    private int armorProtection,armorValue,armorWeight;
    private String weaponName;
    private String clothName;

    public void setClothName(String clothName) {
        this.clothName = String.valueOf(clothName);
    }

    public String getClothName() {
        return clothName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = String.valueOf(weaponName);
    }


    public String usingWeapon(int a, int b, int c) {
        // 3 parametreli

        if (a == 1) {
            //axe

            if (b == 1) {
                //iron

                if (c == 1) {
                    //small
                    setAxeDamage(ironSmallAxeDamage);
                    setAxeBlockPower(ironSmallAxeBlockPower);
                    setAxeRange(ironSmallAxeRange);
                    setAxeValue(ironSmallAxeValue);
                    setAxeWeight(ironSmallAxeWeight);
                    display();
                    weaponName="iron small axe";
                    return ironSmallAxe;

                } else if (c == 2) {
                    //normal
                    setAxeDamage(ironAxeDamage);
                    setAxeBlockPower(ironAxeBlockPower);
                    setAxeRange(ironAxeRange);
                    setAxeValue(ironAxeValue);
                    setAxeWeight(ironAxeWeight);
                    display();
                    weaponName="iron axe";
                    return ironAxe;

                } else if (c == 3) {
                    //broad
                    setAxeDamage(ironBroadAxeDamage);
                    setAxeBlockPower(ironBroadAxeBlockPower);
                    setAxeRange(ironBroadAxeRange);
                    setAxeValue(ironBroadAxeValue);
                    setAxeWeight(ironBroadAxeWeight);
                    display();
                    weaponName="iron broad axe";
                    return ironBroadAxe;
                }

            } else if (b == 2) {
                //bronze

                if (c == 1) {
                    //small
                    setAxeDamage(bronzeSmallAxeDamage);
                    setAxeBlockPower(bronzeSmallAxeBlockPower);
                    setAxeRange(bronzeSmallAxeRange);
                    setAxeValue(bronzeSmallAxeValue);
                    setAxeWeight(bronzeSmallAxeWeight);
                    display();
                    return bronzeSmallAxe;

                } else if (c == 2) {
                    //normal
                    setAxeDamage(bronzeAxeDamage);
                    setAxeBlockPower(bronzeAxeBlockPower);
                    setAxeRange(bronzeAxeRange);
                    setAxeValue(bronzeAxeValue);
                    setAxeWeight(bronzeAxeWeight);
                    display();
                    return bronzeAxe;
                } else if (c == 3) {
                    //broad
                    setAxeDamage(bronzeBroadAxeDamage);
                    setAxeBlockPower(bronzeBroadAxeBlockPower);
                    setAxeRange(bronzeBroadAxeRange);
                    setAxeValue(bronzeBroadAxeValue);
                    setAxeWeight(bronzeBroadAxeWeight);
                    display();
                    return bronzeBroadAxe;
                }

            } else if (b == 3) {
                //steel

                if (c == 1) {
                    //small
                    setAxeDamage(steelSmallAxeDamage);
                    setAxeBlockPower(steelSmallAxeBlockPower);
                    setAxeRange(steelSmallAxeRange);
                    setAxeValue(steelSmallAxeValue);
                    setAxeWeight(steelSmallAxeWeight);
                    display();
                    return steelSmallAxe;

                } else if (c == 2) {
                    //normal
                    setAxeDamage(steelAxeDamage);
                    setAxeBlockPower(steelAxeBlockPower);
                    setAxeRange(steelAxeRange);
                    setAxeValue(steelAxeValue);
                    setAxeWeight(steelAxeWeight);
                    display();
                    return steelAxe;
                } else if (c == 3) {
                    //broad
                    setAxeDamage(steelBroadAxeDamage);
                    setAxeBlockPower(steelBroadAxeBlockPower);
                    setAxeRange(steelBroadAxeRange);
                    setAxeValue(steelBroadAxeValue);
                    setAxeWeight(steelBroadAxeWeight);
                    display();
                    return steelBroadAxe;
                }
            }

        }
        else if (a == 2) {
           //sword


            if (b== 1) {
                //iron

                if (c == 1) {
                    //dagger
                    setSwordDamage(ironDaggerDamage);
                    setSwordBlockPower(ironDaggerBlockPower);
                    setSwordRange(ironDaggerRange);
                    setSwordValue(ironDaggerValue);
                    setSwordWeight(ironDaggerWeight);
                    display();
                    return ironDagger;

                } else if (c == 2) {
                    //short
                    setSwordDamage(ironShortSwordDamage);
                    setSwordBlockPower(ironShortSwordBlockPower);
                    setSwordRange(ironShortSwordRange);
                    setSwordValue(ironShortSwordValue);
                    setSwordWeight(ironShortSwordWeight);
                    display();
                    return ironShortSword;

                } else if (c == 3) {
                    //long
                    setSwordDamage(ironLongSwordDamage);
                    setSwordBlockPower(ironLongSwordBlockPower);
                    setSwordRange(ironLongSwordRange);
                    setSwordValue(ironLongSwordValue);
                    setSwordWeight(ironLongSwordWeight);
                    display();
                    return ironLongSword;

                }

            } else if (b == 2) {
                //bronze
                if (c == 1) {
                    //dagger
                    setSwordDamage(bronzeDaggerDamage);
                    setSwordBlockPower(bronzeDaggerBlockPower);
                    setSwordRange(bronzeDaggerRange);
                    setSwordValue(bronzeDaggerValue);
                    setSwordWeight(bronzeDaggerWeight);
                    display();
                    return bronzeDagger;

                } else if (c == 2) {
                    //short
                    setSwordDamage(bronzeShortSwordDamage);
                    setSwordBlockPower(bronzeShortSwordBlockPower);
                    setSwordRange(bronzeShortSwordRange);
                    setSwordValue(bronzeShortSwordValue);
                    setSwordWeight(bronzeShortSwordWeight);
                    display();
                    return bronzeShortSword;

                } else if (c == 3) {
                    //long
                    setSwordDamage(bronzeLongSwordDamage);
                    setSwordBlockPower(bronzeLongSwordBlockPower);
                    setSwordRange(bronzeLongSwordRange);
                    setSwordValue(bronzeLongSwordValue);
                    setSwordWeight(bronzeLongSwordWeight);
                    display();
                    return bronzeLongSword;

                }

            } else if (b == 3) {
                //steel
                if (c == 1) {
                    //dagger
                    setSwordDamage(steelDaggerDamage);
                    setSwordBlockPower(steelDaggerBlockPower);
                    setSwordRange(steelDaggerRange);
                    setSwordValue(steelDaggerValue);
                    setSwordWeight(steelDaggerWeight);
                    display();
                    return steelDagger;

                } else if (c == 2) {
                    //short
                    setSwordDamage(steelShortSwordDamage);
                    setSwordBlockPower(steelShortSwordBlockPower);
                    setSwordRange(steelShortSwordRange);
                    setSwordValue(steelShortSwordValue);
                    setSwordWeight(steelShortSwordWeight);
                    display();
                    return steelShortSword;

                } else if (c == 3) {
                    //long
                    setSwordDamage(steelLongSwordDamage);
                    setSwordBlockPower(steelLongSwordBlockPower);
                    setSwordRange(steelLongSwordRange);
                    setSwordValue(steelLongSwordValue);
                    setSwordWeight(steelLongSwordWeight);
                    display();
                    return steelLongSword;

                }

            }

        }


            return null;

    }
    public String usingWeapon(int a){
        // 1 parametreli

        if(a==1){
            //short
            setBowDamage(shortBowDamage);
            setBowRange(shortBowRange);
            setBowValue(shortBowValue);
            setBowWeight(shortBowWeight);
            return shortBow;

        }
        else if(a==2){
            //long
            setBowDamage(longBowDamage);
            setBowRange(longBowRange);
            setBowValue(longBowValue);
            setBowWeight(longBowWeight);
            return longBow;

        }
        else if(a==3){
            //composite
            setBowDamage(compositeBowDamage);
            setBowRange(compositeBowRange);
            setBowValue(compositeBowValue);
            setBowWeight(compositeBowWeight);
            return compositeBow;

        }
        else
            return null;

    }
    public String usingArmor(int a){
        // 1 parametreli

        if(a==1){
            //light clothing
            setArmorProtection(lightClothingProtection);
            setArmorValue(lightClothingValue);
            setArmorWeight(lightClothingWeight);
            return lightClothing;
        }
        else if(a==2){
            //leather armor
            setArmorProtection(leatherArmorProtection);
            setArmorValue(leatherArmorValue);
            setArmorWeight(leatherArmorWeight);
            return leatherArmor;
        }
        else if(a==3){
            //chain armor
            setArmorProtection(chainArmorProtection);
            setArmorValue(chainArmorValue);
            setArmorWeight(chainArmorWeight);
            return chainArmor;
        }
        else{
            System.out.println("enter valid please");
            return null;
        }

    }

    public int getAxeDamage() {
        return axeDamage;
    }

    public void setAxeDamage(int axeDamage) {
        this.axeDamage = axeDamage;
    }

    public int getAxeBlockPower() {
        return axeBlockPower;
    }

    public void setAxeBlockPower(int axeBlockPower) {
        this.axeBlockPower = axeBlockPower;
    }

    public int getAxeRange() {
        return AxeRange;
    }

    public void setAxeRange(int axeRange) {
        AxeRange = axeRange;
    }

    public int getAxeValue() {
        return AxeValue;
    }

    public void setAxeValue(int axeValue) {
        AxeValue = axeValue;
    }

    public int getAxeWeight() {
        return AxeWeight;
    }

    public void setAxeWeight(int axeWeight) {
        AxeWeight = axeWeight;
    }
    public void display(){

    }

    public int getSwordDamage() {
        return swordDamage;
    }

    public void setSwordDamage(int swordDamage) {
        this.swordDamage = swordDamage;
    }

    public int getSwordWeight() {
        return swordWeight;
    }

    public void setSwordWeight(int swordWeight) {
        this.swordWeight = swordWeight;
    }

    public int getSwordBlockPower() {
        return swordBlockPower;
    }

    public void setSwordBlockPower(int swordBlockPower) {
        this.swordBlockPower = swordBlockPower;
    }

    public int getSwordRange() {
        return swordRange;
    }

    public void setSwordRange(int swordRange) {
        this.swordRange = swordRange;
    }

    public int getSwordValue() {
        return swordValue;
    }

    public void setSwordValue(int swordValue) {
        this.swordValue = swordValue;
    }

    public int getBowDamage() {
        return bowDamage;
    }

    public void setBowDamage(int bowDamage) {
        this.bowDamage = bowDamage;
    }

    public int getBowWeight() {
        return bowWeight;
    }

    public void setBowWeight(int bowWeight) {
        this.bowWeight = bowWeight;
    }

    public int getBowRange() {
        return bowRange;
    }

    public void setBowRange(int bowRange) {
        this.bowRange = bowRange;
    }

    public int getBowValue() {
        return bowValue;
    }

    public void setBowValue(int bowValue) {
        this.bowValue = bowValue;
    }
    public int getArmorProtection() {
        return armorProtection;
    }

    public void setArmorProtection(int armorProtection) {
        this.armorProtection = armorProtection;
    }

    public int getArmorValue() {
        return armorValue;
    }

    public void setArmorValue(int armorValue) {
        this.armorValue = armorValue;
    }

    public int getArmorWeight() {
        return armorWeight;
    }

    public void setArmorWeight(int armorWeight) {
        this.armorWeight = armorWeight;
    }

}
