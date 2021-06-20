package SE116Project;

import java.util.ArrayList;

public class Rooms {
    private Coordinates coordinates;
    private ArrayList<Hero> heroes;
    private ArrayList<Monsters> monsters;
    private ArrayList<TownPeople> townPeoples;
    private String roomName;
    private String definition;
    private boolean stairRoom;
    private String droppedInfo;
    private static ArrayList<String> droppedItem;

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
       droppedItem = new ArrayList<>();

    }

    public Rooms(String roomName, String definition, Coordinates coordinates, ArrayList<Monsters> monsters,ArrayList<TownPeople> townPeoples) {
        super();
        this.roomName = roomName;
        this.definition = definition;
        this.coordinates = coordinates;
        this.monsters = monsters;
        this.townPeoples=townPeoples;
        droppedItem = new ArrayList<>();

    }

    public static ArrayList<String> getDroppedItem() {
        return droppedItem;
    }

    public static void setDroppedItem(ArrayList<String> droppedItem) {
        Rooms.droppedItem = droppedItem;
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

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public String getDroppedInfo() {
        return droppedInfo;
    }

    public void setDroppedInfo(String droppedInfo) {
        this.droppedInfo = droppedInfo;
    }
}