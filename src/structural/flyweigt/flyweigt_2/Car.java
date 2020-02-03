package structural.flyweigt.flyweigt_2;

import java.util.Objects;

public class Car {

    public Car(Color color) {
        this.color = color;
    }

    private Color color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
