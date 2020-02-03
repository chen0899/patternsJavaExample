package creational.abstract_factory;

public class WoodToysFactory implements ToysFactory {

    @Override
    public Cat getCat(String name) {
        return new WoodenCat(name);
    }
}
