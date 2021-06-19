package NewOne;

import java.util.ArrayList;

import static NewOne.Game.currentItem;
import static NewOne.Game.scanner;

/*public class Level {
    public static CurrentItem currentItem = new CurrentItem();


    public static void Level1() {
        Game.monsters = new Monsters();


        Rooms[][] dungeon = new Rooms[5][5];

        dungeon[0][1] = new Rooms("Room 1", "Stinking room", new Coordinates(0, 1));
        dungeon[1][1] = new Rooms("Room 3", "Glowing room", new Coordinates(1, 1));
        dungeon[1][0] = new Rooms("Room 2", "Infinite room", new Coordinates(1, 0));
        dungeon[1][2] = new Rooms("Room 4", "Illusion room", new Coordinates(1, 2));
        dungeon[2][2] = new Rooms("Room 5", "Book room", new Coordinates(2, 2));
        dungeon[2][3] = new Rooms("Room 6", ". room", new Coordinates(2, 3));
        dungeon[3][3] = new Rooms("Room 7", ".. room", new Coordinates(3, 3));
        dungeon[4][3] = new Rooms("Room 10", "... room", new Coordinates(4, 3));
        dungeon[4][2] = new Rooms("Room 9", ".... room", new Coordinates(4, 2));
        dungeon[4][1] = new Rooms("Room 8", "..... room", new Coordinates(4, 1));


        Map.map = dungeon;
        Map.currentRoom = dungeon[0][1];

        Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
        Monsters dwarf2 = new Monsters("Dwarf",200,1,40);
        Map.getRoom(1, 1).settingMonsters(dwarf);

        dwarf.addMonsterInventory(currentItem.usingWeapon(1,1,1));


        //System.out.println(dwarf.getName()+" have "+ dwarf.getMonsterInventory());

        //dwarf.addInventory(currentItem.usingWeapon(3,3,3));
        //dwarf.getInventory().add(currentItem.usingWeapon(1,2,3));
       // dwarf.getMonsterInventory().add(0,currentItem.usingWeapon(1,1,1));


        //dwarf.getInventory().add(Map.getRoom(1,1).getWeaponName());
        //dwarf.addInventory(currentItem.usingWeapon(1,1,3));

       // if (monster.isDead)
        Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
        goblin.addMonsterInventory(currentItem.usingArmor(3));


        Monsters elf = new Monsters("Elf", 30, 0.1, 10);
        elf.addMonsterInventory(currentItem.usingWeapon(2,2,2));

        Monsters skeleton = new Monsters("Skeletons", 80, 0.2, 23);
        Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
        zombie.addMonsterInventory(currentItem.usingWeapon(2,2,2));
        Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
        TownPeople healer = new TownPeople("Healer", true);
        TownPeople townPeople = new TownPeople("Town People", false);

        Map.getRoom(2, 2).settingMonsters(goblin);
        Map.getRoom(1, 1).settingMonsters(elf);
        Map.getRoom(1, 1).settingTownsPeople(healer);
        Map.getRoom(2, 2).settingTownsPeople(townPeople);
        Map.getRoom(1, 0).settingMonsters(dwarf2);
        Map.getRoom(1, 2).settingMonsters(zombie);
        Map.getRoom(2, 3).settingMonsters(vampire);
        Map.getRoom(3, 3).settingMonsters(skeleton);



    }
    public static void Level2() {
        Rooms[][] maze2 = new Rooms[4][4];

        maze2[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze2[0][1] = new Rooms("Room 2","regular room",new Coordinates(0,1));
        maze2[1][1] = new Rooms("Room 3","regular room",new Coordinates(1,1));
        maze2[2][1] = new Rooms("Room 4","regular room",new Coordinates(2,1));
        maze2[3][1] = new Rooms("Room 5","regular room",new Coordinates(3,1));
        maze2[1][2] = new Rooms("Room 6","regular room",new Coordinates(1,2));
        maze2[1][3] = new Rooms("Room 7","regular room",new Coordinates(1,3));
        maze2[2][3] = new Rooms("Room 8","regular room",new Coordinates(2,3));
        maze2[3][3] = new Rooms("Room 9","stair room",new Coordinates(3,3));

        Map.map = maze2;
        Map.currentRoom = maze2[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level3() {

        Rooms[][] maze3 = new Rooms[2][5];

        maze3[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze3[0][1] = new Rooms("Room 2","regular room",new Coordinates(0,1));
        maze3[0][2] = new Rooms("Room 3","regular room",new Coordinates(0,2));
        maze3[1][2] = new Rooms("Room 4","regular room",new Coordinates(1,2));
        maze3[1][3] = new Rooms("Room 5","regular room",new Coordinates(1,3));
        maze3[1][4] = new Rooms("Room 6","regular room",new Coordinates(1,4));

        Map.map = maze3;
        Map.currentRoom = maze3[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level4() {

        Rooms[][] maze4 = new Rooms[5][3];

        maze4[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze4[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze4[2][0] = new Rooms("Room 3","regular room",new Coordinates(2,0));
        maze4[2][1] = new Rooms("Room 4","regular room",new Coordinates(2,1));
        maze4[2][2] = new Rooms("Room 5","regular room",new Coordinates(2,2));
        maze4[3][2] = new Rooms("Room 6","regular room",new Coordinates(3,2));
        maze4[4][2] = new Rooms("Room 7","regular room",new Coordinates(4,2));
        maze4[4][1] = new Rooms("Room 8","regular room",new Coordinates(4,1));
        maze4[4][0] = new Rooms("Room 9","stair room",new Coordinates(4,0));

        Map.map = maze4;
        Map.currentRoom = maze4[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level5() {

        Rooms[][] maze5 = new Rooms[3][6];

        maze5[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze5[0][1] = new Rooms("Room 2","regular room",new Coordinates(0,1));
        maze5[0][2] = new Rooms("Room 3","regular room",new Coordinates(0,2));
        maze5[1][2] = new Rooms("Room 4","regular room",new Coordinates(1,2));
        maze5[1][3] = new Rooms("Room 5","regular room",new Coordinates(1,3));
        maze5[1][4] = new Rooms("Room 6","regular room",new Coordinates(1,4));
        maze5[2][4] = new Rooms("Room 7","regular room",new Coordinates(2,4));
        maze5[2][5] = new Rooms("Room 8","stair room",new Coordinates(2,5));

        Map.map = maze5;
        Map.currentRoom = maze5[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level6() {

        Rooms[][] maze6 = new Rooms[2][2];

        maze6[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze6[0][1] = new Rooms("Room 2","regular room",new Coordinates(0,1));
        maze6[1][1] = new Rooms("Room 3","regular room",new Coordinates(1,1));
        maze6[1][0] = new Rooms("Room 4","stair room",new Coordinates(1,0));

        Map.map = maze6;
        Map.currentRoom = maze6[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level7() {

        Rooms[][] maze7 = new Rooms[3][3];

        maze7[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze7[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze7[2][0] = new Rooms("Room 3","regular room",new Coordinates(2,0));
        maze7[2][1] = new Rooms("Room 4","regular room",new Coordinates(2,1));
        maze7[2][2] = new Rooms("Room 5","regular room",new Coordinates(2,2));
        maze7[1][2] = new Rooms("Room 6","regular room",new Coordinates(1,2));
        maze7[0][2] = new Rooms("Room 7","stair room",new Coordinates(0,2));

        Map.map = maze7;
        Map.currentRoom = maze7[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level8() {

        Rooms[][] maze8 = new Rooms[3][1];

        maze8[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze8[1][0] = new Rooms("Room 2","boss room",new Coordinates(1,0));
        maze8[2][0] = new Rooms("Room 3","stair room",new Coordinates(2,0));

        Map.map = maze8;
        Map.currentRoom = maze8[0][0];
        Monsters Boss = new Monsters("Trickster Sorcerer",600,2,160);
    }
    public static void Level9() {

        Rooms[][] maze9 = new Rooms[2][4];

        maze9[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze9[0][1] = new Rooms("Room 2","regular room",new Coordinates(0,1));
        maze9[0][2] = new Rooms("Room 3","regular room",new Coordinates(0,2));
        maze9[0][3] = new Rooms("Room 4","regular room",new Coordinates(0,3));
        maze9[1][3] = new Rooms("Room 5","stair room",new Coordinates(1,3));

        Map.map = maze9;
        Map.currentRoom = maze9[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level10() {

        Rooms[][] maze10 = new Rooms[4][4];

        maze10[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze10[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze10[2][0] = new Rooms("Room 3","regular room",new Coordinates(2,0));
        maze10[3][0] = new Rooms("Room 4","regular room",new Coordinates(3,0));
        maze10[3][1] = new Rooms("Room 5","regular room",new Coordinates(3,1));
        maze10[3][2] = new Rooms("Room 6","regular room",new Coordinates(3,2));
        maze10[3][3] = new Rooms("Room 7","regular room",new Coordinates(3,3));
        maze10[2][3] = new Rooms("Room 8","regular room",new Coordinates(2,3));
        maze10[1][3] = new Rooms("Room 9","regular room",new Coordinates(1,3));
        maze10[1][2] = new Rooms("Room 10","stair room",new Coordinates(1,2));

        Map.map = maze10;
        Map.currentRoom = maze10[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level11() {

        Rooms[][] maze11 = new Rooms[3][3];

        maze11[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze11[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze11[2][0] = new Rooms("Room 3","regular room",new Coordinates(2,0));
        maze11[2][1] = new Rooms("Room 4","regular room",new Coordinates(2,1));
        maze11[1][1] = new Rooms("Room 5","regular room",new Coordinates(1,1));
        maze11[1][2] = new Rooms("Room 6","regular room",new Coordinates(1,2));
        maze11[0][2] = new Rooms("Room 7","stair room",new Coordinates(0,2));


        Map.map = maze11;
        Map.currentRoom = maze11[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level12() {

        Rooms[][] maze12 = new Rooms[1][6];

        maze12[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze12[0][1] = new Rooms("Room 2","regular room",new Coordinates(0,1));
        maze12[0][2] = new Rooms("Room 3","regular room",new Coordinates(0,2));
        maze12[0][3] = new Rooms("Room 4","regular room",new Coordinates(0,3));
        maze12[0][4] = new Rooms("Room 5","regular room",new Coordinates(0,4));
        maze12[0][5] = new Rooms("Room 6","stair room",new Coordinates(0,5));

        Map.map = maze12;
        Map.currentRoom = maze12[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level13() {

        Rooms[][] maze13 = new Rooms[3][4];

        maze13[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze13[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze13[2][0] = new Rooms("Room 3","regular room",new Coordinates(2,0));
        maze13[2][1] = new Rooms("Room 4","regular room",new Coordinates(2,1));
        maze13[2][2] = new Rooms("Room 5","regular room",new Coordinates(2,2));
        maze13[1][2] = new Rooms("Room 6","regular room",new Coordinates(1,2));
        maze13[0][2] = new Rooms("Room 7","regular room",new Coordinates(0,2));
        maze13[0][3] = new Rooms("Room 8","regular room",new Coordinates(0,3));
        maze13[1][3] = new Rooms("Room 9","regular room",new Coordinates(1,3));
        maze13[2][3] = new Rooms("Room 10","stair room",new Coordinates(2,3));

        Map.map = maze13;
        Map.currentRoom = maze13[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level14() {

        Rooms[][] maze14 = new Rooms[2][3];

        maze14[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze14[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze14[1][1] = new Rooms("Room 3","regular room",new Coordinates(1,1));
        maze14[0][1] = new Rooms("Room 4","regular room",new Coordinates(0,1));
        maze14[0][2] = new Rooms("Room 5","regular room",new Coordinates(0,2));
        maze14[1][2] = new Rooms("Room 6","stair room",new Coordinates(1,2));

        Map.map = maze14;
        Map.currentRoom = maze14[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level15() {

        Rooms[][] maze15 = new Rooms[5][3];

        maze15[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze15[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze15[2][0] = new Rooms("Room 3","regular room",new Coordinates(2,0));
        maze15[2][1] = new Rooms("Room 4","regular room",new Coordinates(2,1));
        maze15[2][2] = new Rooms("Room 5","regular room",new Coordinates(2,2));
        maze15[3][2] = new Rooms("Room 6","regular room",new Coordinates(3,2));
        maze15[4][2] = new Rooms("Room 7","regular room",new Coordinates(4,2));
        maze15[4][1] = new Rooms("Room 8","regular room",new Coordinates(4,1));
        maze15[4][0] = new Rooms("Room 9","stair room",new Coordinates(4,0));

        Map.map = maze15;
        Map.currentRoom = maze15[0][0];
        Monsters dwarf = new Monsters("Dwarf",200,1,40);
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeleton",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
    }
    public static void Level16() {

        Rooms[][] maze16 = new Rooms[1][4];

        maze16[0][0] = new Rooms("Room 1","regular room",new Coordinates(0,0));
        maze16[0][1] = new Rooms("Room 2","regular room",new Coordinates(0,1));
        maze16[0][2] = new Rooms("Room 3","boss room",new Coordinates(0,2));
        maze16[0][3] = new Rooms("Room 4","stair room",new Coordinates(0,3));

        Map.map = maze16;
        Map.currentRoom = maze16[0][0];
        Monsters Boss = new Monsters("Undead Knight",1200,4,300);
    }

    }*/
