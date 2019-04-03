package types.vehicle;

public class Car implements Vehicle {

    private final int numberOfWheels;
    private final int maxPassengers;
    
    public Car(int numberOfWheels, int maxPassengers) {
        this.numberOfWheels = numberOfWheels;
        this.maxPassengers = maxPassengers;
    }
    
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public String movingNoise() {
        return "vroooooooooooom";
    }

    @Override
    public int getMaxNumberOfPassengers() {
        return maxPassengers;
    }

}
