package creational.abstract_factory;

public class WoodenCat extends Cat{
    private String name;

    public WoodenCat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WoodenCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
