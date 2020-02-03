package structural.flyweigt.flyweigt_2;

/**
 * Created by Illia Chenchak
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car(Color.YELLOW);
        Car car2 = new Car(Color.YELLOW);
        Car car3 = new Car(Color.RED);

        System.out.println(CarFactory.factoryMethod(Color.YELLOW).hashCode());
        System.out.println(CarFactory.factoryMethod(Color.YELLOW).hashCode());
        System.out.println(CarFactory.factoryMethod(Color.RED).hashCode());
    }
}
