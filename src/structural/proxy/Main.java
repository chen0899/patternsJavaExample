package structural.proxy;

public class Main {

    public static void main(String[] args) {

        Payment payment = new PaymentProxy();

        payment.pay();
        payment.pay();

    }
}
