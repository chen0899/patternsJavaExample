package behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Button button = new Button();
        button.setMediator(mediator);
        Fan fan = new Fan();
        fan.setMediator(mediator);
        PowerSuplier powerSuplier = new PowerSuplier();
        powerSuplier.setMediator(mediator);
        mediator.setFan(fan);
        mediator.setPowerSuplier(powerSuplier);

        button.press();
        button.press();
        button.press();
    }
}
