package SE116Project;

public class Level {
    public static void directions() {

        Rooms[][] maze = new Rooms[5][5];

        maze[0][1] = new Rooms("Room 1","Stinking room",new Coordinates(0,1));
        maze[1][1] = new Rooms("Room 3","Glowing room",new Coordinates(1,1));
        maze[1][0] = new Rooms("Room 2","Infinite room",new Coordinates(1,0));
        maze[1][2] = new Rooms("Room 4","Illusion room",new Coordinates(1,2));
        maze[2][2] = new Rooms("Room 5","Book room",new Coordinates(2,2));
        maze[2][3] = new Rooms("Room 6",". room",new Coordinates(2,3));
        maze[3][3] = new Rooms("Room 7",".. room",new Coordinates(3,3));
        maze[4][3] = new Rooms("Room 10","... room",new Coordinates(4,3));
        maze[4][2] = new Rooms("Room 9",".... room",new Coordinates(4,2));
        maze[4][1] = new Rooms("Room 8","..... room",new Coordinates(4,1));


        Map.map = maze;
        Map.currentRoom = maze[0][1];

        Monsters dwarf = new Monsters("Dwarf",200,0.65,40);
        Monsters goblin = new Monsters("Goblin",250,0.9,50);
        Monsters elf =new Monsters("Elf",100,0.4,10);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
        Map.getRoom(1,1).settingMonsters(dwarf);
        Map.getRoom(2,2).settingMonsters(goblin);
        Map.getRoom(1,1).settingMonsters(elf);
        Map.getRoom(1,1).settingTownsPeople(healer);


    }
}