public class Level {
    public static void Levels(int a) {
        if (a == 1) {
            Rooms[][] maze = new Rooms[5][5];

            maze[0][1] = new Rooms("Room 1","Level 1 room 1",new Coordinates(0,1),false);
            maze[1][1] = new Rooms("Room 3","Level 1 room 3",new Coordinates(1,1),false);
            maze[1][0] = new Rooms("Room 2","Level 1 room 2",new Coordinates(1,0),false);
            maze[1][2] = new Rooms("Room 4","Level 1 room 4",new Coordinates(1,2),false);
            maze[2][2] = new Rooms("Room 5","Level 1 room 5",new Coordinates(2,2),false);
            maze[2][3] = new Rooms("Room 6","Level 1 room 6",new Coordinates(2,3),false);
            maze[3][3] = new Rooms("Room 7","Level 1 room 7",new Coordinates(3,3),false);
            maze[4][3] = new Rooms("Room 10","Level 1 room 10",new Coordinates(4,3),false);
            maze[4][2] = new Rooms("Room 9","Level 1 room 9",new Coordinates(4,2),false);
            maze[4][1] = new Rooms("Room 8(stair room)","Stair room",new Coordinates(4,1),true);


            Map.map = maze;
            Map.currentRoom = maze[0][1];

            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters dwarf2 = new Monsters("Dwarf",200,1,40);
            Monsters goblin = new Monsters("Goblin",120,0.4,60);
            Monsters elf =new Monsters("Elf",30,0.1,10);
            Monsters skeleton =new Monsters("Skeletons",80,0.2,23);
            Monsters zombie =new Monsters("Zombie",150,0.6,30);
            Monsters vampire =new Monsters("Vampire",400,1.5,100);
            TownPeople healer= new TownPeople("Healer",100,true);
            TownPeople townPeople= new TownPeople("Town People",false);
            TownPeople townPeople1= new TownPeople("Town People",false);
            TownPeople townPeople2= new TownPeople("Town People",false);
            TownPeople townPeople3= new TownPeople("Town People",false);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(2,2).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(elf);
            Map.getRoom(1,1).settingTownsPeople(healer);
            Map.getRoom(2,2).settingTownsPeople(townPeople);
            Map.getRoom(1,0).settingMonsters(dwarf2);
            Map.getRoom(1,2).settingMonsters(zombie);
            Map.getRoom(2,3).settingMonsters(vampire);
            Map.getRoom(2,3).settingMonsters(skeleton);
            Map.getRoom(1,2).settingTownsPeople(townPeople);

            dwarf.addMonsterInventory(currentItem.usingWeapon(1,1,1));
            goblin.addMonsterInventory(currentItem.usingArmor(3));
            elf.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            zombie.addMonsterInventory(currentItem.usingWeapon(2,2,2));


            //System.out.println(dwarf.getName()+" have "+ dwarf.getMonsterInventory());

            //dwarf.addInventory(currentItem.usingWeapon(3,3,3));
            //dwarf.getInventory().add(currentItem.usingWeapon(1,2,3));
            // dwarf.getMonsterInventory().add(0,currentItem.usingWeapon(1,1,1));


            //dwarf.getInventory().add(Map.getRoom(1,1).getWeaponName());
            //dwarf.addInventory(currentItem.usingWeapon(1,1,3));

            // if (monster.isDead)



        } else if (a == 3) {
            Rooms[][] maze = new Rooms[4][4];


            maze[0][0] = new Rooms("Room 1", "Level 2 room 1", new Coordinates(0, 0),false);
            maze[0][1] = new Rooms("Room 2", "Level 2 room 2", new Coordinates(0, 1),false);
            maze[1][1] = new Rooms("Room 3", "Level 2 room 3", new Coordinates(1, 1),false);
            maze[2][1] = new Rooms("Room 4", "Level 2 room 4", new Coordinates(2, 1),false);
            maze[3][1] = new Rooms("Room 5", "Level 2 room 5", new Coordinates(3, 1),false);
            maze[1][2] = new Rooms("Room 6", "Level 2 room 6", new Coordinates(1, 2),false);
            maze[1][3] = new Rooms("Room 7", "Level 2 room 7", new Coordinates(1, 3),false);
            maze[2][3] = new Rooms("Room 8", "Level 2 room 8", new Coordinates(2, 3),false);
            maze[3][3] = new Rooms("Room 9(stair room)", "Level 2 stair room", new Coordinates(3, 3),true);

            Map.map = maze;
            Map.currentRoom = maze[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer",200,true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(1,1).settingMonsters(elf);
            Map.getRoom(1,1).settingTownsPeople(healer);
            Map.getRoom(1,2).settingMonsters(zombie);
            Map.getRoom(2,3).settingMonsters(vampire);
            Map.getRoom(2,3).settingMonsters(skeleton);
            Map.getRoom(1,2).settingTownsPeople(townPeople);

        } else if (a == 5) {
            Rooms[][] maze = new Rooms[5][5];

            maze[0][1] = new Rooms("Room 1","Level 3 Room 1",new Coordinates(0,1),false);
            maze[1][1] = new Rooms("Room 3","Level 3 room 3",new Coordinates(1,1),false);
            maze[1][0] = new Rooms("Room 2","Infinite room 2",new Coordinates(1,0),false);
            maze[1][2] = new Rooms("Room 4","Illusion room 4",new Coordinates(1,2),false);
            maze[2][2] = new Rooms("Room 5","Book room 5",new Coordinates(2,2),false);
            maze[2][3] = new Rooms("Room 6",". room 6",new Coordinates(2,3),false);
            maze[3][3] = new Rooms("Room 7",".. room 7",new Coordinates(3,3),false);
            maze[4][3] = new Rooms("Room 10","... room 10",new Coordinates(4,3),false);
            maze[4][2] = new Rooms("Room 9",".... room 9",new Coordinates(4,2),false);
            maze[4][1] = new Rooms("Room 8","Stair room",new Coordinates(4,1),true);


            Map.map = maze;
            Map.currentRoom = maze[0][1];

            Monsters dwarf = new Monsters("Dwarf",200,1,40);
            Monsters dwarf1 = new Monsters("Dwarf",200,1,40);
            Monsters goblin = new Monsters("Goblin",120,0.4,60);
            Monsters elf =new Monsters("Elf",30,0.1,10);
            Monsters skeleton =new Monsters("Skeletons",80,0.2,23);
            Monsters zombie =new Monsters("Zombie",150,0.6,30);
            Monsters vampire =new Monsters("Vampire",400,1.5,100);
            TownPeople healer= new TownPeople("Healer",100,true);
            TownPeople townPeople= new TownPeople("Town People",false);
            TownPeople townPeople1= new TownPeople("Town People",false);
            TownPeople townPeople2= new TownPeople("Town People",false);
            TownPeople townPeople3= new TownPeople("Town People",false);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(2,2).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(elf);
            Map.getRoom(1,1).settingTownsPeople(healer);
            Map.getRoom(2,2).settingTownsPeople(townPeople);
            Map.getRoom(1,0).settingMonsters(dwarf1);
            Map.getRoom(1,2).settingMonsters(zombie);
            Map.getRoom(2,3).settingMonsters(vampire);
            Map.getRoom(2,3).settingMonsters(skeleton);
            Map.getRoom(1,2).settingTownsPeople(townPeople);

        } else if (a == 7) {
            Rooms[][] maze4 = new Rooms[5][3];

            maze4[0][0] = new Rooms("Room 1", "Level 4 room 1", new Coordinates(0, 0),false);
            maze4[1][0] = new Rooms("Room 2", "Level 4 room 2", new Coordinates(1, 0),false);
            maze4[2][0] = new Rooms("Room 3", "Level 4 room 3", new Coordinates(2, 0),false);
            maze4[2][1] = new Rooms("Room 4", "Level 4 room 4", new Coordinates(2, 1),false);
            maze4[2][2] = new Rooms("Room 5", "Level 4 room 5", new Coordinates(2, 2),false);
            maze4[3][2] = new Rooms("Room 6", "Level 4 room 6", new Coordinates(3, 2),false);
            maze4[4][2] = new Rooms("Room 7", "Level 4 room 7", new Coordinates(4, 2),false);
            maze4[4][1] = new Rooms("Room 8", "Level 4 room 8", new Coordinates(4, 1),false);
            maze4[4][0] = new Rooms("Room 9(stair room)", "Level 4 stair room", new Coordinates(4, 0),true);

            Map.map = maze4;
            Map.currentRoom = maze4[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 9) {
            Rooms[][] maze5 = new Rooms[3][6];

            maze5[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze5[0][1] = new Rooms("Room 2", "regular room", new Coordinates(0, 1));
            maze5[0][2] = new Rooms("Room 3", "regular room", new Coordinates(0, 2));
            maze5[1][2] = new Rooms("Room 4", "regular room", new Coordinates(1, 2));
            maze5[1][3] = new Rooms("Room 5", "regular room", new Coordinates(1, 3));
            maze5[1][4] = new Rooms("Room 6", "regular room", new Coordinates(1, 4));
            maze5[2][4] = new Rooms("Room 7", "regular room", new Coordinates(2, 4));
            maze5[2][5] = new Rooms("Room 8", "stair room", new Coordinates(2, 5));

            Map.map = maze5;
            Map.currentRoom = maze5[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);
        } else if (a == 11) {
            Rooms[][] maze6 = new Rooms[2][2];

            maze6[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze6[0][1] = new Rooms("Room 2", "regular room", new Coordinates(0, 1));
            maze6[1][1] = new Rooms("Room 3", "regular room", new Coordinates(1, 1));
            maze6[1][0] = new Rooms("Room 4", "stair room", new Coordinates(1, 0));

            Map.map = maze6;
            Map.currentRoom = maze6[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);
        } else if (a == 13) {
            Rooms[][] maze7 = new Rooms[3][3];

            maze7[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze7[1][0] = new Rooms("Room 2", "regular room", new Coordinates(1, 0));
            maze7[2][0] = new Rooms("Room 3", "regular room", new Coordinates(2, 0));
            maze7[2][1] = new Rooms("Room 4", "regular room", new Coordinates(2, 1));
            maze7[2][2] = new Rooms("Room 5", "regular room", new Coordinates(2, 2));
            maze7[1][2] = new Rooms("Room 6", "regular room", new Coordinates(1, 2));
            maze7[0][2] = new Rooms("Room 7", "stair room", new Coordinates(0, 2));

            Map.map = maze7;
            Map.currentRoom = maze7[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 15) {
            Rooms[][] maze8 = new Rooms[3][1];


            maze8[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze8[1][0] = new Rooms("Room 2", "boss room", new Coordinates(1, 0));
            maze8[2][0] = new Rooms("Room 3", "stair room", new Coordinates(2, 0));

            Map.map = maze8;
            Map.currentRoom = maze8[0][0];
            Monsters Boss = new Monsters("Trickster Sorcerer", 600, 2, 160);

        } else if (a == 17) {
            Rooms[][] maze9 = new Rooms[2][4];

            maze9[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze9[0][1] = new Rooms("Room 2", "regular room", new Coordinates(0, 1));
            maze9[0][2] = new Rooms("Room 3", "regular room", new Coordinates(0, 2));
            maze9[0][3] = new Rooms("Room 4", "regular room", new Coordinates(0, 3));
            maze9[1][3] = new Rooms("Room 5", "stair room", new Coordinates(1, 3));

            Map.map = maze9;
            Map.currentRoom = maze9[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 19) {
            Rooms[][] maze10 = new Rooms[4][4];

            maze10[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze10[1][0] = new Rooms("Room 2", "regular room", new Coordinates(1, 0));
            maze10[2][0] = new Rooms("Room 3", "regular room", new Coordinates(2, 0));
            maze10[3][0] = new Rooms("Room 4", "regular room", new Coordinates(3, 0));
            maze10[3][1] = new Rooms("Room 5", "regular room", new Coordinates(3, 1));
            maze10[3][2] = new Rooms("Room 6", "regular room", new Coordinates(3, 2));
            maze10[3][3] = new Rooms("Room 7", "regular room", new Coordinates(3, 3));
            maze10[2][3] = new Rooms("Room 8", "regular room", new Coordinates(2, 3));
            maze10[1][3] = new Rooms("Room 9", "regular room", new Coordinates(1, 3));
            maze10[1][2] = new Rooms("Room 10", "stair room", new Coordinates(1, 2));

            Map.map = maze10;
            Map.currentRoom = maze10[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 21) {
            Rooms[][] maze11 = new Rooms[3][3];

            maze11[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze11[1][0] = new Rooms("Room 2", "regular room", new Coordinates(1, 0));
            maze11[2][0] = new Rooms("Room 3", "regular room", new Coordinates(2, 0));
            maze11[2][1] = new Rooms("Room 4", "regular room", new Coordinates(2, 1));
            maze11[1][1] = new Rooms("Room 5", "regular room", new Coordinates(1, 1));
            maze11[1][2] = new Rooms("Room 6", "regular room", new Coordinates(1, 2));
            maze11[0][2] = new Rooms("Room 7", "stair room", new Coordinates(0, 2));


            Map.map = maze11;
            Map.currentRoom = maze11[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 23) {
            Rooms[][] maze12 = new Rooms[1][6];

            maze12[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze12[0][1] = new Rooms("Room 2", "regular room", new Coordinates(0, 1));
            maze12[0][2] = new Rooms("Room 3", "regular room", new Coordinates(0, 2));
            maze12[0][3] = new Rooms("Room 4", "regular room", new Coordinates(0, 3));
            maze12[0][4] = new Rooms("Room 5", "regular room", new Coordinates(0, 4));
            maze12[0][5] = new Rooms("Room 6", "stair room", new Coordinates(0, 5));

            Map.map = maze12;
            Map.currentRoom = maze12[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 25) {
            Rooms[][] maze13 = new Rooms[3][4];

            maze13[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze13[1][0] = new Rooms("Room 2", "regular room", new Coordinates(1, 0));
            maze13[2][0] = new Rooms("Room 3", "regular room", new Coordinates(2, 0));
            maze13[2][1] = new Rooms("Room 4", "regular room", new Coordinates(2, 1));
            maze13[2][2] = new Rooms("Room 5", "regular room", new Coordinates(2, 2));
            maze13[1][2] = new Rooms("Room 6", "regular room", new Coordinates(1, 2));
            maze13[0][2] = new Rooms("Room 7", "regular room", new Coordinates(0, 2));
            maze13[0][3] = new Rooms("Room 8", "regular room", new Coordinates(0, 3));
            maze13[1][3] = new Rooms("Room 9", "regular room", new Coordinates(1, 3));
            maze13[2][3] = new Rooms("Room 10", "stair room", new Coordinates(2, 3));

            Map.map = maze13;
            Map.currentRoom = maze13[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);
        } else if (a == 27) {
            Rooms[][] maze14 = new Rooms[2][3];

            maze14[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze14[1][0] = new Rooms("Room 2", "regular room", new Coordinates(1, 0));
            maze14[1][1] = new Rooms("Room 3", "regular room", new Coordinates(1, 1));
            maze14[0][1] = new Rooms("Room 4", "regular room", new Coordinates(0, 1));
            maze14[0][2] = new Rooms("Room 5", "regular room", new Coordinates(0, 2));
            maze14[1][2] = new Rooms("Room 6", "stair room", new Coordinates(1, 2));

            Map.map = maze14;
            Map.currentRoom = maze14[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 29) {
            Rooms[][] maze15 = new Rooms[5][3];

            maze15[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze15[1][0] = new Rooms("Room 2", "regular room", new Coordinates(1, 0));
            maze15[2][0] = new Rooms("Room 3", "regular room", new Coordinates(2, 0));
            maze15[2][1] = new Rooms("Room 4", "regular room", new Coordinates(2, 1));
            maze15[2][2] = new Rooms("Room 5", "regular room", new Coordinates(2, 2));
            maze15[3][2] = new Rooms("Room 6", "regular room", new Coordinates(3, 2));
            maze15[4][2] = new Rooms("Room 7", "regular room", new Coordinates(4, 2));
            maze15[4][1] = new Rooms("Room 8", "regular room", new Coordinates(4, 1));
            maze15[4][0] = new Rooms("Room 9", "stair room", new Coordinates(4, 0));

            Map.map = maze15;
            Map.currentRoom = maze15[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);

        } else if (a == 31) {
            Rooms[][] maze16 = new Rooms[1][4];

            maze16[0][0] = new Rooms("Room 1", "regular room", new Coordinates(0, 0));
            maze16[0][1] = new Rooms("Room 2", "regular room", new Coordinates(0, 1));
            maze16[0][2] = new Rooms("Room 3", "boss room", new Coordinates(0, 2));
            maze16[0][3] = new Rooms("Room 4", "stair room", new Coordinates(0, 3));

            Map.map = maze16;
            Map.currentRoom = maze16[0][0];
            Monsters Boss = new Monsters("Undead Knight", 1200, 4, 300);
        }
    }
}