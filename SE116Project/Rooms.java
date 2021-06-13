package SE116Project;

import java.util.ArrayList;

public class Rooms {
    private Coordinates roomCoordinates;
    private ArrayList<Monsters> monsters;
    private String roomName;
    private String definition;

    public Rooms(String roomName, String definition, Coordinates coordinates) {
        this(roomName, definition, coordinates, new ArrayList<Monsters>());
    }

    public Rooms(String roomName, String definition, Coordinates coordinates, ArrayList<Monsters> monsters) {
        super();
        this.roomName = roomName;
        this.definition = definition;
        this.roomCoordinates = coordinates;
        this.monsters = monsters;
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
        return roomCoordinates;
    }

    public void setRoomCoordinates(Coordinates coordinates) {
        this.roomCoordinates = coordinates;
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
}