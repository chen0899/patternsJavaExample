package creational.builder;

public class Main {

    public static void main(String[] args) {

        Car sportCar = new CarBuilder().setType("sport").setMaxSpeed(300).build();
        Car regular = new CarBuilder().setType("regular").setMaxSpeed(100).build();

        //second solution
        Car sportCar2 = new CarBuilder2().setType("sport").setMaxSpeed(300).build();
        Car regular2 = new CarBuilder2().setType("regular").setMaxSpeed(100).build();
    }
}
