package SE116Project;

public class TownPeople extends Characters{
private Boolean healer;

    public TownPeople(String name, boolean healer) {
        super(name);
        this.healer = healer;
    }

    public TownPeople(boolean healer) {
        this.healer = healer;
    }


    public void setHealer(boolean healer) {
        this.healer = healer;


    }

    public boolean getHealer() {
        return healer;
    }
}
