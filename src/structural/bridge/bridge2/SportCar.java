package structural.bridge.bridge2;

/**
 * Created by Illia Chenchak
 */
public class SportCar extends Car{

    public SportCar(Engine engine) {
        super(engine);
    }

    @Override
    public void getEngine() {
        System.out.println("sport car with " + engine.getEngineName());
    }
}
