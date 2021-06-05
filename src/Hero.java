public class Hero extends Characters{


    public Hero(int hitPoint) {
        super(hitPoint);
    }

    @Override
    public boolean isDead() {
        System.out.println("you died...");
        System.out.println("game over");
        return super.isDead();
    }

    public void attack(){

    }
}
