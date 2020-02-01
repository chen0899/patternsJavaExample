package structural.adapter;

/**
 * Created by Illia Chenchak
 */
public class Main {
    public static void main(String[] args) {

        Movable bugattiVeyron = new Bugati();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println("mph " + bugattiVeyron.getSpeed());
        System.out.println("kmph " + bugattiVeyronAdapter.getSpeed());
    }
}
