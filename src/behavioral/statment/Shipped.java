package behavioral.statment;

public class Shipped implements PackageStatment{

    @Override
    public void next() {
        new TrasportedStatment().currentInfo();
    }

    @Override
    public void previous() {
        System.out.println("No Previous");
    }

    @Override
    public void currentInfo() {
        System.out.println("package shipped");
        next();
    }
}
