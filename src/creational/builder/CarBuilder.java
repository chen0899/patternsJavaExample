package creational.builder;

public class CarBuilder {

    Car car = new Car();

    CarBuilder setType(String type) {
        this.car.type = type;
        return this;
    }

    CarBuilder setMaxSpeed(Integer maxSpeed) {
        this.car.maxSpeed = maxSpeed;
        return this;
    }

    Car build () {
        return car;
    }
}
