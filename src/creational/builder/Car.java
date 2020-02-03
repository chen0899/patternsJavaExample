package creational.builder;

public class Car {

    String type;
    Integer maxSpeed;

    public Car() {
    }

    public Car(String type, Integer maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
