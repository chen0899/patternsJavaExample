package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        PersonObserver personObserver = new PersonObserver(p);

        p.changeWeigth(10);
        p.changeWeigth(20);

    }

}
