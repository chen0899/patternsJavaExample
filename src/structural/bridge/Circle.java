package structural.bridge;

/**
 * Created by Illia Chenchak
 */
public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " circle";
    }
}
