package SE116Project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements ItemStats{
    public static String playerInput;
    public static Scanner scanner;
    public static Hero hero;
    public static ArrayList<String> inventory = new ArrayList<>();
    public static int a=0;


    public static void command(Hero hero) {
        Rooms lastRoom = Map.currentRoom;
        int currentRoomX = Map.currentRoom.getRoomCoordinates().getX();
        int currentRoomY = Map.currentRoom.getRoomCoordinates().getY();

        switch (playerInput) {
            case "info":
                showInfo();
                break;
            case "status":
                status(hero);
                break;
            case "inventory":
                System.out.println(inventory);
                break;
            case "credits":
                credits();
                break;
            case "east":
                Map.moveDirection(currentRoomX, currentRoomY+1);
                showRoom(Map.currentRoom, lastRoom, "east");
                System.out.println("Choose your next room");
                showRoad(Map.currentRoom);
                break;
            case "west":
                Map.moveDirection(currentRoomX, currentRoomY-1);
                showRoom(Map.currentRoom, lastRoom, "west");
                System.out.println("Choose your next room");
                showRoad(Map.currentRoom);
                break;
            case "north":
                Map.moveDirection(currentRoomX-1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "north");
                System.out.println("Choose your next room");
                showRoad(Map.currentRoom);
                break;
            case "south":
                Map.moveDirection(currentRoomX+1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "south");
                System.out.println("Choose your next room");
                showRoad(Map.currentRoom);
                break;
            case "road":
                showRoad(Map.currentRoom);
                break;
            case "quit":
                System.out.println("You left the game, see you soon!!");

            /*case "inventory":
                showInventory();
                break;*/

            default:
                System.out.println("Invalid input, Please check info");
                break;
        }

    }
    public static void showRoom(Rooms currentRoom, Rooms lastRoom, String direction) {

        if(currentRoom != lastRoom) {

                System.out.println("You head off to  " + currentRoom.getRoomName() + "  in the " + direction);
                System.out.println(currentRoom.getDefinition());
                if(currentRoom.isStairRoom()){
                    levels(currentRoom);
                    startGame();
                }

                if(currentRoom.getTownPeoples()!= null && !currentRoom.getTownPeoples().isEmpty()) {
                    System.out.println("There are "+ currentRoom.getTownPeoples().size()+" Townspeople in this room.");



                        if (currentRoom.getTownPeoples().get(0).isHealer()) {

                            System.out.println("One of the townspeople is healer in this room");


                        } else {
                            System.out.println("There is no healer in this room");
                        }

                }


                if(currentRoom.getMonsters() != null && !currentRoom.getMonsters().isEmpty()) {
                    System.out.println();
                    System.out.println("There are "+ currentRoom.getMonsters().size()+" monsters in this room.");
                    for (int i=0;i<currentRoom.getMonsters().size();i++){
                        printAttacks(currentRoom);
                    }
                   // printAttacks(currentRoom);

                }
            }
        else {
            System.out.println("You can't move to " + direction + " from this room");
        }
    }
    public static void showRoad(Rooms currentRoom) {
        int currentRoomX = Map.currentRoom.getRoomCoordinates().getX();
        int currentRoomY = Map.currentRoom.getRoomCoordinates().getY();

        /*
         * south
         */
        if(Map.checkDirection(currentRoomX+1, currentRoomY)) {

            System.out.println("In south " + Map.map[currentRoomX+1][currentRoomY].getRoomName());
        }
        /*
         * north
         */
        if(Map.checkDirection(currentRoomX-1, currentRoomY)) {

            System.out.println("In north "+Map.map[currentRoomX-1][currentRoomY].getRoomName());
        }
        /*
         * east
         */
        if(Map.checkDirection(currentRoomX, currentRoomY+1)) {

            System.out.println("In east "+Map.map[currentRoomX][currentRoomY+1].getRoomName());
        }
        /*
         * west
         */
        if(Map.checkDirection(currentRoomX, currentRoomY-1)) {

            System.out.println("In west "+Map.map[currentRoomX][currentRoomY-1].getRoomName());
        }

    }
    public static void launchAttacks(Characters attacker, Characters defender) {
        if (attacker.isDead()|| defender.isDead())
            System.out.println();

        else {
            System.out.print(attacker.getName() + " attacks! ");
            int damage = attacker.attack(defender);
            if (damage == -1) {
                System.out.println("... but " + defender.getName() + " avoids the attack ! ");
            } else {

                System.out.println("... and reduce " + defender.getName() + "'s HP by " + damage);
                defender.printStats();
            }
            System.out.print(defender.getName() + " attacks! ");
            int damage1 = defender.attack(attacker);
            if (damage1 == -1) {
                System.out.println("... but " + attacker.getName() + " avoids the attack ! ");
            } else {

                System.out.println("... and reduce " + attacker.getName() + "'s HP by " + damage1);
                attacker.printStats();
            }
        }
    }

    public static void printAttacks(Rooms currentRoom) {

        int i = -1;
        i++;

        Monsters monster = currentRoom.getMonsters().get(i);
        System.out.println("There is a " + monster.getName() + " ! Look out!");

        // System.out.println("There is a " + monster.getName() + " ! Look out!");
        boolean looping = true;
        int input=0;
        Scanner cl = new Scanner(System.in);
        boolean escape = false;

       /*Monsters monster = currentRoom.getMonsters().get(0);
        System.out.println("There is a "+monster.getName()+" ! Look out!");*/
        do {
            System.out.println("What are you going to do : (1) Attack" + monster.getName() + " (2) Run ");
            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.next();
            }

            if (input == 1) {
                looping = false;
            } else if (input == 2) {
                System.out.println("Lucky you, you managed to reach the doors before the monster see you");
                System.out.println();
                looping = false;
                escape =true;


            } else {
                System.out.println("Please choose one option! ");
            }

        } while (looping);

        if (!escape) {

                System.out.println("Start attacking " + monster.getName());


            while (!monster.isDead() && !hero.isDead()) {
                //Problem around here

                launchAttacks(hero, monster);
                if (monster.isDead()) {
                    currentRoom.deleteMonsters(monster);
                    System.out.println(monster.getName() + " died...");
                    System.out.println("You picked up all inventory of " + monster.getName() + "  - Check your inventory now!");
                    if(currentRoom.getMonsters().size()>0){
                            printAttacks(currentRoom);
                    }
                } else if (hero.isDead()) {// ölme olayı burada oluyor
                    System.out.println("You died.... Game over :( ");
                    System.exit(0);
                    break;
                }
            }
            launchAttacks(monster, hero);

            if(currentRoom.getMonsters().size()<=0){
                System.out.println("All monster died in "+ currentRoom.getRoomName());
                if(currentRoom.getMonsters().isEmpty()&&currentRoom.getTownPeoples().size()>0) {
                    int savedTownsPeopleCount =0;
                    savedTownsPeopleCount+=currentRoom.getTownPeoples().size();

                    System.out.println("You saved " + savedTownsPeopleCount + " townspeople");
                }
                for(int i1=0;i1<currentRoom.getTownPeoples().size();i1++){
                    if(currentRoom.getTownPeoples().get(i1).isHealer()){
                        System.out.println("There is a healer in this room. Would you like to heal "+currentRoom.getTownPeoples().get(0).getHeal()+ "HP?(1)yes(2)no");
                        int input2 = scanner.nextInt();

                        if(input2==1){
                            hero.setHitPoint(hero.getHitPoint()+currentRoom.getTownPeoples().get(i1).getHeal());
                        }
                        else{
                            System.out.println("No healing used!");
                        }

                    }
               }
            }
        } else {
            System.out.println("You succeeded to escape from the monster but it seems you forgot to save Towns People!");
        }
    }








    public static void showInfo() {

        System.out.println("Type east, west, north or south to move");
        System.out.println("Type 'status' to display hero's current status");
        System.out.println("Type 'inventory' to display inventory");
        System.out.println("Type 'road' to display available roads");
        System.out.println("Type 'credits' to display our lovely team!! ");
        System.out.println("Type 'quit' to leave the game");

    }

    public static void levels(Rooms currentRoom){

        int levelChoice;
        if(currentRoom.isStairRoom()){
            if(a==1){
                System.out.println("You want to go upper (1) level?");
                levelChoice=scanner.nextInt();
                scanner.nextLine();
                if(levelChoice==1){
                    a++;
                    startGame();
                }
            }
            else if(a==16){
                System.out.println("You want to go lower (2) level?");
                levelChoice=scanner.nextInt();
                scanner.nextLine();
                if(levelChoice==2){
                    a--;
                    startGame();
                }
            }
            else {

                System.out.println("You want to go upper (1) level or lower (2) ?");
                levelChoice = scanner.nextInt();
                scanner.nextLine();
                if (levelChoice == 1) {
                    a++;
                    startGame();
                } else if (levelChoice == 2) {
                    a=a-3;
                    startGame();
                }
            }
        }
    }

    public static void status(Hero hero) {
        Items items =new Items();

        System.out.println("NAME : " + hero.getName());
        System.out.println("HP : " + hero.getHitPoint());
        System.out.println("CURRENT CLOTH: "+items.usingArmor(1));
        System.out.println("CURRENT WEAPON: "+items.usingWeapon(1,1,1));
    }

    public static void main(String[] args) {
       // System.out.println("random "+(int)(Math.random()*10+1));

        //ArrayList<Items> items = new ArrayList<Items>();
        //ArrayList<Weapons> weapons = new ArrayList<Weapons>();
        //ArrayList<Clothes> clothes = new ArrayList<Clothes>();

        System.out.println("********************** WELCOME TO HERO OF THE DUNGEON **********************");
        System.out.println("**                                                                        **");
        System.out.println("**       SE-116 Project Group 7                                           **");
        System.out.println("**                                                                        **");
        System.out.println("**                                ® All Right Reserved.                   **");
        System.out.println("**                                                                        **");
        System.out.println("****************************************************************************");

        System.out.println("New Game = 1, Credits = 2");
        boolean loop = true;
        int input = 0;
        scanner=new Scanner(System.in);


        while (loop) {
            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.next();

            }

            if (input == 1) {
               CurrentItem currentItem= new CurrentItem();
                hero = new Hero(playerInput);
                System.out.println("Enter your name: ");
                String heroName = scanner.nextLine();
                hero.setName(heroName);
        /*System.out.println("Enter your gender:");
        String genderChosen= scanner.nextLine();

        System.out.println("Your gender is: "+genderChosen);*/


                System.out.println("Ahh... I see, " + hero.getName() + " the brave hero!");
                System.out.println("As a welcoming gift here is your cloth and weapon, check inventory");
                inventory.add(0,"light clothing");
                inventory.add(1,"dagger");



                System.out.println("You are in front of the dungeon gate");
                System.out.println("Type 'info' for further info");

                playerInput = scanner.nextLine();
                if(!hero.isDead()){
                    startGame();
                }



                    loop = false;


            } else if (input == 2) {
                credits();
                System.out.println();
                //loop = false;
            } else {
                System.out.println("Please enter a valid option ");
            }
        }
        scanner = new Scanner(System.in);

    }



    public static void startGame() {

        a++;

        /*CurrentItem currentItem= new CurrentItem();
        hero = new Hero(playerInput);
        System.out.println("Enter your name: ");
        String heroName = scanner.nextLine();
        hero.setName(heroName);
        /*System.out.println("Enter your gender:");
        String genderChosen= scanner.nextLine();

        System.out.println("Your gender is: "+genderChosen);*/


       /* System.out.println("Ahh... I see, " + hero.getName() + " the brave hero!");
        System.out.println("As a welcoming gift here is your cloth and weapon, check inventory");
        inventory.add(0,"light clothing");
        inventory.add(1,"dagger");



        System.out.println("You are in front of the dungeon gate");
        System.out.println("Type 'info' for further info");

        playerInput = scanner.nextLine();*/


        Level.Levels(a);
       // levels(Map.currentRoom);



           /* int a =1;
            Level.Levels(a);
            int levelChoice;

            if(Map.currentRoom.isStairRoom()){
                if(a==1){
                    System.out.println("You want to go upper(1) level?");
                    levelChoice=scanner.nextInt();
                    scanner.nextLine();
                    if(levelChoice==1){
                        a++;
                        //Level.Levels(a);
                    }
                }
                else {

                    System.out.println("You want to go upper(1)level or lower(2)?");
                    levelChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (levelChoice == 1) {
                        a++;
                       // Level.Levels(a);
                    } else if (levelChoice == 2) {
                        a--;
                    }
                }
            }*/


        while (!playerInput.equals("quit")){
            command(hero);
            System.out.print("-->");
            playerInput = scanner.nextLine();
            }

        }
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


    }
   /* public static Rooms[][] directions(Hero hero) {
        Rooms[][] dungeon = new Rooms[5][5];
        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon.length; j++) {
                dungeon[i][j] = Rooms.newRoomInstance();

            }
        }
        hero.setCurrRoom(dungeon[14][14]);
        return dungeon;
    }*/

        public static void credits () {
            System.out.println("Egemen Akgüner");
            System.out.println("Uzay Kayra Çetinkaya");
            System.out.println("Busegül Özkaya");
        }
    }
