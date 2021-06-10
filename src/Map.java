final public class Map {


    public static Rooms[][] map;
    public static Rooms currentRoom;



    public static boolean checkDirection(int roomX, int roomY) {
        return  ((roomX >= 0 && roomX < map.length) &&
                (roomY >= 0 && roomY < map.length) &&
                map[roomX][roomY] != null);
    }


    public static void moveDirection(int roomX, int roomY) {
        if(checkDirection(roomX, roomY)) {
            currentRoom = map[roomX][roomY];

        }
    }

    public static Rooms getRoom(Coordinates point) {
        return map[point.getX()][point.getY()];
    }

    public static Rooms getRoom(int x, int y) {
        return map[x][y];
    }


}
