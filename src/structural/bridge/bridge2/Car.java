package structural.bridge.bridge2;

/**
 * Created by Illia Chenchak
 */
public abstract class Car {

    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void getEngine();
}
