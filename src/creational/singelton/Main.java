package creational.singelton;

public class Main {

    public static void main(String[] args) {

        Student student1 = Student.getInstance("name1", "last1", 22);

        Student student2 = Student.getInstance();

        System.out.println(student1.equals(student2));

    }
}
