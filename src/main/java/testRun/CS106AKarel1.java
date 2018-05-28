package testRun;

public class CS106AKarel1 {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		getnewspaper();
		returntohome();

	}
	private void returntohome(){
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
	}
	private void getnewspaper(){
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
	}
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
	private void move(){
	}
	private void turnLeft(){
	}
	private void pickBeeper(){
	}
}