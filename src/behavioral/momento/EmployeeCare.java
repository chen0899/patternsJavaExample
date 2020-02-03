package behavioral.momento;

import java.util.Stack;

public class EmployeeCare {

    Stack<Employee.Memento> stack = new Stack<>();

    public void save(Employee employee) {
        stack.push(employee.save());
    }

    public void undo(Employee memento) {
        memento.undo(stack.pop());
    }


}
