package behavioral.strategy;

public class Main {

    public static void main(String[] args) {

        ChristmasDiscount christmasDiscount = new ChristmasDiscount();
        EasterDiscount easterDiscount = new EasterDiscount();

        Item item = new Item();

        item.discount(christmasDiscount, 1000.);
        item.discount(easterDiscount, 1000.);
    }
}
