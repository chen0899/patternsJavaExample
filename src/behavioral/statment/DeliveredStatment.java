package behavioral.statment;

public class DeliveredStatment implements PackageStatment{

    @Override
    public void next() {
        System.out.println("No next");
    }

    @Override
    public void previous() {
        new TrasportedStatment().previous();
    }

    @Override
    public void currentInfo() {
        System.out.println("Delivered");
    }
}
