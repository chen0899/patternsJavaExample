package structural.proxy;

/**
 * Created by Illia Chenchak
 */
public class PaymentImpl implements Payment{

    public PaymentImpl() {
        init();
    }

    @Override
    public void pay() {
        System.out.println("payment finished");
    }

    private void init () {
        System.out.println("payment initializing");
    }
}
