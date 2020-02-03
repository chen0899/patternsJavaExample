package behavioral.observer;

public class PersonObserver {

    private Person person;

    public PersonObserver(Person person) {
        this.person = person;
        this.person.attachObserver(this);
    }

    void notification() {
        System.out.println("person has new weight" + person.weigth);
    }
}
