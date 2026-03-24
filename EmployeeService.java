import java.util.*;

class EmployeeService {
    private ArrayList<Employee> list = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee e) {
        list.add(e);
        System.out.println("Employee Added!");
    }

    // View Employees
    public void viewEmployees() {
        if (list.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e : list) {
                e.display();
            }
        }
    }

    // Search Employee
    public Employee searchEmployee(int id) {
        for (Employee e : list) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    // Update Employee
    public void updateEmployee(int id, String name, double salary) {
        Employee e = searchEmployee(id);
        if (e != null) {
            e.setName(name);
            e.setSalary(salary);
            System.out.println("Employee Updated!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        Employee e = searchEmployee(id);
        if (e != null) {
            list.remove(e);
            System.out.println("Employee Deleted!");
        } else {
            System.out.println("Employee not found.");
        }
    }
}