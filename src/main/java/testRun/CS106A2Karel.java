package testRun;


public class CS106A2Karel extends Karel {
    static {
        room = new int[] {5,6,7,6,5,6,7,6,5,6,7,6,5};
    }

    public static void main(String[] args) {
        turnLeft();
        while (notBlockedByWall() || notBlockedOnLeft()){
            goToCeiling();
            goToFloor();
            goToNextColumn();
        }
    }

    private static void goToCeiling() {
        System.out.println("goToCeiling 000");
        while (notBlockedByWall()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }
        System.out.println("goToCeiling 999");
    }

    private static void goToFloor(){
        turnAround();
        while (notBlockedByWall()) {
            move();
        }
    }

    private static void goToNextColumn(){
        System.out.println("goToNextColumn 000");
        turnLeft();
        move4();
        turnLeft();
        System.out.println("goToNextColumn 999");
    }

    private static void move4(){
        move();
        move();
        move();
        move();
    }

    private static void turnAround(){
        turnLeft();
        turnLeft();
    }

    private static void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private static boolean notBlockedOnLeft(){
        turnLeft();
        boolean notBlocked = notBlockedByWall();
        turnRight();
        return notBlocked;
    }


    private static boolean notBlockedOnLeft2(){
        turnLeft();
        if (notBlockedByWall()) {
            turnRight();
            return true;
        } else {
            turnRight();
            return false;
        }
    }

    private static boolean notBlockedOnLeft3(){
        turnLeft();
        return turnRightThenValue(notBlockedByWall());
    }

    private static boolean turnRightThenValue(boolean notBlockedByWall) {
        turnRight();
        return notBlockedByWall;
    }
}