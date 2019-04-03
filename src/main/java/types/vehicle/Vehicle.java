package types.vehicle;

import io.vavr.collection.List;

public interface Vehicle {
    
    public String movingNoise();
    
    public int getMaxNumberOfPassengers();
    
    
    public static void main(String[] args) {
        List<Vehicle> list = List.of(new Car(4,6), new Airplane(2));
        list.forEach(v -> System.out.println(v.movingNoise()));
        list.forEach(v -> System.out.println(v.getMaxNumberOfPassengers()));
        
//        Vehicle car = new Car(15);
//        car.getNumberOfWheels();
        Car car2 = new Car(15, 83);
        car2.getNumberOfWheels();
        System.out.println(car2.getNumberOfWheels());
    }

}
