package structural.composite.composite_2;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {

        Class phi = new PhisicClass();
        Class math = new MathClass();

        HeadClass head = new HeadClass();

        head.addClass(phi);
        head.addClass(math);

        head.getClassName();
    }
}
