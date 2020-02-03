package creational.prototype;

public abstract class Human implements Cloneable{

    String name;
    Integer age;
    String sex;

    public Human(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
