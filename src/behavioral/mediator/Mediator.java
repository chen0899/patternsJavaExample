package behavioral.mediator;

public class Mediator {

    private Fan fan;
    private PowerSuplier powerSuplier;

    void start() {
        powerSuplier.on();
    }

    void stop() {
        powerSuplier.off();
    }

    void press() {
        if (fan.isOn()) {
            fan.off();
        } else {
            fan.on();
        }
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public PowerSuplier getPowerSuplier() {
        return powerSuplier;
    }

    public void setPowerSuplier(PowerSuplier powerSuplier) {
        this.powerSuplier = powerSuplier;
    }
}
