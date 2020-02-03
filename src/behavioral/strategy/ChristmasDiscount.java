package behavioral.strategy;

public class ChristmasDiscount implements Discount{

    static Double discount = 200.;

    @Override
    public void calc(Double amount) {
        String amountWithDiscount = "Your amount with discount ".concat(String.valueOf(amount - discount));
        System.out.println(amountWithDiscount);

    }
}
