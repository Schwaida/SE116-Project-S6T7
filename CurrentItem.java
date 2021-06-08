package SE116Project;

public class CurrentItem implements ItemStats{
    private int axeDamage,AxeWeight,axeBlockPower,AxeRange,AxeValue;
    private int swordDamage,swordWeight,swordBlockPower,swordRange,swordValue;
    private int bowDamage,bowWeight,bowRange,bowValue;



    public void usingAxe(int a,int b){



        if(a==1){
           //iron

            if(b==1){
                //small
                setAxeDamage(ironSmallAxeDamage);
                setAxeBlockPower(ironSmallAxeBlockPower);
                setAxeRange(ironSmallAxeRange);
                setAxeValue(ironSmallAxeValue);
                setAxeWeight(ironSmallAxeWeight);
                display();
            }
            else if(b==2){
                //normal
                setAxeDamage(ironAxeDamage);
                setAxeBlockPower(ironAxeBlockPower);
                setAxeRange(ironAxeRange);
                setAxeValue(ironAxeValue);
                setAxeWeight(ironAxeWeight);
                display();
            }
            else if(b==3){
                //broad
                setAxeDamage(ironBroadAxeDamage);
                setAxeBlockPower(ironBroadAxeBlockPower);
                setAxeRange(ironBroadAxeRange);
                setAxeValue(ironBroadAxeValue);
                setAxeWeight(ironBroadAxeWeight);
                display();
            }

        }
        else if(a==2){
           //bronze

            if(b==1){
                //small
                setAxeDamage(bronzeSmallAxeDamage);
                setAxeBlockPower(bronzeSmallAxeBlockPower);
                setAxeRange(bronzeSmallAxeRange);
                setAxeValue(bronzeSmallAxeValue);
                setAxeWeight(bronzeSmallAxeWeight);
                display();

            }
            else if(b==2){
                //normal
                setAxeDamage(bronzeAxeDamage);
                setAxeBlockPower(bronzeAxeBlockPower);
                setAxeRange(bronzeAxeRange);
                setAxeValue(bronzeAxeValue);
                setAxeWeight(bronzeAxeWeight);
                display();
            }
            else if(b==3){
                //broad
                setAxeDamage(bronzeBroadAxeDamage);
                setAxeBlockPower(bronzeBroadAxeBlockPower);
                setAxeRange(bronzeBroadAxeRange);
                setAxeValue(bronzeBroadAxeValue);
                setAxeWeight(bronzeBroadAxeWeight);
                display();
            }

        }
        else if(a==3){
            //steel

            if(b==1){
                //small
                setAxeDamage(steelSmallAxeDamage);
                setAxeBlockPower(steelSmallAxeBlockPower);
                setAxeRange(steelSmallAxeRange);
                setAxeValue(steelSmallAxeValue);
                setAxeWeight(steelSmallAxeWeight);
                display();

            }
            else if(b==2){
                //normal
                setAxeDamage(steelAxeDamage);
                setAxeBlockPower(steelAxeBlockPower);
                setAxeRange(steelAxeRange);
                setAxeValue(steelAxeValue);
                setAxeWeight(steelAxeWeight);
                display();
            }
            else if(b==3){
                //broad
                setAxeDamage(steelBroadAxeDamage);
                setAxeBlockPower(steelBroadAxeBlockPower);
                setAxeRange(steelBroadAxeRange);
                setAxeValue(steelBroadAxeValue);
                setAxeWeight(steelBroadAxeWeight);
                display();
            }
        }

    }
    public void usingSword(int a,int b){


        if(a==1){
            //iron

        }
        else if(a==2){
            //bronze

        }
        else if(a==3){
            //steel

        }

    }
    public void usingBow(int a,int b){

        if(a==1){
            //short
        }
        else if(a==2){
            //long
        }
        else if(a==3){
            //composite
        }

    }
    public void usingArmor(int a,int b){

        if(a==1){
            //iron

        }
        else if(a==2){
            //bronze
        }
        else if(a==3){
            //steel
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
}
