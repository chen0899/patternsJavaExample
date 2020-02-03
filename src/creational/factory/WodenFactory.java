package creational.factory;

public class WodenFactory implements ToysFactory{

    @Override
    public void setType() {
        System.out.println("wooden");
    }

    @Override
    public void setCountry() {
        System.out.println("Kanada");
    }
}
