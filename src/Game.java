import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<Items>();
        ArrayList<Weapons> weapons = new ArrayList<Weapons>();
        ArrayList<Clothes> clothes = new ArrayList<Clothes>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("********************** WELCOME TO THE IMPOSSIBLE DUNGEON **********************");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Ahh... I see, " + name + " the brave hero!");
        Items item;
        int itemNum = 0;
        Weapons weapon = null;
        Clothes clothe=null;
        boolean devam = true;
        boolean full=true;

            while (devam) {

                do {

                    System.out.println("Before you enter the dungeon please choose your items:\n1 -- Clothes\n2 -- Weapons\n3 -- Continue");
                    itemNum = scanner.nextInt();
                    if (itemNum == 1) {
                        item = new Clothes();
                        System.out.println("Choose your outfit\n1 for light clothing\n2 for leather armor\n3 for chainmail armor");
                        int outfit = scanner.nextInt();
                        if (outfit == 1) {
                            clothe = new LightClothing();
                            clothe.setClothesName("light clothing");

                            //clothes.add(0,)

                        } else if (outfit == 2) {
                            clothe = new LeatherArmor();
                            clothe.setClothesName("leather armor");


                        } else if (outfit == 3) {
                            clothe = new ChainmailArmor();
                            clothe.setClothesName("chainmail armor");

                        } else
                            System.out.println("you entered wrong number for outfit");

                    } else if (itemNum == 2) {
                        item = new Weapons();
                        System.out.println("Please choose your weapon\n1 for swords\n2 for axes\n3 for bows");
                        int weaponNum = scanner.nextInt();

                        if (weaponNum == 1) {
                            weapon = new Swords();
                            System.out.println("1 for dagger, 2 for short sword, 3 for long sword");
                            int sword = scanner.nextInt();
                            if (sword == 1) {
                                weapon.setWeaponName("dagger");



                            } else if (sword == 2) {
                                weapon.setWeaponName("short sword");



                            } else if (sword == 3) {
                                weapon.setWeaponName("long sword");



                            } else
                                System.out.println("wrong sword selection");

                            //there is a problem here//

                        } else if (weaponNum == 2) {
                            weapon = new Axes();
                            System.out.println("1 for small axes, 2 for long axes, 3 for broad axes");
                            int axe = scanner.nextInt();
                            if (axe == 1) {
                                weapon.setWeaponName("small axe");

                            } else if (axe == 2) {
                                weapon.setWeaponName("long axe");

                            } else if (axe == 3) {
                                weapon.setWeaponName("broad axe");

                            } else
                                System.out.println("wrong axe selection");

                        } else if (weaponNum == 3) {
                            weapon = new Bows();
                            System.out.println("1 for short bows, 2 for longbows, 3 for composite bows");
                            int bow = scanner.nextInt();

                            if (bow == 1) {
                                weapon.setWeaponName("short bow");


                            } else if (bow == 2) {
                                weapon.setWeaponName("long bow");


                            } else if (bow == 3) {
                                weapon.setWeaponName("composite bow");
                                //weapons.add();


                            } else
                                System.out.println("wrong bow selection");

                        } else
                            System.out.println("you entered wrong number for weapon selection");


                    } else if (itemNum == 3) {

                            if (weapon == null && clothe == null) {
                                System.out.println("You did not choose any item!!!!!!!!!!!!");

                            } else if (weapon != null && clothe != null) {
                                devam = false;
                            }
                           try {
                            clothe.display();
                        } catch (Exception e) {
                            System.out.println("You did not choose a cloth");
                        }
                                try {
                                    weapon.display();
                                }catch (Exception e){
                                    System.out.println("You did not choose a weapon");
                                }

                    } else
                        System.out.println("wrong selection");

                } while (weapon == null && clothe == null);
            }



    }
}
