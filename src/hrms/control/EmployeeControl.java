package hrms.control;

import java.util.List;

import hrms.boundary.IEmployeeClient;
import hrms.entity.Employee;

public class EmployeeControl implements IEmployeeClient {
    private List<Employee> employees;

    // Constructor
    public EmployeeControl(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void getEmployeeDetails(int employeeId) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getEmployeeId() == employeeId) {
                System.out.println(emp.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    @Override
    public void getSubordinateEmployeeDetails(int lineManagerId, int employeeId) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getLineManagerId() == lineManagerId && emp.getEmployeeId() == employeeId) {
                System.out.println(emp.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    @Override
    public void getAllSubordinateEmployeesDetails(int lineManagerId) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getLineManagerId() == lineManagerId) {
                System.out.println(emp.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}

