package creational.singelton;

public final class Student {

    private String firstName;
    private String lastName;
    private Integer age;

    private static Student instance;

    private Student() {
    }

    public static Student getInstance(String firstName, String lastName, Integer age) {
        if (instance == null) {
            instance = new Student();
            instance.firstName = firstName;
            instance.lastName = lastName;
            instance.age = age;
        }
        return instance;
    }

    public static Student getInstance() {
        return instance;
    }

}
