package SE116Project;

public class Level {
    public static CurrentItem currentItem = new CurrentItem();
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

            Monsters dwarf = new Monsters("Dwarf",200,1,40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(1,1,1));
            Monsters dwarf1 = new Monsters("Dwarf",200,1,40);
            dwarf.addMonsterInventory(currentItem.usingArmor(1));
            Monsters goblin = new Monsters("Goblin",120,0.4,60);
            Monsters elf =new Monsters("Elf",30,0.1,10);
            Monsters elf1=new Monsters("Elf",30,0.1,10);
            Monsters skeleton =new Monsters("Skeletons",80,0.2,23);
            Monsters skeleton1 =new Monsters("Skeletons",80,0.2,23);
            Monsters zombie =new Monsters("Zombie",150,0.6,30);
            zombie.addMonsterInventory(currentItem.usingArmor(1));
            Monsters zombie1=new Monsters("Zombie",150,0.6,30);
            Monsters vampire =new Monsters("Vampire",400,1.5,100);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,3,1));
            TownPeople healer= new TownPeople("Healer",100,true);
            TownPeople townPeople= new TownPeople("Town People",false);
            TownPeople townPeople1= new TownPeople("Town People",false);
            TownPeople townPeople2= new TownPeople("Town People",false);
            TownPeople townPeople3= new TownPeople("Town People",false);
            Map.getRoom(1,0).settingMonsters(dwarf);
            Map.getRoom(1,0).settingMonsters(elf);
            Map.getRoom(1,0).settingMonsters(dwarf1);
            Map.getRoom(1,0).settingTownsPeople(townPeople);
            Map.getRoom(2,2).settingMonsters(elf1);
            Map.getRoom(2,2).settingMonsters(goblin);
            Map.getRoom(2,2).settingMonsters(skeleton1);
            Map.getRoom(2,2).settingTownsPeople(townPeople);
            Map.getRoom(2,3).settingMonsters(zombie);
            Map.getRoom(2,3).settingMonsters(vampire);
            Map.getRoom(2,3).settingMonsters(skeleton);
            Map.getRoom(2,3).settingTownsPeople(healer);
            Map.getRoom(4,3).settingMonsters(zombie1);


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
            goblin.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            zombie.addMonsterInventory(currentItem.usingArmor(1));
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,3,1));
            TownPeople healer = new TownPeople("Healer",200,true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(1,1).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(vampire);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(1,1).settingTownsPeople(healer);
            Map.getRoom(2,1).settingMonsters(elf);
            Map.getRoom(2,3).settingMonsters(zombie);
            Map.getRoom(2,3).settingMonsters(vampire);
            Map.getRoom(2,3).settingMonsters(skeleton);
            Map.getRoom(2,3).settingTownsPeople(townPeople);
            Map.getRoom(3,1).settingMonsters(skeleton);


        } else if (a == 5) {
            Rooms[][] maze = new Rooms[5][5];

            maze[0][1] = new Rooms("Room 1","Level 3 Room 1",new Coordinates(0,1),false);
            maze[1][1] = new Rooms("Room 3","Level 3 room 3",new Coordinates(1,1),false);
            maze[1][0] = new Rooms("Room 2","Level 3 room 2",new Coordinates(1,0),false);
            maze[1][2] = new Rooms("Room 4","Level 3 room 4",new Coordinates(1,2),false);
            maze[2][2] = new Rooms("Room 5","Level 3 room 5",new Coordinates(2,2),false);
            maze[2][3] = new Rooms("Room 6","Level 3 room 6",new Coordinates(2,3),false);
            maze[3][3] = new Rooms("Room 7","Level 3 room 7",new Coordinates(3,3),false);
            maze[4][3] = new Rooms("Room 10","Level 3 room 10",new Coordinates(4,3),false);
            maze[4][2] = new Rooms("Room 9","Level 3 room 9",new Coordinates(4,2),false);
            maze[4][1] = new Rooms("Room 8(stair room)","Level 3 stair room",new Coordinates(4,1),true);


            Map.map = maze;
            Map.currentRoom = maze[0][1];

            Monsters dwarf = new Monsters("Dwarf",200,1,40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(2,1,1));
            Monsters dwarf1 = new Monsters("Dwarf",200,1,40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(2,2,1));
            Monsters goblin = new Monsters("Goblin",120,0.4,60);
            Monsters elf =new Monsters("Elf",30,0.1,10);
            Monsters skeleton =new Monsters("Skeletons",80,0.2,23);
            skeleton.addMonsterInventory(currentItem.usingArmor(1));
            Monsters zombie =new Monsters("Zombie",150,0.6,30);
            Monsters vampire =new Monsters("Vampire",400,1.5,100);
            Monsters vampire1 =new Monsters("Vampire",400,1.5,100);
            vampire.addMonsterInventory(currentItem.usingArmor(2));
            TownPeople healer= new TownPeople("Healer",100,true);
            TownPeople townPeople= new TownPeople("Town People",false);
            Map.getRoom(1,1).settingMonsters(zombie);
            Map.getRoom(1,1).settingMonsters(skeleton);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(1,1).settingTownsPeople(townPeople);
            Map.getRoom(2,3).settingMonsters(dwarf1);
            Map.getRoom(2,3).settingMonsters(elf);
            Map.getRoom(2,3).settingMonsters(vampire);
            Map.getRoom(2,3).settingTownsPeople(townPeople);
            Map.getRoom(2,3).settingMonsters(goblin);
            Map.getRoom(3,3).settingMonsters(vampire1);
        } else if (a == 7) {
            Rooms[][] maze = new Rooms[4][4];


            maze[0][0] = new Rooms("Room 1", "Level 4 room 1", new Coordinates(0, 0),false);
            maze[0][1] = new Rooms("Room 2", "Level 4 room 2", new Coordinates(0, 1),false);
            maze[1][1] = new Rooms("Room 3", "Level 4 room 3", new Coordinates(1, 1),false);
            maze[2][1] = new Rooms("Room 4", "Level 4 room 4", new Coordinates(2, 1),false);
            maze[3][1] = new Rooms("Room 5", "Level 4 room 5", new Coordinates(3, 1),false);
            maze[1][2] = new Rooms("Room 6", "Level 4 room 6", new Coordinates(1, 2),false);
            maze[1][3] = new Rooms("Room 7", "Level 4 room 7", new Coordinates(1, 3),false);
            maze[2][3] = new Rooms("Room 8", "Level 4 room 8", new Coordinates(2, 3),false);
            maze[3][3] = new Rooms("Room 9(stair room)", "Level 4 stair room", new Coordinates(3, 3),true);

            Map.map = maze;
            Map.currentRoom = maze[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            goblin.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            zombie.addMonsterInventory(currentItem.usingArmor(1));
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,3,1));
            TownPeople healer = new TownPeople("Healer",200,true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(1,1).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(vampire);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(1,1).settingTownsPeople(healer);
            Map.getRoom(2,1).settingMonsters(elf);
            Map.getRoom(2,3).settingMonsters(zombie);
            Map.getRoom(2,3).settingMonsters(vampire);
            Map.getRoom(2,3).settingMonsters(skeleton);
            Map.getRoom(2,3).settingTownsPeople(townPeople);
            Map.getRoom(3,1).settingMonsters(skeleton);


        } else if (a == 9) {
            Rooms[][] maze = new Rooms[3][6];

            maze[0][0] = new Rooms("Room 1", "Level 5 room 1", new Coordinates(0, 0));
            maze[0][1] = new Rooms("Room 2", "Level 5 room 2", new Coordinates(0, 1));
            maze[0][2] = new Rooms("Room 3", "Level 5 room 3", new Coordinates(0, 2));
            maze[1][2] = new Rooms("Room 4", "Level 5 room 4", new Coordinates(1, 2));
            maze[1][3] = new Rooms("Room 5", "Level 5 room 5", new Coordinates(1, 3));
            maze[1][4] = new Rooms("Room 6", "Level 5 room 6", new Coordinates(1, 4));
            maze[2][4] = new Rooms("Room 7", "Level 5 room 7", new Coordinates(2, 4));
            maze[2][5] = new Rooms("Room 8(stair room)", "Level 5 stair room", new Coordinates(2, 5));

            Map.map = maze;
            Map.currentRoom = maze[0][0];
            Monsters dwarf = new Monsters("Dwarf", 300, 1.2, 40);
            Monsters dwarf1 = new Monsters("Dwarf", 300, 1.2, 40);
            dwarf1.addMonsterInventory(currentItem.usingArmor(1));
            Monsters goblin = new Monsters("Goblin", 170, 0.6, 60);
            Monsters goblin1 = new Monsters("Goblin", 170, 0.6, 60);
            goblin1.addMonsterInventory(currentItem.usingWeapon(1,1,3));
            Monsters elf = new Monsters("Elf", 60, 0.3, 20);
            Monsters skeleton1 = new Monsters("Skeleton", 90, 0.6, 23);
            skeleton1.addMonsterInventory(currentItem.usingWeapon(1,2,3));
            Monsters skeleton = new Monsters("Skeleton", 90, 0.6, 23);
            Monsters zombie = new Monsters("Zombie", 200, 1, 50);
            skeleton.addMonsterInventory(currentItem.usingWeapon(2));
            Monsters vampire = new Monsters("Vampire", 600, 3, 150);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            TownPeople healer = new TownPeople("Healer",300, true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(0,2).settingMonsters(vampire);
            Map.getRoom(0,2).settingMonsters(zombie);
            Map.getRoom(0,2).settingMonsters(elf);
            Map.getRoom(0,2).settingTownsPeople(healer);
            Map.getRoom(1,4).settingMonsters(dwarf);
            Map.getRoom(1,4).settingMonsters(goblin);
            Map.getRoom(1,4).settingMonsters(goblin1);
            Map.getRoom(1,4).settingTownsPeople(townPeople);
            Map.getRoom(2,4).settingMonsters(dwarf1);
            Map.getRoom(1,3).settingMonsters(skeleton1);


        } else if (a == 11) {
            Rooms[][] maze6 = new Rooms[2][2];

            maze6[0][0] = new Rooms("Room 1", "Level 6 room 1", new Coordinates(0, 0));
            maze6[0][1] = new Rooms("Room 2", "Level 6 room 2", new Coordinates(0, 1));
            maze6[1][1] = new Rooms("Room 3", "Level 6 room 3" , new Coordinates(1, 1));
            maze6[1][0] = new Rooms("Room 4", "Level 6 room 4", new Coordinates(1, 0));

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

            maze7[0][0] = new Rooms("Room 1", "Level 7 room 1", new Coordinates(0, 0));
            maze7[1][0] = new Rooms("Room 2", "Level 7 room 2", new Coordinates(1, 0));
            maze7[2][0] = new Rooms("Room 3", "Level 7 room 3", new Coordinates(2, 0));
            maze7[2][1] = new Rooms("Room 4", "Level 7 room 4", new Coordinates(2, 1));
            maze7[2][2] = new Rooms("Room 5", "Level 7 room 5", new Coordinates(2, 2));
            maze7[1][2] = new Rooms("Room 6", "Level 7 room 6", new Coordinates(1, 2));
            maze7[0][2] = new Rooms("Room 7", "Level 7 room 7", new Coordinates(0, 2));

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


            maze8[0][0] = new Rooms("Room 1", "Level 8 room 1", new Coordinates(0, 0));
            maze8[1][0] = new Rooms("Room 2", "Level 8 room 2", new Coordinates(1, 0));
            maze8[2][0] = new Rooms("Room 3", "Level 8 room 3", new Coordinates(2, 0));

            Map.map = maze8;
            Map.currentRoom = maze8[0][0];
            Monsters Boss = new Monsters("Trickster Sorcerer", 600, 2, 160);

        } else if (a == 17) {
            Rooms[][] maze9 = new Rooms[2][4];

            maze9[0][0] = new Rooms("Room 1", "Level 9 room 1", new Coordinates(0, 0));
            maze9[0][1] = new Rooms("Room 2", "Level 9 room 2", new Coordinates(0, 1));
            maze9[0][2] = new Rooms("Room 3", "Level 9 room 3", new Coordinates(0, 2));
            maze9[0][3] = new Rooms("Room 4", "Level 9 room 4", new Coordinates(0, 3));
            maze9[1][3] = new Rooms("Room 5", "Level 9 stair room", new Coordinates(1, 3));

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

            maze10[0][0] = new Rooms("Room 1", "Level 10 room 1", new Coordinates(0, 0));
            maze10[1][0] = new Rooms("Room 2", "Level 10 room 2", new Coordinates(1, 0));
            maze10[2][0] = new Rooms("Room 3", "Level 10 room 3", new Coordinates(2, 0));
            maze10[3][0] = new Rooms("Room 4", "Level 10 room 4", new Coordinates(3, 0));
            maze10[3][1] = new Rooms("Room 5", "Level 10 room 5 ", new Coordinates(3, 1));
            maze10[3][2] = new Rooms("Room 6", "Level 10 room 6", new Coordinates(3, 2));
            maze10[3][3] = new Rooms("Room 7", "Level 10 room 7", new Coordinates(3, 3));
            maze10[2][3] = new Rooms("Room 8", "Level 10 room 8", new Coordinates(2, 3));
            maze10[1][3] = new Rooms("Room 9", "Level 10 room 9", new Coordinates(1, 3));
            maze10[1][2] = new Rooms("Room 10", "Level 10 stair room", new Coordinates(1, 2));

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

            maze11[0][0] = new Rooms("Room 1", "Level 11 room 1", new Coordinates(0, 0));
            maze11[1][0] = new Rooms("Room 2", "Level 11 room 2", new Coordinates(1, 0));
            maze11[2][0] = new Rooms("Room 3", "Level 11 room 3", new Coordinates(2, 0));
            maze11[2][1] = new Rooms("Room 4", "Level 11 room 4 ", new Coordinates(2, 1));
            maze11[1][1] = new Rooms("Room 5", "Level 11 room 5" , new Coordinates(1, 1));
            maze11[1][2] = new Rooms("Room 6", "Level 11 room 6", new Coordinates(1, 2));
            maze11[0][2] = new Rooms("Room 7", "Level 11 stair room", new Coordinates(0, 2));


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

            maze12[0][0] = new Rooms("Room 1", "Level 12 room 1", new Coordinates(0, 0));
            maze12[0][1] = new Rooms("Room 2", "Level 12 room 2 ", new Coordinates(0, 1));
            maze12[0][2] = new Rooms("Room 3", "Level 12 room 3", new Coordinates(0, 2));
            maze12[0][3] = new Rooms("Room 4", "Level 12 room 4", new Coordinates(0, 3));
            maze12[0][4] = new Rooms("Room 5", "Level 12 room 5", new Coordinates(0, 4));
            maze12[0][5] = new Rooms("Room 6", "Level 12 stair room", new Coordinates(0, 5));

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

            maze13[0][0] = new Rooms("Room 1", "Level 13 room 1", new Coordinates(0, 0));
            maze13[1][0] = new Rooms("Room 2", "Level 13 room 2", new Coordinates(1, 0));
            maze13[2][0] = new Rooms("Room 3", "Level 13 room 3", new Coordinates(2, 0));
            maze13[2][1] = new Rooms("Room 4", "Level 13 room 4", new Coordinates(2, 1));
            maze13[2][2] = new Rooms("Room 5", "Level 13 room 5", new Coordinates(2, 2));
            maze13[1][2] = new Rooms("Room 6", "Level 13 room 6", new Coordinates(1, 2));
            maze13[0][2] = new Rooms("Room 7", "Level 13 room 7", new Coordinates(0, 2));
            maze13[0][3] = new Rooms("Room 8", "Level 13 room 8", new Coordinates(0, 3));
            maze13[1][3] = new Rooms("Room 9", "Level 13 room 9", new Coordinates(1, 3));
            maze13[2][3] = new Rooms("Room 10", "Level 13 stair room", new Coordinates(2, 3));

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

            maze14[0][0] = new Rooms("Room 1", "Level 14 room 1", new Coordinates(0, 0));
            maze14[1][0] = new Rooms("Room 2", "Level 14 room 2 ", new Coordinates(1, 0));
            maze14[1][1] = new Rooms("Room 3", "Level 14 room 3", new Coordinates(1, 1));
            maze14[0][1] = new Rooms("Room 4", "Level 14 room 4", new Coordinates(0, 1));
            maze14[0][2] = new Rooms("Room 5", "Level 14 room 5", new Coordinates(0, 2));
            maze14[1][2] = new Rooms("Room 6", "Level 14 stair room", new Coordinates(1, 2));

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

            maze15[0][0] = new Rooms("Room 1", "Level 15 room 1", new Coordinates(0, 0));
            maze15[1][0] = new Rooms("Room 2", "Level 15 room 2", new Coordinates(1, 0));
            maze15[2][0] = new Rooms("Room 3", "Level 15 room 3", new Coordinates(2, 0));
            maze15[2][1] = new Rooms("Room 4", "Level 15 room 4", new Coordinates(2, 1));
            maze15[2][2] = new Rooms("Room 5", "Level 15 room 5", new Coordinates(2, 2));
            maze15[3][2] = new Rooms("Room 6", "Level 15 room 6", new Coordinates(3, 2));
            maze15[4][2] = new Rooms("Room 7", "Level 15 room 7", new Coordinates(4, 2));
            maze15[4][1] = new Rooms("Room 8", "Level 15 room 8", new Coordinates(4, 1));
            maze15[4][0] = new Rooms("Room 9", "Level 15 stair room", new Coordinates(4, 0));

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

            maze16[0][0] = new Rooms("Room 1", "Level 16 room", new Coordinates(0, 0));
            maze16[0][1] = new Rooms("Room 2", "Level 16 room", new Coordinates(0, 1));
            maze16[0][2] = new Rooms("Room 3", "boss room", new Coordinates(0, 2));
            maze16[0][3] = new Rooms("Room 4", "stair room", new Coordinates(0, 3));

            Map.map = maze16;
            Map.currentRoom = maze16[0][0];
            Monsters Boss = new Monsters("Undead Knight(a.k.a. The Boss)", 1200, 4, 300);
        }
    }
}
