package SE116Project;

public class Level {
    public static CurrentItem currentItem = new CurrentItem();
    public static void Levels(int a) {

        if (a == 1) {
            System.out.println("Welcome to level 1");
            Rooms[][] dungeon = new Rooms[5][5];

            dungeon[0][1] = new Rooms("Room 1","Level 1 room 1",new Coordinates(0,1),false);
            dungeon[1][1] = new Rooms("Room 3","Level 1 room 3",new Coordinates(1,1),false);
            dungeon[1][0] = new Rooms("Room 2","Level 1 room 2",new Coordinates(1,0),false);
            dungeon[1][2] = new Rooms("Room 4","Level 1 room 4",new Coordinates(1,2),false);
            dungeon[2][2] = new Rooms("Room 5","Level 1 room 5",new Coordinates(2,2),false);
            dungeon[2][3] = new Rooms("Room 6","Level 1 room 6",new Coordinates(2,3),false);
            dungeon[3][3] = new Rooms("Room 7","Level 1 room 7",new Coordinates(3,3),false);
            dungeon[4][3] = new Rooms("Room 10","Level 1 room 10",new Coordinates(4,3),false);
            dungeon[4][2] = new Rooms("Room 9","Level 1 room 9",new Coordinates(4,2),false);
            dungeon[4][1] = new Rooms("Room 8(stair room)","Stair room",new Coordinates(4,1),true);


            Map.map = dungeon;
            Map.currentRoom = dungeon[0][1];

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
            System.out.println("Welcome to level 2");
            Rooms[][] dungeon = new Rooms[4][4];


            dungeon[0][0] = new Rooms("Room 1", "Level 2 room 1", new Coordinates(0, 0),false);
            dungeon[0][1] = new Rooms("Room 2", "Level 2 room 2", new Coordinates(0, 1),false);
            dungeon[1][1] = new Rooms("Room 3", "Level 2 room 3", new Coordinates(1, 1),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 2 room 4", new Coordinates(2, 1),false);
            dungeon[3][1] = new Rooms("Room 5", "Level 2 room 5", new Coordinates(3, 1),false);
            dungeon[1][2] = new Rooms("Room 6", "Level 2 room 6", new Coordinates(1, 2),false);
            dungeon[1][3] = new Rooms("Room 7", "Level 2 room 7", new Coordinates(1, 3),false);
            dungeon[2][3] = new Rooms("Room 8", "Level 2 room 8", new Coordinates(2, 3),false);
            dungeon[3][3] = new Rooms("Room 9(stair room)", "Level 2 stair room", new Coordinates(3, 3),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
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
            System.out.println("Welcome to level 3");
            Rooms[][] dungeon = new Rooms[5][5];

            dungeon[0][1] = new Rooms("Room 1","Level 3 Room 1",new Coordinates(0,1),false);
            dungeon[1][1] = new Rooms("Room 3","Level 3 room 3",new Coordinates(1,1),false);
            dungeon[1][0] = new Rooms("Room 2","Level 3 room 2",new Coordinates(1,0),false);
            dungeon[1][2] = new Rooms("Room 4","Level 3 room 4",new Coordinates(1,2),false);
            dungeon[2][2] = new Rooms("Room 5","Level 3 room 5",new Coordinates(2,2),false);
            dungeon[2][3] = new Rooms("Room 6","Level 3 room 6",new Coordinates(2,3),false);
            dungeon[3][3] = new Rooms("Room 7","Level 3 room 7",new Coordinates(3,3),false);
            dungeon[4][3] = new Rooms("Room 10","Level 3 room 10",new Coordinates(4,3),false);
            dungeon[4][2] = new Rooms("Room 9","Level 3 room 9",new Coordinates(4,2),false);
            dungeon[4][1] = new Rooms("Room 8(stair room)","Level 3 stair room",new Coordinates(4,1),true);


            Map.map = dungeon;
            Map.currentRoom = dungeon[0][1];

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
            System.out.println("Welcome to level 4");
            Rooms[][] dungeon = new Rooms[4][4];


            dungeon[0][0] = new Rooms("Room 1", "Level 4 room 1", new Coordinates(0, 0),false);
            dungeon[0][1] = new Rooms("Room 2", "Level 4 room 2", new Coordinates(0, 1),false);
            dungeon[1][1] = new Rooms("Room 3", "Level 4 room 3", new Coordinates(1, 1),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 4 room 4", new Coordinates(2, 1),false);
            dungeon[3][1] = new Rooms("Room 5", "Level 4 room 5", new Coordinates(3, 1),false);
            dungeon[1][2] = new Rooms("Room 6", "Level 4 room 6", new Coordinates(1, 2),false);
            dungeon[1][3] = new Rooms("Room 7", "Level 4 room 7", new Coordinates(1, 3),false);
            dungeon[2][3] = new Rooms("Room 8", "Level 4 room 8", new Coordinates(2, 3),false);
            dungeon[3][3] = new Rooms("Room 9(stair room)", "Level 4 stair room", new Coordinates(3, 3),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 200, 1, 40);
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            goblin.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            zombie.addMonsterInventory(currentItem.usingArmor(1));
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            Monsters vampire1 = new Monsters("Vampire", 400, 1.5, 100);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,3,1));
            TownPeople healer = new TownPeople("Healer",200,true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(1,1).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(vampire);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(1,1).settingTownsPeople(healer);
            Map.getRoom(2,1).settingMonsters(elf);
            Map.getRoom(2,3).settingMonsters(zombie);
            Map.getRoom(2,3).settingMonsters(vampire1);
            Map.getRoom(2,3).settingMonsters(skeleton);
            Map.getRoom(2,3).settingTownsPeople(townPeople);
            Map.getRoom(3,1).settingMonsters(skeleton);


        } else if (a == 9) {
            System.out.println("Welcome to level 5");

            Rooms[][] dungeon = new Rooms[4][4];
            dungeon[0][0] = new Rooms("Room 1", "Level 5 room 1", new Coordinates(0, 0),false);
            dungeon[0][1] = new Rooms("Room 2", "Level 5 room 2", new Coordinates(0, 1),false);
            dungeon[1][1] = new Rooms("Room 3", "Level 5 room 3", new Coordinates(1, 1),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 5 room 4", new Coordinates(2, 1),false);
            dungeon[3][1] = new Rooms("Room 5", "Level 5 room 5", new Coordinates(3, 1),false);
            dungeon[1][2] = new Rooms("Room 6", "Level 5 room 6", new Coordinates(1, 2),false);
            dungeon[1][3] = new Rooms("Room 7", "Level 5 room 7", new Coordinates(1, 3),false);
            dungeon[2][3] = new Rooms("Room 8", "Level 5 room 8", new Coordinates(2, 3),false);
            dungeon[3][3] = new Rooms("Room 9(stair room)", "Level 5 stair room", new Coordinates(3, 3),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
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
            Map.getRoom(2,1).settingMonsters(vampire);
            Map.getRoom(2,1).settingMonsters(zombie);
            Map.getRoom(2,1).settingMonsters(elf);
            Map.getRoom(2,1).settingTownsPeople(healer);
            Map.getRoom(1,2).settingMonsters(dwarf);
            Map.getRoom(1,2).settingMonsters(goblin);
            Map.getRoom(1,2).settingMonsters(goblin1);
            Map.getRoom(1,2).settingTownsPeople(townPeople);
            Map.getRoom(2,3).settingMonsters(dwarf1);
            Map.getRoom(3,1).settingMonsters(skeleton1);


        } else if (a == 11) {
            System.out.println("Welcome to level 6");
            Rooms[][] dungeon = new Rooms[2][2];

            dungeon[0][0] = new Rooms("Room 1", "Level 6 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 6 room 2", new Coordinates(1, 0),false);
            dungeon[1][1] = new Rooms("Room 3", "Level 6 room 3" , new Coordinates(1, 1),false);
            dungeon[0][1] = new Rooms("Room 4(stair room)", "Level 6 stair room", new Coordinates(0, 1),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 300, 1.2, 40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters goblin = new Monsters("Goblin", 170, 0.6, 60);
            goblin.addMonsterInventory(currentItem.usingWeapon(1,1,3));
            Monsters elf = new Monsters("Elf", 60, 0.3, 20);
            Monsters skeleton1 = new Monsters("Skeleton", 90, 0.6, 23);
            skeleton1.addMonsterInventory(currentItem.usingWeapon(1,2,3));
            Monsters skeleton = new Monsters("Skeleton", 90, 0.6, 23);
            Monsters zombie = new Monsters("Zombie", 200, 1, 50);
            skeleton.addMonsterInventory(currentItem.usingWeapon(2));
            Monsters vampire = new Monsters("Vampire", 600, 3, 150);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(1,1).settingMonsters(dwarf);
            Map.getRoom(1,1).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(elf);
            Map.getRoom(1,1).settingTownsPeople(townPeople);
            Map.getRoom(1,0).settingMonsters(skeleton1);
            Map.getRoom(1,0).settingMonsters(skeleton);
            Map.getRoom(1,0).settingMonsters(zombie);
            Map.getRoom(1,0).settingTownsPeople(townPeople);

        } else if (a == 13) {
            System.out.println("Welcome to level 7");
            Rooms[][] dungeon = new Rooms[3][3];

            dungeon[0][0] = new Rooms("Room 1", "Level 7 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 7 room 2", new Coordinates(1, 0),false);
            dungeon[2][0] = new Rooms("Room 3", "Level 7 room 3", new Coordinates(2, 0),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 7 room 4", new Coordinates(2, 1),false);
            dungeon[2][2] = new Rooms("Room 5", "Level 7 room 5", new Coordinates(2, 2),false);
            dungeon[1][2] = new Rooms("Room 6", "Level 7 room 6", new Coordinates(1, 2),false);
            dungeon[0][2] = new Rooms("Room 7(stair room)", "Level 7 stair room", new Coordinates(0, 2),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 300, 1.2, 40);
            Monsters dwarf1 = new Monsters("Dwarf", 300, 1.2, 40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(1,2,2));
            Monsters goblin = new Monsters("Goblin", 170, 0.6, 60);
            Monsters elf = new Monsters("Elf", 60, 0.3, 20);
            elf.addMonsterInventory(currentItem.usingWeapon(1,1,1));
            Monsters skeleton1 = new Monsters("Skeleton", 90, 0.6, 23);
            skeleton1.addMonsterInventory(currentItem.usingWeapon(1,2,1));
            Monsters skeleton = new Monsters("Skeleton", 90, 0.6, 23);
            Monsters zombie1 = new Monsters("Zombie", 200, 1, 50);
            Monsters zombie = new Monsters("Zombie", 200, 1, 50);
            zombie.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            skeleton.addMonsterInventory(currentItem.usingWeapon(2));
            Monsters vampire = new Monsters("Vampire", 600, 3, 150);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            TownPeople townPeople = new TownPeople("Town People", false);
            TownPeople healer = new TownPeople("Healer",300, true);
            Map.getRoom(2,1).settingMonsters(dwarf);
            Map.getRoom(2,1).settingMonsters(goblin);
            Map.getRoom(2,1).settingMonsters(elf);
            Map.getRoom(2,1).settingTownsPeople(townPeople);
            Map.getRoom(1,0).settingMonsters(skeleton1);
            Map.getRoom(1,0).settingMonsters(skeleton);
            Map.getRoom(1,0).settingMonsters(zombie1);
            Map.getRoom(1,0).settingTownsPeople(townPeople);
            Map.getRoom(2,2).settingMonsters(dwarf1);
            Map.getRoom(2,2).settingMonsters(vampire);
            Map.getRoom(2,2).settingMonsters(zombie);
            Map.getRoom(2,2).settingTownsPeople(healer);

        } else if (a == 15) {
            System.out.println("Welcome to level 8");

            Rooms[][] dungeon = new Rooms[2][2];


            dungeon[0][0] = new Rooms("Room 1", "Level 8 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 8 room 2", new Coordinates(1, 0),false);
            dungeon[1][1] = new Rooms("Room 3", "Level 8 room 3" , new Coordinates(1, 1),false);
            dungeon[0][1] = new Rooms("Room 4(stair room)", "Level 8 stair room", new Coordinates(0, 1),true);


            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters vampire = new Monsters("Vampire", 600, 3, 150);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,2,3));
            Monsters vampire1 = new Monsters("Vampire", 600, 3, 150);
            vampire1.addMonsterInventory(currentItem.usingWeapon(2,1,1));
            Monsters elf = new Monsters("Elf", 60, 0.3, 20);
            Monsters zombie = new Monsters("Zombie", 200, 1, 50);
            zombie.addMonsterInventory(currentItem.usingWeapon(2));
            Monsters goblin1 = new Monsters("Goblin", 170, 0.6, 60);
            Monsters goblin = new Monsters("Goblin", 170, 0.6, 60);
            Monsters dwarf = new Monsters("Dwarf", 300, 1.2, 40);
            Monsters boss = new Monsters("Trickster Sorcerer", 700, 2, 160);
            boss.addMonsterInventory(currentItem.usingWeapon(3));
            TownPeople townPeople = new TownPeople("Town People", false);
            TownPeople healer = new TownPeople("Healer",400, true);
            Map.getRoom(1,0).settingMonsters(elf);
            Map.getRoom(1,0).settingMonsters(dwarf);
            Map.getRoom(1,0).settingMonsters(vampire1);
            Map.getRoom(1,0).settingTownsPeople(townPeople);
            Map.getRoom(1,1).settingMonsters(vampire);
            Map.getRoom(1,1).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(boss);
            Map.getRoom(1,1).settingTownsPeople(healer);
            Map.getRoom(0,0).settingMonsters(goblin1);




        } else if (a == 17) {
            System.out.println("Welcome to level 9");

            Rooms[][] dungeon = new Rooms[2][2];


            dungeon[0][0] = new Rooms("Room 1", "Level 9 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 9 room 2", new Coordinates(1, 0),false);
            dungeon[1][1] = new Rooms("Room 3", "Level 9 room 3" , new Coordinates(1, 1),false);
            dungeon[0][1] = new Rooms("Room 4(stair room)", "Level 9 stair room", new Coordinates(0, 1),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters vampire = new Monsters("Vampire", 600, 3, 150);
            vampire.addMonsterInventory(currentItem.usingWeapon(2));
            Monsters vampire1 = new Monsters("Vampire", 600, 3, 150);
            vampire1.addMonsterInventory(currentItem.usingWeapon(2,3,1));
            Monsters elf = new Monsters("Elf", 60, 0.3, 20);
            Monsters zombie = new Monsters("Zombie", 200, 1, 50);
            Monsters goblin1 = new Monsters("Goblin", 170, 0.6, 60);
            Monsters goblin = new Monsters("Goblin", 170, 0.6, 60);
            Monsters dwarf = new Monsters("Dwarf", 300, 1.2, 40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(1,3,2));
            TownPeople townPeople = new TownPeople("Town People", false);
            TownPeople healer = new TownPeople("Healer",400, true);
            Map.getRoom(1,0).settingMonsters(goblin1);
            Map.getRoom(1,0).settingMonsters(dwarf);
            Map.getRoom(1,0).settingMonsters(vampire1);
            Map.getRoom(1,0).settingTownsPeople(townPeople);
            Map.getRoom(1,1).settingMonsters(vampire);
            Map.getRoom(1,1).settingMonsters(goblin);
            Map.getRoom(1,1).settingMonsters(zombie);
            Map.getRoom(1,1).settingTownsPeople(townPeople);

        } else if (a == 19) {
            System.out.println("Welcome to level 10");
            Rooms[][] dungeon = new Rooms[4][4];

            dungeon[0][0] = new Rooms("Room 1", "Level 10 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 10 room 2", new Coordinates(1, 0),false);
            dungeon[2][0] = new Rooms("Room 3", "Level 10 room 3", new Coordinates(2, 0),false);
            dungeon[3][0] = new Rooms("Room 4", "Level 10 room 4", new Coordinates(3, 0),false);
            dungeon[3][1] = new Rooms("Room 5", "Level 10 room 5 ", new Coordinates(3, 1),false);
            dungeon[3][2] = new Rooms("Room 6", "Level 10 room 6", new Coordinates(3, 2),false);
            dungeon[3][3] = new Rooms("Room 7", "Level 10 room 7", new Coordinates(3, 3),false);
            dungeon[2][3] = new Rooms("Room 8", "Level 10 room 8", new Coordinates(2, 3),false);
            dungeon[1][3] = new Rooms("Room 9", "Level 10 room 9", new Coordinates(1, 3),false);
            dungeon[1][2] = new Rooms("Room 10(stair room)", "Level 10 stair room", new Coordinates(1, 2),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 300, 1, 40);
            Monsters dwarf1 = new Monsters("Dwarf", 300, 1, 40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            Monsters dwarf2 = new Monsters("Dwarf", 300, 1, 40);
            dwarf2.addMonsterInventory(currentItem.usingWeapon(1,3,3));
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            skeleton.addMonsterInventory(currentItem.usingArmor(1));
            Monsters skeleton1 = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            zombie.addMonsterInventory(currentItem.usingWeapon(2));
            Monsters zombie1 = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            vampire.addMonsterInventory(currentItem.usingWeapon(2));
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People",400, false);
            Map.getRoom(1,0).settingMonsters(dwarf);
            Map.getRoom(1,0).settingMonsters(elf);
            Map.getRoom(1,0).settingMonsters(zombie);
            Map.getRoom(1,0).settingTownsPeople(townPeople);
            Map.getRoom(3,0).settingMonsters(skeleton);
            Map.getRoom(3,0).settingMonsters(vampire);
            Map.getRoom(3,0).settingMonsters(goblin);
            Map.getRoom(3,3).settingTownsPeople(healer);
            Map.getRoom(3,3).settingMonsters(dwarf1);
            Map.getRoom(3,3).settingMonsters(skeleton1);
            Map.getRoom(3,3).settingMonsters(zombie1);
            Map.getRoom(3,3).settingTownsPeople(townPeople);
            Map.getRoom(1,0).settingMonsters(dwarf2);
        } else if (a == 21) {
            System.out.println("Welcome to level 11");
            Rooms[][] dungeon = new Rooms[3][3];

            dungeon[0][0] = new Rooms("Room 1", "Level 11 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 11 room 2", new Coordinates(1, 0),false);
            dungeon[2][0] = new Rooms("Room 3", "Level 11 room 3", new Coordinates(2, 0),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 11 room 4 ", new Coordinates(2, 1),false);
            dungeon[1][1] = new Rooms("Room 5", "Level 11 room 5" , new Coordinates(1, 1),false);
            dungeon[1][2] = new Rooms("Room 6", "Level 11 room 6", new Coordinates(1, 2),false);
            dungeon[0][2] = new Rooms("Room 7(stair room)", "Level 11 stair room", new Coordinates(0, 2),true);


            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 300, 1, 40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(1,1,1));
            Monsters dwarf1 = new Monsters("Dwarf", 300, 1, 40);
            dwarf1.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters goblin = new Monsters("Goblin", 120, 0.4, 60);
            Monsters elf = new Monsters("Elf", 30, 0.1, 10);
            Monsters elf1 = new Monsters("Elf", 30, 0.1, 10);
            Monsters skeleton = new Monsters("Skeleton", 80, 0.2, 23);
            skeleton.addMonsterInventory(currentItem.usingWeapon(1,1,1));
            Monsters skeleton1 = new Monsters("Skeleton", 80, 0.2, 23);
            Monsters zombie = new Monsters("Zombie", 150, 0.6, 30);
            zombie.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            Monsters zombie1 = new Monsters("Zombie", 150, 0.6, 30);
            Monsters vampire = new Monsters("Vampire", 400, 1.5, 100);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,3,3));
            TownPeople healer = new TownPeople("Healer", true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(2,0).settingMonsters(dwarf);
            Map.getRoom(2,0).settingMonsters(elf);
            Map.getRoom(2,0).settingMonsters(zombie);
            Map.getRoom(2,0).settingTownsPeople(townPeople);
            Map.getRoom(2,1).settingMonsters(skeleton);
            Map.getRoom(2,1).settingMonsters(vampire);
            Map.getRoom(2,1).settingMonsters(goblin);
            Map.getRoom(2,1).settingTownsPeople(healer);
            Map.getRoom(1,1).settingMonsters(dwarf1);
            Map.getRoom(1,1).settingMonsters(skeleton1);
            Map.getRoom(1,1).settingMonsters(zombie1);
            Map.getRoom(1,1).settingTownsPeople(townPeople);
            Map.getRoom(1,0).settingMonsters(elf1);
        } else if (a == 23) {
            System.out.println("Welcome to level 12");

            Rooms[][] dungeon = new Rooms[5][5];

            dungeon[0][1] = new Rooms("Room 1","Level 12 Room 1",new Coordinates(0,1),false);
            dungeon[1][1] = new Rooms("Room 3","Level 12 room 3",new Coordinates(1,1),false);
            dungeon[1][0] = new Rooms("Room 2","Level 12 room 2",new Coordinates(1,0),false);
            dungeon[1][2] = new Rooms("Room 4","Level 12 room 4",new Coordinates(1,2),false);
            dungeon[2][2] = new Rooms("Room 5","Level 12 room 5",new Coordinates(2,2),false);
            dungeon[2][3] = new Rooms("Room 6","Level 12 room 6",new Coordinates(2,3),false);
            dungeon[3][3] = new Rooms("Room 7","Level 12 room 7",new Coordinates(3,3),false);
            dungeon[4][3] = new Rooms("Room 10","Level 12 room 10",new Coordinates(4,3),false);
            dungeon[4][2] = new Rooms("Room 9","Level 12 room 9",new Coordinates(4,2),false);
            dungeon[4][1] = new Rooms("Room 8(stair room)","Level 12 stair room",new Coordinates(4,1),true);


            Map.map = dungeon;
            Map.currentRoom = dungeon[0][1];

            Monsters dwarf = new Monsters("Dwarf",300,1,40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(2,1,1));
            Monsters dwarf1 = new Monsters("Dwarf",300,1,40);
            dwarf.addMonsterInventory(currentItem.usingWeapon(2,2,1));
            Monsters goblin = new Monsters("Goblin",120,0.4,60);
            Monsters elf =new Monsters("Elf",30,0.1,10);
            Monsters skeleton =new Monsters("Skeletons",80,0.2,23);
            skeleton.addMonsterInventory(currentItem.usingArmor(1));
            Monsters zombie =new Monsters("Zombie",150,0.6,30);
            Monsters vampire =new Monsters("Vampire",700,2.5,150);
            Monsters vampire1 =new Monsters("Vampire",700,2.5,150);
            vampire.addMonsterInventory(currentItem.usingArmor(2));
            TownPeople healer= new TownPeople("Healer",300,true);
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
        } else if (a == 25) {
            System.out.println("Welcome to level 13");
            Rooms[][] dungeon = new Rooms[3][4];

            dungeon[0][0] = new Rooms("Room 1", "Level 13 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 13 room 2", new Coordinates(1, 0),false);
            dungeon[2][0] = new Rooms("Room 3", "Level 13 room 3", new Coordinates(2, 0),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 13 room 4", new Coordinates(2, 1),false);
            dungeon[2][2] = new Rooms("Room 5", "Level 13 room 5", new Coordinates(2, 2),false);
            dungeon[1][2] = new Rooms("Room 6", "Level 13 room 6", new Coordinates(1, 2),false);
            dungeon[0][2] = new Rooms("Room 7(stair room)", "Level 13 stair room", new Coordinates(2, 3),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 400, 1.5, 70);
            dwarf.addMonsterInventory(currentItem.usingWeapon(1,1,1));
            Monsters dwarf1 = new Monsters("Dwarf", 400, 1.5, 70);
            Monsters goblin = new Monsters("Goblin", 200, 0.9, 50);
            Monsters elf = new Monsters("Elf", 125, 0.6, 40);
            Monsters skeleton = new Monsters("Skeleton", 180, 0.6, 50);
            skeleton.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters zombie = new Monsters("Zombie", 350, 1.2, 60);
            zombie.addMonsterInventory(currentItem.usingArmor(2));
            Monsters vampire = new Monsters("Vampire", 800, 2.5, 200);
            Monsters vampire1 = new Monsters("Vampire", 800, 2.5, 200);
            TownPeople healer = new TownPeople("Healer",500, true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(2,0).settingMonsters(zombie);
            Map.getRoom(2,0).settingMonsters(skeleton);
            Map.getRoom(2,0).settingMonsters(dwarf);
            Map.getRoom(2,0).settingTownsPeople(townPeople);
            Map.getRoom(2,2).settingMonsters(dwarf1);
            Map.getRoom(2,2).settingMonsters(elf);
            Map.getRoom(2,2).settingMonsters(vampire);
            Map.getRoom(2,2).settingTownsPeople(healer);
            Map.getRoom(1,2).settingMonsters(goblin);
            Map.getRoom(1,0).settingMonsters(vampire1);
        } else if (a == 27) {
            System.out.println("Welcome to level 14");
            Rooms[][] dungeon = new Rooms[3][4];

            dungeon[0][0] = new Rooms("Room 1", "Level 14 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 14 room 2", new Coordinates(1, 0),false);
            dungeon[2][0] = new Rooms("Room 3", "Level 14 room 3", new Coordinates(2, 0),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 14 room 4", new Coordinates(2, 1),false);
            dungeon[2][2] = new Rooms("Room 5", "Level 14 room 5", new Coordinates(2, 2),false);
            dungeon[1][2] = new Rooms("Room 6", "Level 14 room 6", new Coordinates(1, 2),false);
            dungeon[0][2] = new Rooms("Room 7(stair room)", "Level 14 stair room", new Coordinates(2, 3),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 400, 1.5, 70);
            dwarf.addMonsterInventory(currentItem.usingArmor(2));
            Monsters dwarf1 = new Monsters("Dwarf", 400, 1.5, 70);
            Monsters goblin = new Monsters("Goblin", 200, 0.9, 50);
            Monsters elf = new Monsters("Elf", 125, 0.6, 40);
            elf.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters skeleton = new Monsters("Skeleton", 180, 0.6, 50);
            Monsters zombie = new Monsters("Zombie", 350, 1.2, 60);
            zombie.addMonsterInventory(currentItem.usingWeapon(2,1,3));
            Monsters vampire = new Monsters("Vampire", 800, 2.5, 200);
            vampire.addMonsterInventory(currentItem.usingWeapon(2,3,3));
            Monsters vampire1 = new Monsters("Vampire", 800, 2.5, 200);
            vampire1.addMonsterInventory(currentItem.usingWeapon(3));
            TownPeople healer = new TownPeople("Healer",500, true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(1,0).settingMonsters(zombie);
            Map.getRoom(1,0).settingMonsters(dwarf);
            Map.getRoom(1,0).settingMonsters(goblin);
            Map.getRoom(1,0).settingTownsPeople(townPeople);
            Map.getRoom(2,2).settingMonsters(vampire);
            Map.getRoom(2,2).settingMonsters(elf);
            Map.getRoom(2,2).settingMonsters(skeleton);
            Map.getRoom(2,2).settingTownsPeople(townPeople);
            Map.getRoom(1,2).settingMonsters(dwarf1);
            Map.getRoom(2,0).settingMonsters(vampire1);

        } else if (a == 29) {
            System.out.println("Welcome to level 15");
            Rooms[][] dungeon = new Rooms[5][4];

            dungeon[0][0] = new Rooms("Room 1", "Level 15 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 15 room 2", new Coordinates(1, 0),false);
            dungeon[2][0] = new Rooms("Room 3", "Level 15 room 3", new Coordinates(2, 0),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 15 room 4", new Coordinates(2, 1),false);
            dungeon[2][2] = new Rooms("Room 5", "Level 15 room 5", new Coordinates(2, 2),false);
            dungeon[3][2] = new Rooms("Room 6", "Level 15 room 6", new Coordinates(3, 2),false);
            dungeon[4][2] = new Rooms("Room 7", "Level 15 room 7", new Coordinates(4, 2),false);
            dungeon[4][1] = new Rooms("Room 8", "Level 15 room 8", new Coordinates(4, 1),false);
            dungeon[4][0] = new Rooms("Room 9(stair room)", "Level 15 stair room", new Coordinates(4, 0),true);

            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters dwarf = new Monsters("Dwarf", 400, 1.5, 70);
            dwarf.addMonsterInventory(currentItem.usingWeapon(2));
            Monsters dwarf1 = new Monsters("Dwarf", 400, 1.5, 70);
            Monsters goblin = new Monsters("Goblin", 200, 0.9, 50);
            goblin.addMonsterInventory(currentItem.usingWeapon(1,2,2));
            Monsters goblin1 = new Monsters("Goblin", 200, 0.9, 50);
            Monsters elf = new Monsters("Elf", 125, 0.6, 40);
            elf.addMonsterInventory(currentItem.usingWeapon(1));
            Monsters elf1 = new Monsters("Elf", 125, 0.6, 40);
            Monsters skeleton = new Monsters("Skeleton", 180, 0.6, 50);
            skeleton.addMonsterInventory(currentItem.usingArmor(2));
            Monsters zombie = new Monsters("Zombie", 350, 1.2, 60);
            Monsters zombie1 = new Monsters("Zombie", 350, 1.2, 60);
            Monsters vampire = new Monsters("Vampire", 800, 2.5, 200);
            vampire.addMonsterInventory(currentItem.usingArmor(3));
            Monsters vampire1 = new Monsters("Vampire", 800, 2.5, 200);
            vampire1.addMonsterInventory(currentItem.usingWeapon(2,2,2));
            TownPeople healer = new TownPeople("Healer",500, true);
            TownPeople townPeople = new TownPeople("Town People", false);
            Map.getRoom(2,0).settingMonsters(dwarf);
            Map.getRoom(2,0).settingMonsters(elf);
            Map.getRoom(2,0).settingMonsters(zombie);
            Map.getRoom(2,0).settingTownsPeople(townPeople);
            Map.getRoom(2,2).settingMonsters(vampire);
            Map.getRoom(2,2).settingMonsters(zombie1);
            Map.getRoom(2,2).settingMonsters(vampire1);
            Map.getRoom(2,2).settingTownsPeople(healer);
            Map.getRoom(4,2).settingMonsters(elf1);
            Map.getRoom(4,2).settingMonsters(dwarf1);
            Map.getRoom(4,2).settingMonsters(skeleton);
            Map.getRoom(4,2).settingTownsPeople(townPeople);
            Map.getRoom(2,1).settingMonsters(goblin);
            Map.getRoom(4,1).settingMonsters(goblin1);


        } else if (a == 31) {
            System.out.println("Welcome to level 16. You are in the end.");
            Rooms[][] dungeon = new Rooms[3][4];

            dungeon[0][0] = new Rooms("Room 1", "Level 16 room 1", new Coordinates(0, 0),false);
            dungeon[1][0] = new Rooms("Room 2", "Level 16 room 2", new Coordinates(1, 0),false);
            dungeon[2][0] = new Rooms("Room 3", "Level 16 room 3", new Coordinates(2, 0),false);
            dungeon[2][1] = new Rooms("Room 4", "Level 16 room 4", new Coordinates(2, 1),false);
            dungeon[2][2] = new Rooms("Room 5", "Level 16 room 5", new Coordinates(2, 2),false);
            dungeon[1][2] = new Rooms("Room 6(Boss Room)", "Level 16 room 6", new Coordinates(1, 2),false);
            dungeon[0][2] = new Rooms("Room 7(stair room)", "Level 16 stair room", new Coordinates(2, 3),true);
            Map.map = dungeon;
            Map.currentRoom = dungeon[0][0];
            Monsters boss = new Monsters("Undead Knight(a.k.a. The Boss)", 1800, 6, 300);
            TownPeople healer = new TownPeople("Healer",2500, true);
            Map.getRoom(1,2).settingMonsters(boss);
            Map.getRoom(1,2).settingTownsPeople(healer);
            if(boss.getHitPoint()<=0){
                System.out.println("Congratulations, you beat final level boss!");
            }
        }
    }
}
