public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;
    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }
    // Method to search for an employee by employeeId
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }
    // Method to traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println("Employee ID: " + employees[i].getEmployeeId() +
                    ", Name: " + employees[i].getName() +
                    ", Position: " + employees[i].getPosition() +
                    ", Salary: " + employees[i].getSalary());
        }
    }
    // Method to delete an employee by employeeId
    public void deleteEmployee(String employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            // Shift elements to the left to fill the gap
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[count - 1] = null;
            count--;
        } else {
            System.out.println("Employee not found.");
        }
    }
}
