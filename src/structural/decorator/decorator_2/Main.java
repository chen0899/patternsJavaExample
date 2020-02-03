package structural.decorator.decorator_2;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Sport(new CarImpl());
        Car car2 = new Sport(new Regular(new CarImpl()));
        System.out.println(car.vehicleDecorate());
        System.out.println(car2.vehicleDecorate());
    }
}
