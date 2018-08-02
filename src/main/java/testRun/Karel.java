package testRun;


public abstract class Karel {

    private static class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Location plus(Location other) {
            return new Location(other.x + x, other.y + y);
        }

        public String toString() {
            return String.format("x = %s, y = %s", x, y);
        }
    }

    protected static enum Direction {
        NORTH(0,1), EAST(1,0), SOUTH(0, -1), WEST(-1, 0);

        private Location delta;
        private Direction(int x, int y) {
            this.delta = new Location(x, y);
        }
        public Direction getNextDirection() {
            return getNextDirection(this);
        }

        public static Direction getNextDirection(Direction dir) {
            switch (dir) {
            case NORTH : return WEST;
            case EAST : return NORTH;
            case SOUTH : return EAST;
            case WEST : return SOUTH;
            }
            throw new RuntimeException("Can't happen, direction  not in NSEW");
        }
    }

    private static Direction dir = Direction.EAST;
    private static Location xy = new Location(0,0);
    protected static int[] room = new int[] {};

    protected static void turnLeft() {
        sop("turnLeft");
        sopd("\tfrom xy = %s, dir = %s", xy, dir);
        dir = dir.getNextDirection();
        sopd("\tto xy = %s, dir = %s", xy, dir);
        sopl("");

    }


    protected static void move() {
        sop("move");
        sopd("\t\tfrom xy = %s, dir = %s", xy, dir);
        Location tempXy = xy.plus(dir.delta);
        if (tempXy.x < 0 || tempXy.y < 0 || tempXy.x > room.length - 1 || tempXy.y > room[tempXy.x] - 1) {
            throw new RuntimeException("you can't move there");
        }
        xy = tempXy;
        sopd("\tto xy = %s, dir = %s", xy, dir);
        sopl("");
    }
    
    protected static boolean notBlockedByWall(){
        sop("notBlocked");
        sopd("\tfrom xy = %s, dir = %s", xy, dir);
        Location tempXy = xy.plus(dir.delta);
        sopl("");
        return ! (tempXy.x < 0 || tempXy.y < 0 || tempXy.x > room.length - 1 || tempXy.y > room[tempXy.x]- 1);
    }

    protected static boolean noBeepersPresent(){
        sopl("noBeeperspresent");
        return true;
    }

    protected static void putBeeper(){
        sopl("putBeeper");
    }

    private static void sop(String format, Object... args) {
        System.out.print(String.format("\t"+format, args));
    }

    private static void sopd(String format, Object... args) {
        if (debug) {
            sop(format, args);
        }
    }

    private static void sopl(String format, Object... args) {
        System.out.println(String.format("\t"+format, args));
    }

    private static boolean debug = true;
    private static void sopld(String format, Object... args) {
        if (debug) {
            sopl(format, args);
        }
    }

    public static void main(String[] args) {
        room = new int[] {5,3,3,3,6};
        
        sopld("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopld("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopld("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopld("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopld("xy = %s dir = %s", xy, dir);
        move();
        turnLeft();
        sopld("xy = %s dir = %s", xy, dir);
        move();
        turnLeft();
        sopld("xy = %s dir = %s", xy, dir);
        move();
        turnLeft();

        turnLeft();
        turnLeft();
        xy = new Location(0,3);
        sopld("xy = %s dir = %s", xy, dir);
        move();
        sopld("xy = %s dir = %s", xy, dir);
        move();
        sopld("xy = %s dir = %s", xy, dir);
        move();
        sopld("xy = %s dir = %s", xy, dir);
        move();
        sopld("xy = %s dir = %s", xy, dir);
        sopld("xy = %s dir = %s", xy, dir);
        sopld("xy = %s dir = %s", xy, dir);
        sopld("xy = %s dir = %s", xy, dir);

        sopld("xy = %s dir = %s", xy, dir);
    }
}
