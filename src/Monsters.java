import java.util.Random;

public class Monsters extends Characters{

    private static final int hitPoint=200;
    private static final double defense=0.6;
    private static final double strength=30;


    public Monsters(String name, int hitPoint, double defense,double strength) {
        super(name,hitPoint,defense,strength);
    }

    public Monsters(String name){
        this(name,hitPoint,defense,strength);
    }


}
