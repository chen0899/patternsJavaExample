package creational.factory;

public class SoftFactory implements ToysFactory {

    @Override
    public void setType() {
        System.out.println("soft");
    }

    @Override
    public void setCountry() {
        System.out.println("Ukraine");
    }
}
