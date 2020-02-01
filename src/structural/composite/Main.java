package structural.composite;

/**
 * Created by Illia Chenchak
 */
public class Main {

    public static void main(String[] args) {

        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(new SalesDepartment());
        headDepartment.addDepartment(new FinanceDepartment());
        headDepartment.printDepartmentName();
    }
}
