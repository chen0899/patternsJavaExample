package behavioral.mediator;

/**
 * Created by Illia Chenchak
 */
public class Fan {

    private boolean isOn = false;

    private Mediator mediator;

    public void on() {
        System.out.println("Fan on");
        mediator.start();
        isOn = true;
    }

    public void off() {
        System.out.println("Fan off");
        isOn = false;
        mediator.stop();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
