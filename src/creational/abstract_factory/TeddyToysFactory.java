package creational.abstract_factory;

public class TeddyToysFactory implements ToysFactory{

    @Override
    public Cat getCat(String name) {
        return new TeddyCat(name);
    }
}
