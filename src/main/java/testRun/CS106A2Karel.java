package testRun;

public class CS106A2Karel extends Karel {
    static {
        room = new int[] {5,6,7,6,5,6,7,6,5,6,7,6,5};
    }

    public static void main(String[] args) {
        while (notBlockedByWall()){
            goToCeiling();
            goToFloor();
            goToNextColumn();
        }
    }

    private static void goToCeiling() {
        System.out.println("goToCeiling 000");
        turnLeft();
        while (notBlockedByWall()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }
        System.out.println("goToCeiling 999");
    }

    private static void goToFloor() {
        System.out.println("goToFloor 000");
        turnAround();
        while (notBlockedByWall()) {
            move();
        }
        System.out.println("goToFloor 999");
    }

    private static void goToNextColumn(){
        System.out.println("goToNextColumn 000");
        turnLeft();
        move4();
        System.out.println("goToNextColumn 999");
    }

    private static void move4() {
        System.out.println("move4 000");
        move();
        move();
        move();
        move();
        System.out.println("move4 999");
    }

    private static void turnAround() {
        System.out.println("turnAround 000");
        turnLeft();
        turnLeft();
        System.out.println("turnAround 999");
    }
}