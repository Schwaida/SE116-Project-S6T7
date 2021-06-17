package SE116Project;

public class Level {
    public static void Level(int a) {

        Rooms[][] maze1 = new Rooms[5][5];

        maze1[0][1] = new Rooms("Room 1","regular room",new Coordinates(0,1));
        maze1[1][1] = new Rooms("Room 3","regular room",new Coordinates(1,1));
        maze1[1][0] = new Rooms("Room 2","regular room",new Coordinates(1,0));
        maze1[1][2] = new Rooms("Room 4","regular room",new Coordinates(1,2));
        maze1[2][2] = new Rooms("Room 5","regular room",new Coordinates(2,2));
        maze1[2][3] = new Rooms("Room 6","regular room",new Coordinates(2,3));
        maze1[3][3] = new Rooms("Room 7","regular room",new Coordinates(3,3));
        maze1[4][3] = new Rooms("Room 10","regular room",new Coordinates(4,3));
        maze1[4][2] = new Rooms("Room 9","regular room",new Coordinates(4,2));
        maze1[4][1] = new Rooms("Room 8","stair room",new Coordinates(4,1));


        Map.map = maze1;
        Map.currentRoom = maze1[0][1];
        Monsters dwarf = new Monsters("Dwarf",200,0.65,40);
        Monsters goblin = new Monsters("Goblin",250,0.9,50);
        Monsters elf =new Monsters("Elf",100,0.4,10);
        TownPeople healer= new TownPeople("Healer",true);
        TownPeople townPeople= new TownPeople("Town People",false);
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
}
