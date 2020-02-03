package creational.prototype;

public class Dev extends Human{

    String work;

    public Dev(String name, Integer age, String sex, String work) {
        super(name, age, sex);
        this.work = work;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "work='" + work + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
