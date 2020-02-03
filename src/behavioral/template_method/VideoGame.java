package behavioral.template_method;

public class VideoGame extends Game{

    @Override
    void init() {
        System.out.println("on pc");
    }

    @Override
    void start() {
        System.out.println("Start video game");
    }

    @Override
    void finish() {
        System.out.println("off pc");
    }
}
