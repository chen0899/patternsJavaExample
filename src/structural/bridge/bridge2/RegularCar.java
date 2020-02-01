package structural.bridge.bridge2;

/**
 * Created by Illia Chenchak
 */
public class RegularCar extends Car{

    public RegularCar(Engine engine) {
        super(engine);
    }

    @Override
    public void getEngine() {
        System.out.println("Normal car with " + engine.getEngineName());
    }
}
