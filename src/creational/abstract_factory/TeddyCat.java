package creational.abstract_factory;

public class TeddyCat extends Cat{

    private String name;

    public TeddyCat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeddyCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
