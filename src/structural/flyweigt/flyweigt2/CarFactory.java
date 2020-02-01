package structural.flyweigt.flyweigt2;

import java.util.HashMap;

import static java.util.Objects.isNull;

/**
 * Created by Illia Chenchak
 */
public class CarFactory {

    private static HashMap<Color, Car> cars = new HashMap<>();

    static Car factoryMethod(Color color) {

        if (isNull(cars.get(color))) {
            Car newCar = new Car(color);
            cars.put(color, newCar);
        }

        return cars.get(color);
    }

}
