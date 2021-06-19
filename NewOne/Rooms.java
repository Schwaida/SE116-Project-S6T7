package NewOne;

import java.util.ArrayList;

public class Rooms {
    private Coordinates roomCoordinates;
    private ArrayList<Hero> heroes;
    private ArrayList<Monsters> monsters;
    private ArrayList<TownPeople> townPeoples;
    private String roomName;
    private String definition;
    private String weaponName;
    private String droppedInfo;

    public void setDroppedInfo(String droppedInfo) {
        this.droppedInfo = droppedInfo;
    }

    public String getDroppedInfo() {
        return droppedInfo;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    private static ArrayList<String> droppedItem;

    public static ArrayList<String> getDroppedItem() {

        return droppedItem;
    }

    public static void setDroppedItem(ArrayList<String> droppedItem) {
        Rooms.droppedItem = droppedItem;
    }

    public Rooms() {

    }



    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public Rooms(String roomName, String definition, Coordinates coordinates) {
        this(roomName, definition, coordinates, new ArrayList<Monsters>(),new ArrayList<TownPeople>());
    }

    public Rooms(String roomName, String definition, Coordinates coordinates, ArrayList<Monsters> monsters,ArrayList<TownPeople> townPeoples) {
        super();
        this.roomName = roomName;
        this.definition = definition;
        this.roomCoordinates = coordinates;
        this.monsters = monsters;
        this.townPeoples=townPeoples;
        droppedItem = new ArrayList<>();
    }


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }



    public Coordinates getRoomCoordinates() {
        return roomCoordinates;
    }

    public void setRoomCoordinates(Coordinates coordinates) {
        this.roomCoordinates = coordinates;
    }


    public void setMonsters(ArrayList<Monsters> monsters) {
        this.monsters = monsters;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
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
}