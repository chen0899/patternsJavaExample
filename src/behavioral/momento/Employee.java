package behavioral.momento;

public class Employee {

    private String name;
    private String phone;

    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Memento save() {
        return new Memento(name, phone);
    }

    public void undo(Memento memento) {
        this.name = memento.name;
        this.phone = memento.phone;
    }

    public class Memento {
        private String name;
        private String phone;

        public Memento(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
