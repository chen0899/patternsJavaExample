package behavioral.template_method;

public class Football extends Game{

    @Override
    void init() {
        System.out.println("take a ball and create team");
    }

    @Override
    void start() {
        System.out.println("Football starts");
    }

    @Override
    void finish() {
        System.out.println("Football has finished");
    }
}
