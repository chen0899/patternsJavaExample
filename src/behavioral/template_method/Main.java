package behavioral.template_method;

public class Main {

    public static void main(String[] args) {

        Game video = new VideoGame();
        Game foot = new Football();

        video.play();
        foot.play();
    }
}
