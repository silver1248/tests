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
        sopd("\txy = %s, dir = %s", xy, dir);
        dir = dir.getNextDirection();
    }


    protected static void move() {
        sop("move");
        sopd("\txy = %s, dir = %s", xy, dir);
        Location tempXy = xy.plus(dir.delta);
        if (tempXy.x < 0 || tempXy.y < 0 || tempXy.x > room.length || tempXy.y > room[tempXy.x]) {
            throw new RuntimeException("you can't move there");
        }
        xy = tempXy;
    }
    
    protected static boolean notBlockedByWall(){
        sop("notBlockedByWall");
        sopd("\txy = %s, dir = %s rl = %s", xy, dir, room.length);
        Location tempXy = xy.plus(dir.delta);
        return ! (tempXy.x < 0 || tempXy.y < 0 || tempXy.x > room.length - 1 || tempXy.y > room[tempXy.x]);
    }

    private static void sop(String format, Object... args) {
        System.out.println(String.format("\t"+format, args));
    }

    private static boolean debug = false;
    private static void sopd(String format, Object... args) {
        if (debug) {
            sop(format, args);
        }
    }

    public static void main(String[] args) {
        room = new int[] {5,3,3,3,6};
        
        sopd("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopd("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopd("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopd("xy = %s dir = %s", xy, dir);
        turnLeft();
        sopd("xy = %s dir = %s", xy, dir);
        move();
        turnLeft();
        sopd("xy = %s dir = %s", xy, dir);
        move();
        turnLeft();
        sopd("xy = %s dir = %s", xy, dir);
        move();
        turnLeft();

        turnLeft();
        turnLeft();
        xy = new Location(0,3);
        sopd("xy = %s dir = %s", xy, dir);
        move();
        sopd("xy = %s dir = %s", xy, dir);
        move();
        sopd("xy = %s dir = %s", xy, dir);
        move();
        sopd("xy = %s dir = %s", xy, dir);
        move();
        sopd("xy = %s dir = %s", xy, dir);
        sopd("xy = %s dir = %s", xy, dir);
        sopd("xy = %s dir = %s", xy, dir);
        sopd("xy = %s dir = %s", xy, dir);

        sopd("xy = %s dir = %s", xy, dir);
    }
}
