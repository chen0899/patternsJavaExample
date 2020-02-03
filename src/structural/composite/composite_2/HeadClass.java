package structural.composite.composite_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Illia Chenchak
 */
public class HeadClass implements Class{

    List<Class> classes;

    public HeadClass() {
        this.classes = new ArrayList<>();
    }

    @Override
    public void getClassName() {
        classes.forEach(Class::getClassName);
    }

    public void addClass (Class clas) {
        classes.add(clas);
    }
}
