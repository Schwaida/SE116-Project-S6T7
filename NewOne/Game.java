package NewOne;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements ItemStats {
    public static String playerInput;
    public static Scanner scanner;
    public static Hero hero = null;
    public static Monsters monsters;
    public static CurrentItem currentItem = new CurrentItem();


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
                //System.out.println(String.valueOf(inventory));
                Characters.showHeroInventory();
                break;
            case "credits":
                credits();
                break;
            case "east":
                Map.moveDirection(currentRoomX, currentRoomY + 1);
                showRoom(Map.currentRoom, lastRoom, "east");
                showRoad(Map.currentRoom);
                break;
            case "west":
                Map.moveDirection(currentRoomX, currentRoomY - 1);
                showRoom(Map.currentRoom, lastRoom, "west");
                showRoad(Map.currentRoom);
                break;
            case "north":
                Map.moveDirection(currentRoomX - 1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "north");
                showRoad(Map.currentRoom);
                break;
            case "south":
                Map.moveDirection(currentRoomX + 1, currentRoomY);
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

        if (currentRoom != lastRoom) {

            System.out.println("You head off to  " + currentRoom.getRoomName() + "  in the " + direction);
            System.out.println(currentRoom.getDefinition());

            if (currentRoom.getTownPeoples() != null && !currentRoom.getTownPeoples().isEmpty()) {
                System.out.println("There is " + currentRoom.getTownPeoples().size() + " Townspeople in this room.");
            }


            if (currentRoom.getMonsters() != null && !currentRoom.getMonsters().isEmpty()) {

                printAttacks(currentRoom);

            }
        } else {
            System.out.println("You can't move to " + direction + " from this room");
        }
    }

    public static void showRoad(Rooms currentRoom) {
        int currentRoomX = Map.currentRoom.getRoomCoordinates().getX();
        int currentRoomY = Map.currentRoom.getRoomCoordinates().getY();

        /*
         * south
         */
        if (Map.checkDirection(currentRoomX + 1, currentRoomY)) {

            System.out.println("In south " + Map.map[currentRoomX + 1][currentRoomY].getRoomName());
        }
        /*
         * north
         */
        if (Map.checkDirection(currentRoomX - 1, currentRoomY)) {

            System.out.println("In north " + Map.map[currentRoomX - 1][currentRoomY].getRoomName());
        }
        /*
         * east
         */
        if (Map.checkDirection(currentRoomX, currentRoomY + 1)) {

            System.out.println("In east " + Map.map[currentRoomX][currentRoomY + 1].getRoomName());
        }
        /*
         * west
         */
        if (Map.checkDirection(currentRoomX, currentRoomY - 1)) {

            System.out.println("In west " + Map.map[currentRoomX][currentRoomY - 1].getRoomName());
        }

    }


    public static void attackStatus(Characters attacker, Characters defender) {

        System.out.print(attacker.getName().toUpperCase() + " comes forward first and attacks! ");
        int damage = attacker.attack(defender);
        if (damage == -1) {
            System.out.println(" But " + defender.getName().toUpperCase() + " flawlessly avoids the attack ! ");
        } else {
            System.out.println(" And reduces " + defender.getName().toUpperCase() + "'s HP by " + damage);
            defender.printStats();
        }

    }


    public static void printAttacks(Rooms currentRoom) {

        boolean looping = true;
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        boolean escape = false;

        Monsters monster = currentRoom.getMonsters().get(0);
        System.out.println("There is a " + monster.getName() + " ! Look out!");
        System.out.println("Its HP is "+monster.getHitPoint());
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
                System.out.println("Lucky you, you managed to escape from the room before the monster see you");
                System.out.println();
                looping = false;


            } else {
                System.out.println("Please choose one option! ");
            }

        } while (looping);

        if (!escape) {
            while (!monster.isDead() && !hero.isDead()) {
                attackStatus(hero, monster);


                if (monster.isDead()) {  //monster.isDead()
                    currentRoom.deleteMonsters(monster);
                    System.out.print("It dropped " + monster.getMonsterInventory().toString());
                    System.out.println(" Press 1 to pick it up, 2 to continue");
                    int a = scanner.nextInt();
                    if (a == 1) {
                        hero.getHeroInventory().add(String.valueOf(monster.getMonsterInventory()));
                        System.out.println("Check your inventory now");
                    }
                    break;

                } else if (hero.isDead()) {// ölme olayı burada oluyor
                    System.out.println("You died.... Game over :( ");
                    System.exit(0);
                    break;
                }
                attackStatus(monster,hero);
            }


        }
    }


    public static void showInfo() {

        System.out.println("Type 'east' / 'west' / 'north' / 'south' to move");
        System.out.println("Type 'status' to display hero's current status");
        System.out.println("Type 'inventory' to display inventory");
        System.out.println("Type 'road' to display available roads");
        System.out.println("Type 'credits' to display our lovely team!! ");
        System.out.println("Type 'quit' to leave the game");

    }

    public static void status(Hero hero) {
        Items items = new Items();
        WeightSystem weightSystem = new WeightSystem();

        System.out.println("NAME : " + hero.getName());
        System.out.println("HP : " + hero.getHitPoint());
        System.out.println("CURRENT CLOTH: " + currentItem.getClothName());
        System.out.println("CURRENT WEAPON: " + currentItem.getWeaponName());
        System.out.println("SAVED TOWN PEOPLE COUNTER: ");
        System.out.println("CURRENT WEIGHT: ");
    }

    public static void main(String[] args) {
        // System.out.println("random "+(int)(Math.random()*10+1));

        //ArrayList<Items> items = new ArrayList<Items>();
        //ArrayList<Weapons> weapons = new ArrayList<Weapons>();
        //ArrayList<Clothes> clothes = new ArrayList<Clothes>();

        System.out.println("********************** WELCOME TO HERO OF THE DUNGEON **********************");
        System.out.println("     *                         ");
        System.out.println("  ** * *  * **** **** **** **** ****");
        System.out.println("  *  * *  * *  * *  * **** *  * *  *");
        System.out.println("  **** **** *  * **** **** **** *  * " );
        System.out.println("                 ****            ");
        System.out.println("New Game = 1, Credits = 2");
        boolean loop = true;
        int input = 0;
        scanner = new Scanner(System.in);


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
        WeightSystem weightSystem = new WeightSystem();


        hero = new Hero(playerInput);
        System.out.println("Enter your name: ");
        String heroName = scanner.nextLine();
        hero.setName(heroName);
        /*System.out.println("Enter your gender:");
        String genderChosen= scanner.nextLine();

        System.out.println("Your gender is: "+genderChosen);*/


        Items items = new Items();
        System.out.println("Ahh... I see, " + hero.getName() + " the brave hero!");
        System.out.println("As a welcoming gift here is your cloth and weapon, check inventory");

        hero.getHeroInventory().add(0,(currentItem.usingWeapon(2,1,1)));


        currentItem.setWeaponName(currentItem.usingWeapon(2,1,1));
        weightSystem.ironDaggerTaken = true;



        hero.getHeroInventory().add(1,currentItem.usingArmor(1));
        currentItem.setClothName(currentItem.usingArmor(1));





       // currentItem.setWeaponName(currentItem.usingWeapon(1,2,3));
        //hero.getHeroInventory().add(0,currentItem.usingWeapon(1,3,2));

        System.out.println("You are in front of the dungeon gate");
        System.out.println("Type 'info' for further info");

        playerInput = scanner.nextLine();


        Rooms rooms = new Rooms();


        Level.level1();

        while (!playerInput.equals("quit")) {
            command(hero);
            System.out.print("-->");
            playerInput = scanner.nextLine();


            if (hero.isDead()) {
                System.out.println("You died :( , game over...".toUpperCase());
            }


        }

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
    /*public static void printAttacks(Rooms currentRoom) {

        System.out.println("There are monster(s) here ! Look out!");

        boolean loop = true;
        int input;
        Scanner cl = new Scanner(System.in);
        boolean escape = false;


        Monsters monster = currentRoom.getMonsters().get(0);

        do {
            System.out.println("You want : (1) Attack Monster (2) Try to Escape ? ");
            input = cl.nextInt();
            if(input == 1) {
                loop = false;
            }
            else if(input == 2) {
                loop = false;
            }
            else {
                System.out.println("Please choose one option! ");
            }

        } while(loop);

        if(!escape) {
            System.out.println("Start attacking " + monster.getName());

            while(!monster.isDead() && !hero.isDead()) {
                attackStatus(hero, monster);

                if(monster.isDead()) {
                    currentRoom.deleteMonsters(monster);
                    System.out.println("You picked up all inventory of " + monster.getName() + "  - Check your inventory now!");
                    break;
                }
                attackStatus(monster, hero);
            }
        }
        else {
            System.out.println("You're lucky ! You succeeded to escape from Monster!");
        }
    }*/
    /*public static void attackStatus(Characters attacker, Characters defender) {

        System.out.print(attacker.getName().toUpperCase() + " comes forward and attacks !!  ");
        int damage = attacker.attack(defender);
        if(damage == -1) {
            System.out.println("But " + defender.getName().toUpperCase() + " flawlessly avoids the attack ! ");
        }
        else {
            System.out.println("And reduce "+ defender.getName().toUpperCase() + "'s HP by " + damage);
            defender.printStats();
        }
    }*/

    }
