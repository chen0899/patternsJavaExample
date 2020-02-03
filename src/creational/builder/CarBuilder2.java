package creational.builder;

public class CarBuilder2 {

    String type;
    Integer maxSpeed;

    CarBuilder2 setType (String type) {
        this.type = type;
        return this;
    }

    CarBuilder2 setMaxSpeed (Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    Car build () {
        return new Car(type,maxSpeed);
    }


}
