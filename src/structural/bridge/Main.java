package structural.bridge;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {

        Shape circle1 = new Circle(new Blue());
        Shape circle2 = new Circle(new Red());
        Shape rectangle1 = new Rectangle(new Red());
        Shape rectangle2 = new Rectangle(new Blue());

        System.out.println(circle1.draw());
        System.out.println(circle2.draw());
        System.out.println(rectangle1.draw());
        System.out.println(rectangle2.draw());
    }
}
