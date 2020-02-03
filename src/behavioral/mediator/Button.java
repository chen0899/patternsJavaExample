package behavioral.mediator;

public class Button {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    void press() {
       mediator.press();
    }
}
