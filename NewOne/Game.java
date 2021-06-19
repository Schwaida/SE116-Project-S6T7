package NewOne;

import Try.Room;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game implements ItemStats {
    public static String playerInput;
    public static Scanner scanner;
    public static Hero hero = null;
    public static Monsters monsters;
    public static CurrentItem currentItem = new CurrentItem();
    public static int a = 0;
    public static int savedTownsPeopleCount = 0;


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
                Characters.showHeroInventoryDrop();

                break;
            case "credits":
                credits();
                break;
            case "east":
                Map.moveDirection(currentRoomX, currentRoomY + 1);
                showRoom(Map.currentRoom, lastRoom, "east");
                System.out.println();
                System.out.println("Choose your next room to continue..");
                showRoad(Map.currentRoom);
                break;
            case "west":
                Map.moveDirection(currentRoomX, currentRoomY - 1);
                showRoom(Map.currentRoom, lastRoom, "west");
                System.out.println();
                System.out.println("Choose your next room to continue..");
                showRoad(Map.currentRoom);
                break;
            case "north":
                Map.moveDirection(currentRoomX - 1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "north");
                System.out.println();
                System.out.println("Choose your next room to continue..");
                showRoad(Map.currentRoom);
                break;
            case "south":
                Map.moveDirection(currentRoomX + 1, currentRoomY);
                showRoom(Map.currentRoom, lastRoom, "south");
                System.out.println();
                System.out.println("Choose your next room to continue..");
                showRoad(Map.currentRoom);
                break;
            case "road":
                showRoad(Map.currentRoom);
                break;
            case "quit":
                System.out.println("You left the game, see you soon!!");
                break;

            /*case "look":

                System.out.println(Rooms.getDroppedItem());
                break;*/
            /*case "inventory":
                showInventory();
                break;*/

            default:
                System.out.println("Invalid command! Check info");
                break;
        }

    }

    public static void levels(Rooms currentRoom) {

        int levelChoice;
        if (currentRoom.isStairRoom()) {
            if (a == 1) {
                System.out.println("You want to go upper (1) level?");
                levelChoice = scanner.nextInt();
                scanner.nextLine();
                if (levelChoice == 1) {
                    a++;
                    startGame();
                }
            } else if (a == 16) {
                System.out.println("You want to go lower (2) level?");
                levelChoice = scanner.nextInt();
                scanner.nextLine();
                if (levelChoice == 2) {
                    a--;
                    startGame();
                }
            } else {

                System.out.println("You want to go upper (1) level or lower (2) ?");
                levelChoice = scanner.nextInt();
                scanner.nextLine();
                if (levelChoice == 1) {
                    a++;
                    startGame();
                } else if (levelChoice == 2) {
                    a = a - 3;
                    startGame();
                }
            }
        }
    } public static void showRoom(Rooms currentRoom, Rooms lastRoom, String direction) {

        if (currentRoom != lastRoom) {

            System.out.println("You head off to  " + currentRoom.getRoomName() + "  in the " + direction);
            System.out.println(currentRoom.getDefinition());
            if(currentRoom.isStairRoom()){
                levels(currentRoom);
                startGame();
            }



            if(currentRoom.getTownPeoples()!= null && !currentRoom.getTownPeoples().isEmpty()) {
                System.out.println("There are "+ currentRoom.getTownPeoples().size()+" Townspeople in this room.");
                if(currentRoom.getTownPeoples().get(0).isHealer()){
                    System.out.println("One of the townspeople is healer in this room");

                }
                else{
                    System.out.println("There is no healer in this room");
                }
            }

            if (Rooms.getDroppedItem()!= null && !Rooms.getDroppedItem().isEmpty()&&Map.currentRoom.getDroppedInfo()!=null) {

                for (String a: Rooms.getDroppedItem()){       //do not change
                    System.out.println("There is "+a+" in this room");}
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

                }else
                    System.out.println("continuing the game");

            }

            if(currentRoom.getMonsters() != null && !currentRoom.getMonsters().isEmpty()) {
                System.out.println("There are "+ currentRoom.getMonsters().size()+" monsters in this room.");
                for (int i=0;i<currentRoom.getMonsters().size();i++){
                    printAttacks(currentRoom);
                } if(currentRoom.getMonsters().size()>0){
                    printAttacks(currentRoom);
                }

                if(currentRoom.getMonsters().size()<=0){
                    System.out.println("All monster died in "+ currentRoom.getRoomName());
                    if(currentRoom.getMonsters().isEmpty()&&currentRoom.getTownPeoples().size()>0) {
                        
                        savedTownsPeopleCount+=currentRoom.getTownPeoples().size();

                        System.out.println("You saved " + savedTownsPeopleCount + " townspeople");
                       // currentRoom.getTownPeoples().remove(0)
                    }
                    for(int i1=0;i1<currentRoom.getTownPeoples().size();i1++){
                        if(currentRoom.getTownPeoples().get(i1).isHealer()){
                            System.out.println("There is a healer in this room. Would you like to heal yourself by "+currentRoom.getTownPeoples().get(i1).getHeal()+ " HP? (1) yes (2) no");
                            int input2 = scanner.nextInt();
                            scanner.nextLine();

                            if(input2==1){
                                hero.setHitPoint(hero.getHitPoint()+currentRoom.getTownPeoples().get(i1).getHeal());
                                System.out.println("You look healthier :). Check your HP in status.");
                            }
                            else{
                                System.out.println("No healing used!");
                            }
                            savedTownsPeopleCount++;

                        }
                    }
                }

                // printAttacks(currentRoom);

            }
        } else {
            System.out.println("You can't move to " + direction + " from this room");
        }
    }

   /* public static void showRoom(Rooms currentRoom, Rooms lastRoom, String direction) {

        if (currentRoom != lastRoom) {

            System.out.println("You head off to  " + currentRoom.getRoomName() + "  in the " + direction);
            System.out.println(currentRoom.getDefinition());
            if (currentRoom.isStairRoom()) {
                levels(currentRoom);
                startGame();
            }

            if (currentRoom.getTownPeoples() != null && !currentRoom.getTownPeoples().isEmpty()) {

                    System.out.println("There are " + currentRoom.getTownPeoples().size() + " Townspeople in this room.");

                if (currentRoom.getTownPeoples().get(0).isHealer()) {

                    System.out.println("One of the townspeople is healer in this room");


                } else {
                    System.out.println("There is no healer in this room");
                }

            }
            if(currentRoom.getMonsters() != null && !currentRoom.getMonsters().isEmpty()) {
                System.out.println();
                System.out.println("There are "+ currentRoom.getMonsters().size()+" monsters in this room.");
                if(currentRoom.getMonsters().size()>0) {
                    for (int i = 0; i < currentRoom.getMonsters().size(); i++) {
                        printAttacks(currentRoom);
                    }
                    printAttacks(currentRoom);
                }
                // printAttacks(currentRoom);


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


                    // printAttacks(currentRoom);

                }

            }
        }else
            System.out.println("You can't move to " + direction + " from this room");


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
            System.out.println("There are " + currentRoom.getMonsters().size() + " monsters in this room");
            //Map.currentRoom

        }
    }*/

    public static void showRoad(Rooms currentRoom) {
        int currentRoomX = Map.currentRoom.getRoomCoordinates().getX();
        int currentRoomY = Map.currentRoom.getRoomCoordinates().getY();

        /*
         * south
         */
        if (Map.checkDirection(currentRoomX + 1, currentRoomY)) {

            System.out.println("South door leads to " + Map.map[currentRoomX + 1][currentRoomY].getRoomName());
        }
        /*
         * north
         */
        if (Map.checkDirection(currentRoomX - 1, currentRoomY)) {

            System.out.println("North door leads to " + Map.map[currentRoomX - 1][currentRoomY].getRoomName());
        }
        /*
         * east
         */
        if (Map.checkDirection(currentRoomX, currentRoomY + 1)) {

            System.out.println("East door leads to " + Map.map[currentRoomX][currentRoomY + 1].getRoomName());
        }
        /*
         * west
         */
        if (Map.checkDirection(currentRoomX, currentRoomY - 1)) {

            System.out.println("West door leads to " + Map.map[currentRoomX][currentRoomY - 1].getRoomName());
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
                while (!monster.isDead() && !hero.isDead()) {
                    attackStatus(hero, monster);


                    if (monster.isDead()) {
                        currentRoom.deleteMonsters(monster);
                        if (monster.getMonsterInventory() != null) {
                            try {
                                System.out.print("It dropped " + (monster.getMonsterInventory().get(0).toUpperCase() + " !")); // her monster için olmayacak
                                System.out.println(" Press 1 to pick it up, 2 to continue");
                                int a = scanner.nextInt();
                                if (a == 1) {
                                    hero.getHeroInventory().add(String.valueOf(monster.getMonsterInventory()));
                                    System.out.println("Check your inventory now");
                                }
                            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                System.out.println("This monster did not drop anything");
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Please enter a valid input");
                            }
                        }
                        break;

                    } else if (hero.isDead()) {// ölme olayı burada oluyor      --> artık olmuyor
                        System.out.println("You died.... Game over :( ");
                        // System.exit(0);
                        return;
                    }
                    attackStatus(monster, hero);

                }

            } else if (input == 2) {
                System.out.println("Lucky you, you managed to reach the doors before the monster see you");
                System.out.println();
                return;


            } else {
                System.out.println("Please choose one option! ");
            }

        } while (!monster.isDead() && ! hero.isDead());

    }



   /* public static void printAttacks(Rooms currentRoom) {

        int i = -1;
        i++;

        boolean looping = true;
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        boolean escape = false;


        Monsters monster = currentRoom.getMonsters().get(i);


        System.out.println("There is a " + monster.getName() + " ! Look out!");
        System.out.println("Its HP is " + monster.getHitPoint());

        do {
            System.out.println("What are you going to do : (1) Attack" + monster.getName() + " (2) Run ");
            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.next();
            }

            if (input == 1) {

                while (!monster.isDead() && !hero.isDead()) {
                    attackStatus(hero, monster);


                    if (monster.isDead()) {
                        currentRoom.deleteMonsters(monster);
                        if (monster.getMonsterInventory() != null) {
                            try {
                                System.out.print("It dropped " + (monster.getMonsterInventory().get(0).toUpperCase() + " !")); // her monster için olmayacak
                                System.out.println(" Press 1 to pick it up, 2 to continue");
                                int a = scanner.nextInt();
                                if (a == 1) {
                                    hero.getHeroInventory().add(String.valueOf(monster.getMonsterInventory()));
                                    System.out.println("Check your inventory now");
                                }
                            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                                System.out.println("This monster did not drop anything");
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Please enter a valid input");
                            }
                        }
                        break;

                    } else if (hero.isDead()) {// ölme olayı burada oluyor      --> artık olmuyor
                        System.out.println("You died.... Game over :( ");
                        // System.exit(0);
                        return;
                    }
                    attackStatus(monster, hero);
                }
                if (currentRoom.getMonsters().size() <= 0) {
                    System.out.println("All monster died in " + currentRoom.getRoomName());
                    for (int i1 = 0; i1 < currentRoom.getTownPeoples().size(); i1++) {
                        if (currentRoom.getTownPeoples().get(i1).isHealer()) {
                            System.out.println("There is a healer in this room. Would you like to heal " + currentRoom.getTownPeoples().get(i1).getHeal() + "HP?(1)yes(2)no");
                            int input2 = scanner.nextInt();
                            scanner.nextLine();

                            if (input2 == 1) {
                                hero.setHitPoint(hero.getHitPoint() + currentRoom.getTownPeoples().get(i1).getHeal());
                            } else {
                                System.out.println("No healing used!");
                            }

                        }
                    }
                } else {
                    System.out.println("You succeeded to escape from the monster but it seems you forgot to save Towns People!");
                }

                looping = false;
            } else if (input == 2) {


                System.out.println("Lucky you, you managed to reach the doors before the monster see you");

                looping = false;



            } else {
                System.out.println("Please choose one option! ");
            }

        } while (looping);


    }
*/



            /*while (!monster.isDead() && !hero.isDead()) {
                if (currentRoom.getMonsters().size()>0) {
                    attackStatus(hero, monster);
                }
                if (monster.isDead()) {
                    currentRoom.deleteMonsters(monster);
                    if (monster.getMonsterInventory()!=null) {
                        try {
                            System.out.print("It dropped " + (monster.getMonsterInventory().get(0).toUpperCase() + " !")); // her monster için olmayacak
                            System.out.println(" Press 1 to pick it up, 2 to continue");
                            int a = scanner.nextInt();
                            if (a == 1) {
                                hero.getHeroInventory().add(String.valueOf(monster.getMonsterInventory()));
                                System.out.println("Check your inventory now");
                            }
                        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                            System.out.println("This monster did not drop anything");
                        }catch (InputMismatchException inputMismatchException){
                            System.out.println("Please enter a valid input");
                        }
                    }
                    break;

                } else if (hero.isDead()) {// ölme olayı burada oluyor      --> artık olmuyor
                    System.out.println("You died.... Game over :( ");
                   // System.exit(0);
                    return;
                }
                attackStatus(monster,hero);
            }*/




   /* if (monster.isDead()) {
        currentRoom.deleteMonsters(monster);
        if (monster.getMonsterInventory()!=null) {
            try {
                System.out.print("It dropped " + (monster.getMonsterInventory().get(0).toUpperCase() + " !")); // her monster için olmayacak
                System.out.println(" Press 1 to pick it up, 2 to continue");
                int a = scanner.nextInt();
                if (a == 1) {
                    hero.getHeroInventory().add(String.valueOf(monster.getMonsterInventory()));
                    System.out.println("Check your inventory now");
                }
            }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                System.out.println("This monster did not drop anything");
            }catch (InputMismatchException inputMismatchException){
                System.out.println("Please enter a valid input");
            }
        }
        break;

    } else if (hero.isDead()) {// ölme olayı burada oluyor      --> artık olmuyor
        System.out.println("You died.... Game over :( ");
        // System.exit(0);
        return;
    }
    attackStatus(monster,hero);
}


        }
                }
*/


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
        System.out.println("SAVED TOWN PEOPLE COUNTER: "+savedTownsPeopleCount);
        System.out.println("CURRENT WEIGHT: ");

        //inventorydeki bulunan itemlerın weight
        // current weight + = currentitem get weight
        for (String a: hero.getHeroInventory()){
            //weightSystem.getCurrentWeight() += currentItem.getSwordWeight();
            //weightSystem.setCurrentWeight(currentItem.getAxeWeight());
            //weightSystem.setCurrentWeight(currentItem.getBowWeight());
           // weightSystem.setCurrentWeight(currentItem.getSwordWeight());
        }



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
        // if current weight > 30
        //sout --> you can not carry any more weight, you can drop item.

    }

    public static void main(String[] args) {
        // System.out.println("random "+(int)(Math.random()*10+1));

        //ArrayList<Items> items = new ArrayList<Items>();
        //ArrayList<Weapons> weapons = new ArrayList<Weapons>();
        //ArrayList<Clothes> clothes = new ArrayList<Clothes>();

        System.out.println("****************************************************************************");
        System.out.println("**       SE-116 Project Group 7                                           **");
        System.out.println("**                                                                        **");
        System.out.println("********************** WELCOME TO HERO OF THE DUNGEON **********************");
        System.out.println("**                                                                        **");
        System.out.println("**                                      ® All Right Reserved.             **");
        System.out.println("****************************************************************************");
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
                CurrentItem currentItem = new CurrentItem();
                hero = new Hero(playerInput);
                System.out.println("Enter your name: ");
                String heroName = scanner.nextLine();
                hero.setName(heroName);


                System.out.println("Ahh... I see, " + hero.getName() + " the brave hero!");
                System.out.println("As a welcoming gift here is your cloth and weapon, check inventory");

                hero.getHeroInventory().add(0, (currentItem.usingWeapon(2, 1, 1)));
                currentItem.setWeaponName(currentItem.usingWeapon(2, 1, 1));

                hero.getHeroInventory().add(1, currentItem.usingArmor(1));
                currentItem.setClothName(currentItem.usingArmor(1));

                System.out.println("You are in front of the dungeon gate");
                System.out.println("Type 'info' for further info");

                playerInput = scanner.nextLine();

                    if (!hero.isDead()) {
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


        // yine bir arraylistle odaya bırakmayı dene!

    }



    public static void startGame() {
        a++;


        Level.Levels(a);


        while (!playerInput.equals("quit")){
            command(hero);
            System.out.print("-->");
            playerInput = scanner.nextLine();
            if (playerInput.equals("quit")){
                System.out.println("Are you leaving already :( Come back soon...");
                System.exit(0);
            }
        }



        /*System.out.println("Enter your gender:");
        String genderChosen= scanner.nextLine();

        System.out.println("Your gender is: "+genderChosen);*/


        //tek tek set edeceğimize kendi seçsin statuste!! inventory içinden


        // currentItem.setWeaponName(currentItem.usingWeapon(1,2,3));
        //hero.getHeroInventory().add(0,currentItem.usingWeapon(1,3,2));

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
            System.out.println("♥---------------------♥");
            System.out.println("Egemen Akgüner");
            System.out.println("Uzay Kayra Çetinkaya");
            System.out.println("Busegül Özkaya");
            System.out.println("♥---------------------♥");
        }

    }
