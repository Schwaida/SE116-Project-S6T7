package SE116Project;

public class Hero extends Characters{

    private static final int hitPoint =200;
    private static final double defense =0.8;
    private static final double strength =50;



    public Hero(String name, int hitPoint,double defense,double strength) {
        super(name,hitPoint,defense,strength);

    }

    public Hero(String name){
        this(name,hitPoint,defense,strength);
    }



    /*public int attack(){
     return Items.rand.nextInt();
    }*/
}
