package behavioral.strategy;

public class EasterDiscount implements Discount{

    static Double discount = 100.;

    @Override
    public void calc(Double amount) {
        String amountWithDiscount = "Your amount with discount ".concat(String.valueOf(amount - discount));
        System.out.println(amountWithDiscount);
    }
}
