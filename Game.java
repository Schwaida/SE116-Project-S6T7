package SE116Project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game extends Texts{
    public static int savedTownPeopleCount=0;
    public static String playerInput;
    public static Scanner scanner;
    public static Hero hero;
    public static ArrayList<String> inventory = new ArrayList<>();
    public static Monsters monsters;
    public static CurrentItem currentItem = new CurrentItem();
    public static int a=0;


    public static void command(Hero hero) {
        Rooms lastRoom = Map.currentRoom;
        int currentRoomX = Map.currentRoom.getRoomCoordinates().getX();
        int currentRoomY = Map.currentRoom.getRoomCoordinates().getY();

        switch (playerInput) {
            case "info" -> showInfo();
            case "status" -> status(hero);
            case "inventory" -> Characters.showHeroInventoryDrop();
            case "credits" -> credits();
            case "east" -> {
                Map.move(currentRoomX, currentRoomY + 1);
                showRoom(Map.currentRoom, lastRoom, "east");
                System.out.println("Choose your next room");
                showDoors(Map.currentRoom);
            }
            case "west" -> {
                Map.move(currentRoomX, currentRoomY - 1);
                showRoom(Map.currentRoom, lastRoom, "west");
                System.out.println("Choose your next room");
                showDoors(Map.currentRoom);
            }
            case "north" -> {
                Map.move(currentRoomX - 1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "north");
                System.out.println("Choose your next room");
                showDoors(Map.currentRoom);
            }
            case "south" -> {
                Map.move(currentRoomX + 1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "south");
                System.out.println("Choose your next room");
                showDoors(Map.currentRoom);
            }
            case "doors" -> showDoors(Map.currentRoom);
            case "quit" -> {
                System.out.println("You left the game, see you soon!!");
            }
            default -> System.out.println("Invalid input, Please check info");
        }

    }
    public static void showRoom(Rooms currentRoom, Rooms lastRoom, String direction) {

        if (currentRoom != lastRoom) {

            System.out.println("You head off to  " + currentRoom.getRoomName() + "  in the " + direction);
            System.out.println(currentRoom.getDefinition());
            if (currentRoom.isStairRoom()) {
                levels(currentRoom);
                startLevels();
            }

            if (currentRoom.getTownPeoples() != null && !currentRoom.getTownPeoples().isEmpty()) {
                System.out.println("There are " + currentRoom.getTownPeoples().size() + " Townspeople in this room.");
                if (currentRoom.getMonsters().isEmpty() && currentRoom.getTownPeoples().size() > 0) {
                    //printAttacks(currentRoom);
                    System.out.println("All monster died in " + currentRoom.getRoomName());

                }


                if (currentRoom.getTownPeoples().get(0).isHealer()) {
                    for (int i1 = 0; i1 < currentRoom.getTownPeoples().size(); i1++) {
                        if (currentRoom.getTownPeoples().get(i1).isHealer()) {
                            System.out.println("There is a healer in this room. Would you like to heal " + currentRoom.getTownPeoples().get(0).getHeal() + "HP?(1)yes(2)no");
                            int input2 = scanner.nextInt();

                            if (input2 == 1) {
                                hero.setHitPoint(hero.getHitPoint() + currentRoom.getTownPeoples().get(i1).getHeal());
                            } else {
                                System.out.println("No healing used!");
                            }


                        }

                    }
                    currentRoom.getTownPeoples().remove(0);


                } else {
                    System.out.println("There is no healer in this room");
                }

            }
            if (Rooms.getDroppedItem() != null && !Rooms.getDroppedItem().isEmpty() && Map.currentRoom.getDroppedInfo() != null) {

                for (String a : Rooms.getDroppedItem()) {       //do not change
                    System.out.println("There is " + a + " in this room");
                }
                System.out.println("Would you like to pick up one again ?");
                String choose2 = scanner.nextLine();
                if (choose2.equals("yes")) {
                    System.out.println("Enter the name of it");
                    String item2 = scanner.nextLine();
                    if (Rooms.getDroppedItem().contains(item2)) {
                        Game.hero.getHeroInventory().add(item2);
                        System.out.println("Successfully added to inventory");
                        Rooms.getDroppedItem().remove(item2);
                    } else
                        System.out.println(item2 + " is not dropped ");

                } else
                    System.out.println("continuing the game");

            }


            if (currentRoom.getMonsters() != null && !currentRoom.getMonsters().isEmpty()) {
                System.out.println();
                System.out.println("There are " + currentRoom.getMonsters().size() + " monsters in this room.");

                printAttacks(currentRoom);

            }
            if (currentRoom.getMonsters().isEmpty() && currentRoom.getTownPeoples().size() > 0) {
                savedTownPeopleCount += currentRoom.getTownPeoples().size();
                System.out.println("All monsters died in " + currentRoom.getRoomName());
                System.out.println("You saved " + savedTownPeopleCount + " townspeople in total.");
            }

        } else {
            System.out.println("You can't move to " + direction + " from this room");
        }
    }
    public static void showDoors(Rooms currentRoom) {
        int currentRoomX = Map.currentRoom.getRoomCoordinates().getX();
        int currentRoomY = Map.currentRoom.getRoomCoordinates().getY();


        if(Map.checkRoom(currentRoomX+1, currentRoomY)) {

            System.out.println("In south " + Map.map[currentRoomX+1][currentRoomY].getRoomName());
        }

        if(Map.checkRoom(currentRoomX-1, currentRoomY)) {

            System.out.println("In north "+Map.map[currentRoomX-1][currentRoomY].getRoomName());
        }

        if(Map.checkRoom(currentRoomX, currentRoomY+1)) {

            System.out.println("In east "+Map.map[currentRoomX][currentRoomY+1].getRoomName());
        }

        if(Map.checkRoom(currentRoomX, currentRoomY-1)) {

            System.out.println("In west "+Map.map[currentRoomX][currentRoomY-1].getRoomName());
        }

    }
    public static void attackStatus(Characters attacker, Characters defender) {

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
        System.out.println(monster.getName()+ " has "+monster.getHitPoint()+ " HP.");


        boolean looping = true;
        int input=0;
        Scanner cl = new Scanner(System.in);
        boolean escape = false;


        do {
            System.out.println("What are you going to do : (1) Attack " + monster.getName() + " (2) Run ");
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




            while (!monster.isDead() && !hero.isDead()) {


                attackStatus(hero, monster);
                if (monster.isDead()) {
                    currentRoom.deleteMonsters(monster);
                    if (monster.getMonsterInventory()!=null) {
                        try {
                            System.out.print("It dropped " + (monster.getMonsterInventory().get(0).toUpperCase() + " !")); // her monster için olmayacak
                            System.out.println(" Press 1 to pick it up, 2 to continue");
                            int a = scanner.nextInt();
                            if (a == 1) {
                                for (String mon : monster.getMonsterInventory()) {
                                    hero.getHeroInventory().add(mon);
                                }
                                System.out.println("Check your inventory now");
                            } else {

                                for (String bb : monster.getMonsterInventory()){      //do not change!!
                                    Rooms.getDroppedItem().add(bb);
                                    currentRoom.setDroppedInfo(bb);


                                }

                            }
                        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                            System.out.println("This monster did not drop anything");
                        }catch (InputMismatchException inputMismatchException){
                            System.out.println("Please enter a valid input");
                        }
                    }
                    if(currentRoom.getMonsters().size()>0){
                        printAttacks(currentRoom);
                    }
                } else if (hero.isDead()) {// ölme olayı burada oluyor
                    System.out.println("You died.... Game over :( ");
                    score();
                    System.exit(0);
                    break;
                }
            }
            attackStatus(monster, hero);

        } else {
            System.out.println("You succeeded to escape from the monster but it seems you forgot to save Towns People!");
        }
    }



    public static void showInfo() {

        System.out.println("Type east, west, north or south to move");
        System.out.println("Type 'status' to display hero's current status");
        System.out.println("Type 'inventory' to display inventory");
        System.out.println("Type 'doors' to display available roads");
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
                    startLevels();
                }
            }
            else if(a==16){
                System.out.println("You want to go lower (2) level?");
                levelChoice=scanner.nextInt();
                scanner.nextLine();
                if(levelChoice==2){
                    a--;
                    startLevels();
                }
            }
            else {

                System.out.println("You want to go upper (1) level or lower (2) ?");
                levelChoice = scanner.nextInt();
                scanner.nextLine();
                if (levelChoice == 1) {
                    a++;
                    startLevels();
                } else if (levelChoice == 2) {
                    a=a-3;
                    startLevels();
                }
            }
        }
    }

    public static void status(Hero hero) {
        Items items = new Items();
        WeightSystem weightSystem = new WeightSystem();

        System.out.println("NAME : " + hero.getName());
        System.out.println("HP : " + hero.getHitPoint());
        System.out.println("CURRENT CLOTH: " + currentItem.getClothName());
        System.out.println("CURRENT WEAPON: " + currentItem.getWeaponName());
        System.out.println("SAVED TOWN PEOPLE COUNTER: "+ savedTownPeopleCount);
        System.out.println("\nEnter 1 to change your current weapon, 2 to change your current cloth, 3 to continue");
        String change = scanner.nextLine();
        if (change.equals("1")){
            Characters.showHeroInventory();
            System.out.println("Enter the weapon you want to change with current weapon");
            String a = scanner.nextLine();
            if (hero.getHeroInventory().contains(a)){
                currentItem.setWeaponName(a);
                System.out.println("successfully changed!");
            }else
                System.out.println("There is no weapon like "+a+" in inventory");
        }else if (change.equals("2")){
            Characters.showHeroInventory();
            System.out.println("Enter the cloth you want to change with current cloth");
            String a = scanner.nextLine();
            if (hero.getHeroInventory().contains(a)){
                currentItem.setClothName(a);
                System.out.println("successfully changed!");
            }else
                System.out.println("There is no cloth like "+a+" in inventory");
        }else
            showInfo();
    }
    public static void main(String[] args) throws InterruptedException {


        System.out.println("********************** WELCOME TO HERO OF THE DUNGEON **********************");
        System.out.println("**                                                                        **");
        System.out.println("**       SE-116 Project Group 7                                           **");
        System.out.println("**                                                                        **");
        System.out.println("**                                ® All Right Reserved.                   **");
        System.out.println("**                                                                        **");
        System.out.println("****************************************************************************");

        StoryText();
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
                hero.getHeroInventory().add(0,(currentItem.usingWeapon(2,1,1)));

                currentItem.setWeaponName(currentItem.usingWeapon(2,1,1));



                hero.getHeroInventory().add(1,currentItem.usingArmor(1));
                currentItem.setClothName(currentItem.usingArmor(1));


                System.out.println("Ahh... I see, " + hero.getName() + " the brave hero!");
                System.out.println("As a welcoming gift here is your cloth and weapon, check inventory");
                inventory.add(0,"light clothing");
                inventory.add(1,"dagger");



                System.out.println("You are in front of the dungeon gate");
                System.out.println("Type 'info' for further info");

                playerInput = scanner.nextLine();
                if(!hero.isDead()){
                    startLevels();
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



    public static void startLevels() {

        a++;




        Level.Levels(a);


        while (!playerInput.equals("quit")){
            command(hero);
            System.out.print("-->");
            playerInput = scanner.nextLine();
        }

    }


    public static void credits () {
        System.out.println("Egemen Akgüner");
        System.out.println("Uzay Kayra Çetinkaya");
        System.out.println("Busegül Özkaya");
    }
}