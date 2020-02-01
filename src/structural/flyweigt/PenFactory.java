package structural.flyweigt;

import java.util.HashMap;

/**
 * Created by Illia Chenchak
 */
public class PenFactory {

    private static final HashMap<String, Pen> pensMap = new HashMap<>();

    public static Pen getThinPen(String color)
    {
        String key = color + "-THIN";

        Pen pen = pensMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new ThinPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }

        return pen;
    }

    public static Pen getMediumPen(String color)
    {
        String key = color + "-MEDIUM";

        Pen pen = pensMap.get(key);

        if(pen != null) {
            return pen;
        } else {
            pen = new MediumPen();
            pen.setColor(color);
            pensMap.put(key, pen);
        }

        return pen;
    }
}
