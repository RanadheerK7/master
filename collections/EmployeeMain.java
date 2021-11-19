package org.stackmybiz.collections;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Aneesh", 50000.0);
        Employee employee2 = new Employee(2, "Mahipal", 55000.0);
        Employee employee3 = new Employee(3, "Kalyan", 60000.0);
        Employee employee4 = new Employee(4, "Uday", 57000.0);
        Employee employee5 = new Employee(5, "Rohith", 59000.0);

        EmployeeManagement management = new EmployeeManagement();
        management.addEmployee(employee1);
        management.addEmployee(employee2);
        management.addEmployee(employee3);
        management.addEmployee(employee4);
        management.addEmployee(employee5);

        System.out.println("Is Employee Exist? " + management.searchEmployee(employee1));

        management.deleteEmployee(employee5);

        management.displayAllEmployee();

        management.displaySpecificEmployee(3);
    }
}
