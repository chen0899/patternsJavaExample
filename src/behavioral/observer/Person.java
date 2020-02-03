package behavioral.observer;

public class Person {

    int weigth;


    PersonObserver personObserver;

    void changeWeigth(int weigth) {
        this.weigth = weigth;
        personObserver.notification();
    }

    void attachObserver(PersonObserver personObserver){
        this.personObserver = personObserver;
    }
}
