package creational.factory;

public class FactoryProcessor {

    ToysFactory getFactory(String input) {
        if (input.equals("soft")) {
            return new SoftFactory();
        }
        return new WodenFactory();
    }
}
