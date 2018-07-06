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
        turnLeft();
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

    private static void turnRight(){
        System.out.println("turnRight 000");
        turnLeft();
        turnLeft();
        turnLeft();
        System.out.println("turnRight 999");
    }

    private static boolean notBlockedOnLeft(){
        System.out.println("notBlockedOnLeft 000");
        turnLeft();
        boolean notBlocked = notBlockedByWall();
        turnRight();
        System.out.println("notBlockedOnLeft 999");
        return notBlocked;
    }


    //    private static boolean notBlockedOnLeft2(){
    //        turnLeft();
    //        if (notBlockedByWall()) {
    //            turnRight();
    //            return true;
    //        } else {
    //            turnRight();
    //            return false;
    //        }
    //    }
    //
    //    private static boolean notBlockedOnLeft3(){
    //        turnLeft();
    //        return turnRightThenValue(notBlockedByWall());
    //    }

    //    private static boolean turnRightThenValue(boolean notBlockedByWall) {
    //        turnRight();
    //        return notBlockedByWall;
    //    }
}