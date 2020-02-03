package behavioral.mediator;

public class PowerSuplier {

    private Mediator mediator;
    private boolean isOn = false;

    void on() {
        System.out.println("Suplier on");
        isOn = true;
    }

    void off() {
        System.out.println("Suplier off");
        isOn = false;
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
