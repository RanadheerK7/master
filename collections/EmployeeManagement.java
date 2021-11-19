package org.stackmybiz.collections;

import java.util.ArrayList;

public class EmployeeManagement {

    ArrayList<Employee> empList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        if (!searchEmployee(employee)) {
            empList.add(employee);
        } else {
            System.out.println("Employee already existed");
        }
    }

    public void deleteEmployee(Employee employee) {
            if (searchEmployee(employee)) {
                empList.remove(employee);
                System.out.println("Employee Deleted");
            }
    }

    public boolean searchEmployee(Employee employee) {
        for (Employee emp : empList) {
            if (emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public void displayAllEmployee() {
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }

    public void displaySpecificEmployee(int empId) {
        for (Employee emp : empList) {
            if (emp.getEmpId() == empId) {
                System.out.println(emp);
            }
        }
    }

}
