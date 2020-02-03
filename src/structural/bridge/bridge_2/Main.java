package structural.bridge.bridge_2;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {
        Car sport = new SportCar(new Engine("V8"));
        sport.getEngine();
        Car sport2 = new SportCar(new Engine("V12"));
        sport2.getEngine();
        Car normal = new RegularCar(new Engine("V12"));
        normal.getEngine();
        Car norma2 = new RegularCar(new Engine("V8"));
        norma2.getEngine();
    }
}
