package SE116Project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements ItemStats {
    public static String playerInput;
    public static Scanner scanner;
    public static Hero hero;
    public static ArrayList<String> inventory = new ArrayList<>();


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
                showRoad(Map.currentRoom);
                break;
            case "west":
                Map.moveDirection(currentRoomX, currentRoomY-1);
                showRoom(Map.currentRoom, lastRoom, "west");
                showRoad(Map.currentRoom);
                break;
            case "north":
                Map.moveDirection(currentRoomX-1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "north");
                showRoad(Map.currentRoom);
                break;
            case "south":
                Map.moveDirection(currentRoomX+1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "south");
                System.out.println("Choose your next room to continue..");
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
                System.out.println("Command not recognized! Check info");
                break;
        }

    }
    public static void showRoom(Rooms currentRoom, Rooms lastRoom, String direction) {

        if(currentRoom != lastRoom) {

                System.out.println("You head off to  " + currentRoom.getRoomName() + "  in the " + direction);
                System.out.println(currentRoom.getDefinition());

                if(currentRoom.getTownPeoples()!= null && !currentRoom.getTownPeoples().isEmpty()) {
                    System.out.println("There is "+ currentRoom.getTownPeoples().size()+" Townspeople in this room.");
                }


                if(currentRoom.getMonsters() != null && !currentRoom.getMonsters().isEmpty()) {

                    printAttacks(currentRoom);

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
        boolean dead = false;
        int i =-1;
        i++;


            Monsters monster = currentRoom.getMonsters().get(i);
            System.out.println("There is a " + monster.getName() + " ! Look out!");
            boolean loop = true;
            int input;
            Scanner cl = new Scanner(System.in);
            boolean escape = false;



       /*Monsters monster = currentRoom.getMonsters().get(0);
        System.out.println("There is a "+monster.getName()+" ! Look out!");

         // Choose attacking or escape

        boolean loop = true;
        int input;
        Scanner cl = new Scanner(System.in);
        boolean escape = false;*/

            /*
             * get first monster!
             */


            do {
                System.out.println("You want : (1) Attack" + monster.getName() + " (2) Go another room ");
                input = cl.nextInt();
                if (input == 1) {
                    loop = false;
                } else if (input == 2) {
                    System.out.println("You left the room before the monster saw you");
                    escape = true;
                    break;

                } else {
                    System.out.println("Please choose a valid option! ");
                }

            } while (loop);

            if (!escape) {
                System.out.println("Start attacking " + monster.getName());

                while (!monster.isDead() && !hero.isDead()) { //Problem around here
                    launchAttacks(hero, monster);
                    if (monster.isDead()) {
                        currentRoom.deleteMonsters(monster);
                        System.out.println(monster.getName()+ " died...");
                        System.out.println("You picked up all inventory of " + monster.getName() + "  - Check your inventory now!");
                        break;
                    } else if (hero.isDead()) {// ölme olayı burada oluyor
                        System.out.println("You died.... Game over :( ");
                        dead = true;
                        System.exit(0);
                        break;
                    }
                }
                launchAttacks(monster, hero);
            } else {
                System.out.println("You succeeded to escape from the monster but it seems you forgot to save Town People!");
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
        System.out.println("    _                         ");
        System.out.println("  _| |_ _ ___ ___ ___ ___ ___ ");
        System.out.println(" | . | | |   | . | -_| . |   |");
        System.out.println(" |___|___|_|_|_  |___|___|_|_|");
        System.out.println("             |___|            ");
        System.out.println("New Game = 1, Credits = 2");
        boolean loop = true;
        int input = 0;
        scanner=new Scanner(System.in);
        int currentWeight=0;
        int maxWeight=30;
      /*  while(-1 < currentWeight && currentWeight <= maxWeight) {
            WeightSystem System = new WeightSystem();
            if (System.ironSmallAxeTaken) {
                currentWeight += ironSmallAxeWeight;
            }
            if (System.ironSmallAxeDropped) {
                currentWeight -= ironSmallAxeWeight;
            }
            if (System.ironAxeTaken) {
                currentWeight += ironAxeWeight;
            }
            if (System.ironAxeDropped) {
                currentWeight -= ironAxeWeight;
            }
            if (System.ironBroadAxeTaken) {
                currentWeight += ironBroadAxeWeight;
            }
            if (System.ironBroadAxeDropped) {
                currentWeight -= ironBroadAxeWeight;
            }
            if (System.bronzeSmallAxeTaken) {
                currentWeight += bronzeSmallAxeWeight;
            }
            if (System.bronzeSmallAxeDropped) {
                currentWeight -= bronzeSmallAxeWeight;
            }
            if (System.bronzeAxeTaken) {
                currentWeight += bronzeAxeWeight;
            }
            if (System.bronzeAxeDropped) {
                currentWeight -= bronzeAxeWeight;
            }
            if (System.bronzeBroadAxeTaken) {
                currentWeight += bronzeBroadAxeWeight;
            }
            if (System.bronzeBroadAxeDropped) {
                currentWeight -= bronzeBroadAxeWeight;
            }
            if (System.steelSmallAxeTaken) {
                currentWeight += steelSmallAxeWeight;
            }
            if (System.steelSmallAxeDropped) {
                currentWeight -= steelSmallAxeWeight;
            }
            if (System.steelAxeTaken) {
                currentWeight += steelAxeWeight;
            }
            if (System.steelAxeDropped) {
                currentWeight -= steelAxeWeight;
            }
            if (System.steelBroadAxeTaken) {
                currentWeight += steelBroadAxeWeight;
            }
            if (System.steelBroadAxeDropped) {
                currentWeight -= steelBroadAxeWeight;
            }

            if (System.ironDaggerTaken) {
                currentWeight += ironDaggerWeight;
            }
            if (System.ironDaggerDropped) {
                currentWeight -= ironDaggerWeight;
            }
            if (System.ironShortSwordTaken) {
                currentWeight += ironShortSwordWeight;
            }
            if (System.ironShortSwordDropped) {
                currentWeight -= ironShortSwordWeight;
            }
            if (System.ironLongSwordTaken) {
                currentWeight += ironLongSwordWeight;
            }
            if (System.ironLongSwordDropped) {
                currentWeight -= ironLongSwordWeight;
            }
            if (System.bronzeDaggerTaken) {
                currentWeight += bronzeDaggerWeight;
            }
            if (System.bronzeDaggerDropped) {
                currentWeight -= bronzeDaggerWeight;
            }
            if (System.bronzeShortSwordTaken) {
                currentWeight += bronzeShortSwordWeight;
            }
            if (System.bronzeShortSwordDropped) {
                currentWeight -= bronzeShortSwordWeight;
            }
            if (System.bronzeLongSwordTaken) {
                currentWeight += bronzeLongSwordWeight;
            }
            if (System.bronzeLongSwordDropped) {
                currentWeight -= bronzeLongSwordWeight;
            }
            if (System.steelDaggerTaken) {
                currentWeight += steelDaggerWeight;
            }
            if (System.steelDaggerDropped) {
                currentWeight -= steelDaggerWeight;
            }
            if (System.steelShortSwordTaken) {
                currentWeight += steelShortSwordWeight;
            }
            if (System.steelShortSwordDropped) {
                currentWeight -= steelShortSwordWeight;
            }
            if (System.steelLongSwordTaken) {
                currentWeight += steelLongSwordWeight;
            }
            if (System.steelLongSwordDropped) {
                currentWeight -= steelLongSwordWeight;
            }

            if (System.shortBowTaken){
                currentWeight += shortBowWeight;
            }
            if (System.shortBowDropped){
                currentWeight -= shortBowWeight;
            }
            if (System.longBowTaken){
                currentWeight += longBowWeight;
            }
            if (System.longBowDropped){
                currentWeight -= longBowWeight;
            }
            if (System.compositeBowTaken){
                currentWeight += compositeBowWeight;
            }
            if (System.compositeBowDropped){
                currentWeight -= compositeBowWeight;
            }
        }*/
        while (loop) {
            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.next();

            }

            if (input == 1) {

                    startGame();


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

        directions();

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
        Monsters goblin = new Monsters("Goblin",120,0.4,60);
        Monsters elf =new Monsters("Elf",30,0.1,10);
        Monsters skeleton =new Monsters("Skeletons",80,0.2,23);
        Monsters zombie =new Monsters("Zombie",150,0.6,30);
        Monsters vampire =new Monsters("Vampire",400,1.5,100);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
        Map.getRoom(1,1).settingMonsters(dwarf);
        Map.getRoom(2,2).settingMonsters(goblin);
        Map.getRoom(1,1).settingMonsters(elf);
        Map.getRoom(1,1).settingTownsPeople(healer);
        Map.getRoom(2,2).settingTownsPeople(townPeople);
        Map.getRoom(1,0).settingMonsters(dwarf);
        Map.getRoom(1,2).settingMonsters(zombie);
        Map.getRoom(2,3).settingMonsters(vampire);
        Map.getRoom(3,3).settingMonsters(skeleton);




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

        private static void credits () {
            System.out.println("Egemen Akgüner");
            System.out.println("Uzay Kayra Çetinkaya");
            System.out.println("Busegül Özkaya");
        }
    }
