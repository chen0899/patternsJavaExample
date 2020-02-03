package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<Human> humans = new ArrayList<>();
        List<Human> humansCopy = new ArrayList<>();

        humans.add(new Dev("Ivan",30,"male","Codelions"));
        humans.add(new Student("Ivan",12,"male","LNU"));

        for (Human human: humans) {
            humansCopy.add((Human) human.clone());
        }

        System.out.println(humans.toString());
        System.out.println(humansCopy.toString());

    }
}
