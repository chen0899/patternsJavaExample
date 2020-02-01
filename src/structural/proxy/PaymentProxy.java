package structural.proxy;

import static java.util.Objects.isNull;

/**
 * Created by Illia Chenchak
 */
public class PaymentProxy implements Payment {

    private static Payment payment;

    @Override
    public void pay() {

        if (isNull(payment)) {
            payment = new PaymentImpl();
        }

        payment.pay();
    }
}
