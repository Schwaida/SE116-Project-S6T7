package NewOne;

public class WeightSystem extends Items {

    boolean ironSmallAxeTaken = false;
    boolean ironAxeTaken = false;
    boolean ironBroadAxeTaken = false;
    boolean bronzeSmallAxeTaken = false;
    boolean bronzeAxeTaken = false;
    boolean bronzeBroadAxeTaken = false;
    boolean steelSmallAxeTaken = false;
    boolean steelAxeTaken = false;
    boolean steelBroadAxeTaken = false;
    boolean ironDaggerTaken = false;
    boolean ironShortSwordTaken = false;
    boolean ironLongSwordTaken = false;
    boolean bronzeDaggerTaken = false;
    boolean bronzeShortSwordTaken = false;
    boolean bronzeLongSwordTaken = false;
    boolean steelDaggerTaken = false;
    boolean steelShortSwordTaken = false;
    boolean steelLongSwordTaken = false;
    boolean shortBowTaken = false;
    boolean longBowTaken = false;
    boolean compositeBowTaken = false;

    boolean ironSmallAxeDropped = false;
    boolean ironAxeDropped = false;
    boolean ironBroadAxeDropped = false;
    boolean bronzeSmallAxeDropped = false;
    boolean bronzeAxeDropped = false;
    boolean bronzeBroadAxeDropped = false;
    boolean steelSmallAxeDropped = false;
    boolean steelAxeDropped = false;
    boolean steelBroadAxeDropped = false;
    boolean ironDaggerDropped = false;
    boolean ironShortSwordDropped = false;
    boolean ironLongSwordDropped = false;
    boolean bronzeDaggerDropped = false;
    boolean bronzeShortSwordDropped = false;
    boolean bronzeLongSwordDropped = false;
    boolean steelDaggerDropped = false;
    boolean steelShortSwordDropped = false;
    boolean steelLongSwordDropped = false;
    boolean shortBowDropped = false;
    boolean longBowDropped = false;
    boolean compositeBowDropped = false;
    private int currentWeight =0;

    @Override
    public double getWeight() {
        return this.currentWeight;
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    private final int maxWeight =30;


    public int getMaxWeight() {
        return maxWeight;
    }

    public void system() {

        while (-1 < currentWeight && currentWeight <= maxWeight) {
            WeightSystem System = new WeightSystem();
            if (System.ironSmallAxeTaken) {
                currentWeight += ItemStats.ironSmallAxeWeight;
            }
            if (System.ironSmallAxeDropped) {
                currentWeight -= ItemStats.ironSmallAxeWeight;
            }
            if (System.ironAxeTaken) {
                currentWeight += ItemStats.ironAxeWeight;
            }
            if (System.ironAxeDropped) {
                currentWeight -= ItemStats.ironAxeWeight;
            }
            if (System.ironBroadAxeTaken) {
                currentWeight += ItemStats.ironBroadAxeWeight;
            }
            if (System.ironBroadAxeDropped) {
                currentWeight -= ItemStats.ironBroadAxeWeight;
            }
            if (System.bronzeSmallAxeTaken) {
                currentWeight += ItemStats.bronzeSmallAxeWeight;
            }
            if (System.bronzeSmallAxeDropped) {
                currentWeight -= ItemStats.bronzeSmallAxeWeight;
            }
            if (System.bronzeAxeTaken) {
                currentWeight += ItemStats.bronzeAxeWeight;
            }
            if (System.bronzeAxeDropped) {
                currentWeight -= ItemStats.bronzeAxeWeight;
            }
            if (System.bronzeBroadAxeTaken) {
                currentWeight += ItemStats.bronzeBroadAxeWeight;
            }
            if (System.bronzeBroadAxeDropped) {
                currentWeight -= ItemStats.bronzeBroadAxeWeight;
            }
            if (System.steelSmallAxeTaken) {
                currentWeight += ItemStats.steelSmallAxeWeight;
            }
            if (System.steelSmallAxeDropped) {
                currentWeight -= ItemStats.steelSmallAxeWeight;
            }
            if (System.steelAxeTaken) {
                currentWeight += ItemStats.steelAxeWeight;
            }
            if (System.steelAxeDropped) {
                currentWeight -= ItemStats.steelAxeWeight;
            }
            if (System.steelBroadAxeTaken) {
                currentWeight += ItemStats.steelBroadAxeWeight;
            }
            if (System.steelBroadAxeDropped) {
                currentWeight -= ItemStats.steelBroadAxeWeight;
            }

            if (System.ironDaggerTaken) {
                currentWeight += ItemStats.ironDaggerWeight;
            }
            if (System.ironDaggerDropped) {
                currentWeight -= ItemStats.ironDaggerWeight;
            }
            if (System.ironShortSwordTaken) {
                currentWeight += ItemStats.ironShortSwordWeight;
            }
            if (System.ironShortSwordDropped) {
                currentWeight -= ItemStats.ironShortSwordWeight;
            }
            if (System.ironLongSwordTaken) {
                currentWeight += ItemStats.ironLongSwordWeight;
            }
            if (System.ironLongSwordDropped) {
                currentWeight -= ItemStats.ironLongSwordWeight;
            }
            if (System.bronzeDaggerTaken) {
                currentWeight += ItemStats.bronzeDaggerWeight;
            }
            if (System.bronzeDaggerDropped) {
                currentWeight -= ItemStats.bronzeDaggerWeight;
            }
            if (System.bronzeShortSwordTaken) {
                currentWeight += ItemStats.bronzeShortSwordWeight;
            }
            if (System.bronzeShortSwordDropped) {
                currentWeight -= ItemStats.bronzeShortSwordWeight;
            }
            if (System.bronzeLongSwordTaken) {
                currentWeight += ItemStats.bronzeLongSwordWeight;
            }
            if (System.bronzeLongSwordDropped) {
                currentWeight -= ItemStats.bronzeLongSwordWeight;
            }
            if (System.steelDaggerTaken) {
                currentWeight += ItemStats.steelDaggerWeight;
            }
            if (System.steelDaggerDropped) {
                currentWeight -= ItemStats.steelDaggerWeight;
            }
            if (System.steelShortSwordTaken) {
                currentWeight += ItemStats.steelShortSwordWeight;
            }
            if (System.steelShortSwordDropped) {
                currentWeight -= ItemStats.steelShortSwordWeight;
            }
            if (System.steelLongSwordTaken) {
                currentWeight += ItemStats.steelLongSwordWeight;
            }
            if (System.steelLongSwordDropped) {
                currentWeight -= ItemStats.steelLongSwordWeight;
            }

            if (System.shortBowTaken) {
                currentWeight += ItemStats.shortBowWeight;
            }
            if (System.shortBowDropped) {
                currentWeight -= ItemStats.shortBowWeight;
            }
            if (System.longBowTaken) {
                currentWeight += ItemStats.longBowWeight;
            }
            if (System.longBowDropped) {
                currentWeight -= ItemStats.longBowWeight;
            }
            if (System.compositeBowTaken) {
                currentWeight += ItemStats.compositeBowWeight;
            }
            if (System.compositeBowDropped) {
                currentWeight -= ItemStats.compositeBowWeight;
            }
        }
    }
}