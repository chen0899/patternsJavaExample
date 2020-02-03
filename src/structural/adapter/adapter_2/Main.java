package structural.adapter.adapter_2;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {
        Rozetka american = new American();
        Rozetka europe = new RozetkaAdapterImpl();

        System.out.println("american = " + american.getVoltage());
        System.out.println("europe = " + europe.getVoltage());
    }
}
