package structural.bridge;

/**
 * Created by Illia Chenchak
 */
public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return color.fill() + " rectangle ";
    }
}
