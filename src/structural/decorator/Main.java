package structural.decorator;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new Lights(new ChristmasTreeImpl());
        System.out.println(tree2.decorate());

        ChristmasTree tree3 = new Lights(new Garland(new ChristmasTreeImpl()));
        System.out.println(tree3.decorate());
    }
}
