package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {

        ToysFactory toysFactory = new WoodToysFactory();
        ToysFactory toysFactory2 = new TeddyToysFactory();

        System.out.println(toysFactory.getCat("wooden cat"));
        System.out.println(toysFactory2.getCat("teddy cat"));
    }
}
