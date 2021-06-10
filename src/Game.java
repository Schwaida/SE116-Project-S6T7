import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static String playerInput;
    public static Scanner scanner;
    public static Hero hero;
    public static ArrayList<String> inventory = new ArrayList<>();
    public static Clothes clothes;
    public static Weapons weapons;

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
                break;
            case "west":
                Map.moveDirection(currentRoomX, currentRoomY-1);
                showRoom(Map.currentRoom, lastRoom, "west");
                break;
            case "north":
                Map.moveDirection(currentRoomX-1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "north");
                break;
            case "south":
                Map.moveDirection(currentRoomX+1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "south");
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

        System.out.print(attacker.getName() + " attacks! ");
        int damage = attacker.attack(defender);
        if(damage == -1) {
            System.out.println("... but " + defender.getName() + " avoids the attack ! ");
        }
        else {
            System.out.println("... and reduce "+ defender.getName() + "'s HP by " + damage);
            defender.printStats();
        }
        }

    public static void printAttacks(Rooms currentRoom) {

        Monsters monster = currentRoom.getMonsters().get(0);
        System.out.println("There is a "+monster.getName()+" ! Look out!");
        /*
         * Choose attacking or escape
         */
        boolean loop = true;
        int input;
        Scanner cl = new Scanner(System.in);
        boolean escape = false;

        /*
         * get first monster!
         */


        do {
            System.out.println("You want : (1) Attack"+monster.getName()+" (2) Try to Escape ? ");
            input = cl.nextInt();
            if(input == 1) {
                loop = false;
            }
            else if(input == 2) {
                System.out.println("You escaped from the monster before it sees you");
                escape = true;
                break;

            }
            else {
                System.out.println("Please choose a valid option! ");
            }

        } while(loop);

        if(!escape) {
            System.out.println("Start attacking " + monster.getName());

            while(!monster.isDead() && !hero.isDead()) { //Problem around here
                launchAttacks(hero, monster);
                if(monster.isDead()) {
                    currentRoom.deleteMonsters(monster);
                    System.out.println("You picked up all inventory of " + monster.getName() + "  - Check your inventory now!");
                    break;
                    }else if (hero.isDead()){
                    System.out.println("You died.... Game over :( ");
                }
                }
                launchAttacks(monster, hero);
        }
        else {
            System.out.println("You're lucky ! You succeeded to escape from Monster!");
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
        System.out.println("NAME : " + hero.getName());
        System.out.println("HP : " + hero.getHitPoint());
        System.out.println("CURRENT CLOTH: "+hero.getClothes());
        System.out.println("CURRENT WEAPON: "+hero.getWeapons());
    }

    public static void main(String[] args) {
       // System.out.println("random "+(int)(Math.random()*10+1));

        //ArrayList<Items> items = new ArrayList<Items>();
        //ArrayList<Weapons> weapons = new ArrayList<Weapons>();
        //ArrayList<Clothes> clothes = new ArrayList<Clothes>();

        System.out.println("********************** WELCOME TO THE IMPOSSIBLE DUNGEON **********************");
        System.out.println("    _                         ");
        System.out.println("  _| |_ _ ___ ___ ___ ___ ___ ");
        System.out.println(" | . | | |   | . | -_| . |   |");
        System.out.println(" |___|___|_|_|_  |___|___|_|_|");
        System.out.println("             |___|            ");
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
                startGame();
                loop = false;
            } else if (input == 2) {
                credits();
                System.out.println();
                //loop = false;
            } else {
                System.out.println("Please enter a valid number ");
            }
        }
        scanner = new Scanner(System.in);

    }



    public static void startGame() {

        hero = new Hero(playerInput);
        System.out.println("Enter your name: ");
        String heroName = scanner.nextLine();
        hero.setName(heroName);

        System.out.println("Ahh... I see, " + hero.getName() + " the brave hero!");
        System.out.println("As a welcoming gift here is your cloth and weapon, check inventory");
        clothes = new LightClothing();
        inventory.add(0,"light clothing");
        weapons = new Swords();
        inventory.add(1,"dagger");
        clothes.setClothesName("light clothing");
        weapons.setWeaponName("dagger");


        System.out.println("You are in front of the dungeon gate");
        System.out.println("Type 'info' for further info");

        playerInput = scanner.nextLine();

        directions();

        while (!playerInput.equals("quit")){
            command(hero);
            System.out.print("-->");
            playerInput = scanner.nextLine();

            }
        if (hero.isDead()){
            System.out.println("You died game over");
            return;

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

        Monsters dwarf = new Monsters("Dwarf",200,0.65,40);
        Monsters goblin = new Monsters("Goblin",250,0.9,50);
        Map.getRoom(1,1).settingMonsters(dwarf);
        Map.getRoom(2,2).settingMonsters(goblin);


    }

        private static void credits () {
            System.out.println("Egemen Akgüner");
            System.out.println("Uzay Kayra Çetinkaya");
            System.out.println("Busegül Özkaya");
        }
    }
