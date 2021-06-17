package SE116Project;

public class TownPeople extends Characters{
private int heal;
private boolean healer;

    public TownPeople(String name, int heal,boolean healer) {
        super(name);
        this.heal = heal;
        this.healer= healer;
    }

    public TownPeople(String name,boolean healer) {
        super(name);
        this.healer=healer;
    }


    public void setHeal(int heal) {
        this.heal = heal;


    }

    public int getHeal() {
        return heal;
    }

    public boolean isHealer() {
        return healer;
    }

    public void setHealer(boolean healer) {
        this.healer = healer;
    }
}
