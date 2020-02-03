package behavioral.strategy;

public class Item {

    void discount (Discount discount, Double amount) {
        discount.calc(amount);
    }
}
