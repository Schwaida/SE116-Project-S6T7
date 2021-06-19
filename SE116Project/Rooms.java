package SE116Project;

import java.util.ArrayList;

public class Rooms {
    private Coordinates coordinates;
    private ArrayList<Monsters> monsters;
    private ArrayList<TownPeople> townPeoples;
    private String roomName;
    private String definition;
    private boolean stairRoom;

    public Rooms(String roomName, String definition, Coordinates coordinates) {
        this(roomName, definition, coordinates, new ArrayList<Monsters>(),new ArrayList<TownPeople>());
    }
   public Rooms(String roomName, String definition, Coordinates coordinates,boolean stairRoom) {
        this.roomName=roomName;
        this.definition=definition;
        this.coordinates=coordinates;
        this.stairRoom=stairRoom;
        this.townPeoples=new ArrayList<TownPeople>();
        this.monsters=new ArrayList<Monsters>();

    }

    public Rooms(String roomName, String definition, Coordinates coordinates, ArrayList<Monsters> monsters,ArrayList<TownPeople> townPeoples) {
        super();
        this.roomName = roomName;
        this.definition = definition;
        this.coordinates = coordinates;
        this.monsters = monsters;
        this.townPeoples=townPeoples;
    }


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Coordinates getRoomCoordinates() {
        return coordinates;
    }

    public void setRoomCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }


    public void setMonsters(ArrayList<Monsters> monsters) {
        this.monsters = monsters;
    }


    public ArrayList<Monsters> getMonsters() {
        return monsters;
    }

    public void settingMonsters(Monsters monster) {
        monsters.add(monster);
    }


    public void deleteMonsters(Monsters monster) {
        monsters.remove(monster);
    }

    public ArrayList<TownPeople> getTownPeoples() {
        return townPeoples;
    }

    public void setTownPeoples(ArrayList<TownPeople> townPeoples) {
        this.townPeoples = townPeoples;
    }
    public void settingTownsPeople(TownPeople townPeople) {
        townPeoples.add(townPeople);
    }


    public void deleteTownsPeople(TownPeople townPeople) {
        townPeoples.remove(townPeople);
    }

    public boolean isStairRoom() {
        return stairRoom;
    }

    public void setStairRoom(boolean stairRoom) {
        this.stairRoom = stairRoom;
    }
}