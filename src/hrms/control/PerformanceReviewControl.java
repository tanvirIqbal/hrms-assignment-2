package hrms.control;

import hrms.boundary.IPerformanceReviewClient;
import hrms.entity.Employee;
import hrms.entity.PerformanceReview;

import java.util.ArrayList;
import java.util.List;

public class PerformanceReviewControl implements IPerformanceReviewClient {
    private List<PerformanceReview> performanceReviewList;
    private List<Employee> employeeList;

    // Constructor
    public PerformanceReviewControl(List<PerformanceReview> performanceReviewList,  List<Employee> employeeList) {
        this.performanceReviewList = performanceReviewList;
        this.employeeList = employeeList;
    }

    @Override
    public void getEmployeePerformanceReviewDetails(int employeeID) {
        boolean found = false;
        for (PerformanceReview review : performanceReviewList) {
            if (review.getEmployeeId() == employeeID) {
            	if(!found)
            		System.out.println("Employee Name is " + getEmployeeNameByID(review.getEmployeeId()) + " and Line Manager name is " + getEmployeeNameByID(review.getLineManagerId()));
                System.out.println(review.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Performance review data not found");
        }
    }

    @Override
    public void getSubordinateEmployeePerformanceReviewDetails(int lineManagerID, int employeeID) {
        boolean found = false;
        for (PerformanceReview review : performanceReviewList) {
            if (review.getLineManagerId() == lineManagerID && review.getEmployeeId() == employeeID) {
            	if(!found)
            		System.out.println("Employee Name is " + getEmployeeNameByID(review.getEmployeeId()) + " and Line Manager name is " + getEmployeeNameByID(review.getLineManagerId()));
                System.out.println(review.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Performance review data not found");
        }
    }

    @Override
    public void getAllSubordinateEmployeesPerformanceReviewDetails(int lineManagerID) {
        boolean found = false;
        int empId = 0;
        for (PerformanceReview review : performanceReviewList) {
            if (review.getLineManagerId() == lineManagerID) {
            	if(empId !=  review.getEmployeeId())
            	{
            		empId = review.getEmployeeId();
            		System.out.println("Employee Name is " + getEmployeeNameByID(review.getEmployeeId()) + " and Line Manager name is " + getEmployeeNameByID(review.getLineManagerId()));
            	}
                System.out.println(review);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Performance review data not found");
        }
    }
    
    public String getEmployeeNameByID(int employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == employeeID) {
                return employee.getName();
            }
        }
        return "Employee is not found.";
    }
}
