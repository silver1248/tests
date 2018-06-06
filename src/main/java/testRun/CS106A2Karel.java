package testRun;


public class CS106A2Karel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		turnLeft();
		goToCeiling();
		goToFloor();
		goToNextColumn();
		goToCeiling();
		goToFloor();
		goToNextColumn();
		goToCeiling();
		goToFloor();
		goToNextColumn();
		goToCeiling();
		goToFloor();
		turnLeft();
	}	

	private static void goToCeiling(){
		while (notBlockedByWall()){
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}

	private static void goToFloor(){
		turnAround();
		while (notBlockedByWall()) {
			move();
		}
	}

	private static void goToNextColumn(){
		turnLeft();
		move4();
		turnLeft();
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

	private static void move(){
		System.out.println("move");
	}

	private static void turnLeft(){
		System.out.println("turnLeft");
	}

	private static boolean noBeepersPresent(){
		System.out.println("noBeeperspresent");
		return (true);
	}

	private static void putBeeper(){
		System.out.println("putBeeper");
	}

	private static boolean notBlockedByWall(){
		System.out.println("notBlokedByWall");
		return(true);
	}
}