package types.vehicle;

public class Airplane implements Vehicle{

    private final int maxPassengers;
    
    public Airplane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    
    @Override
    public String movingNoise() {
        return "wooooooosh";
    }

    @Override
    public int getMaxNumberOfPassengers() {
        return maxPassengers;
    }

}
