//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);
        ems.addEmployee(new Employee("E001", "Alice", "Manager", 70000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 50000));
        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 45000));
        ems.addEmployee(new Employee("E004", "David", "Tester", 40000));
        ems.addEmployee(new Employee("E005", "Eve", "Support", 35000));
        System.out.println("All employees:");
        ems.traverseEmployees();
        System.out.println("\nSearching for employee E003:");
        Employee employee = ems.searchEmployee("E003");
        if (employee != null) {
            System.out.println("Found: Employee ID: " + employee.getEmployeeId() +
                    ", Name: " + employee.getName() +
                    ", Position: " + employee.getPosition() +
                    ", Salary: " + employee.getSalary());
        } else {
            System.out.println("Employee not found.");
        }
        System.out.println("\nDeleting employee E002:");
        ems.deleteEmployee("E002");
        System.out.println("\nAll employees after deletion:");
        ems.traverseEmployees();
    }
}