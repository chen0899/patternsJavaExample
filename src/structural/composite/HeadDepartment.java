package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Illia Chenchak
 */
public class HeadDepartment implements Department{

    List<Department> childDepartments;

    public HeadDepartment() {
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }


}
