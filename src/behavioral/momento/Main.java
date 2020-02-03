package behavioral.momento;

public class Main {

    public static void main(String[] args) {

        EmployeeCare employeeCare = new EmployeeCare();

        Employee employee = new Employee("Name", "2222");

        employeeCare.save(employee);
        System.out.println(employee);
        employee.setName("Nam2");
        employee.setPhone("Nam2");
        employeeCare.save(employee);
        System.out.println(employee);
        employeeCare.undo(employee);
        System.out.println(employee);
        employeeCare.undo(employee);
        System.out.println(employee);

    }

}
