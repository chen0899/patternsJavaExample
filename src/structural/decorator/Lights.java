package structural.decorator;

/**
 * Created by Illia Chenchak
 */
public class Lights extends TreeDecorator {

    public Lights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with lights";
    }
}
