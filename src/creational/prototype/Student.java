package creational.prototype;

public class Student extends Human{

    String university;

    public Student(String name, Integer age, String sex, String university) {
        super(name, age, sex);
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
