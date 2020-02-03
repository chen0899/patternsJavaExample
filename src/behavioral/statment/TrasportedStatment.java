package behavioral.statment;

public class TrasportedStatment implements PackageStatment{

    @Override
    public void next() {
        new DeliveredStatment().currentInfo();
    }

    @Override
    public void previous() {
        new Shipped().currentInfo();
    }

    @Override
    public void currentInfo() {
        System.out.println("Transporting");
        next();
    }
}
