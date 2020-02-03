package behavioral.template_method;

public abstract class Game {

    abstract void init();
    abstract void start();
    abstract void finish();
    void play() {
        init();
        start();
        finish();
    }
}
