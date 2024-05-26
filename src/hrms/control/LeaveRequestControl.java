package hrms.control;

import java.util.List;

import hrms.boundary.ILeaveRequestClient;
import hrms.entity.Attendance;
import hrms.entity.Employee;
import hrms.entity.LeaveRequest;
import hrms.entity.LeaveType;

public class LeaveRequestControl implements ILeaveRequestClient {
    private List<Employee> employees;
    private List<LeaveType> leaveTypes;
    private List<LeaveRequest> leaveRequests;

    // Default constructor
    public LeaveRequestControl() {}

    // Parameterized constructor
    public LeaveRequestControl(List<Employee> employees, List<LeaveType> leaveTypes, List<LeaveRequest> leaveRequests) {
        this.employees = employees;
        this.leaveTypes = leaveTypes;
        this.leaveRequests = leaveRequests;
    }

    
    @Override
    public void getEmployeeLeaveRequestDetails(int employeeID) {
        boolean found = false;
        for (LeaveRequest leaveRequest : leaveRequests) {
            if (leaveRequest.getEmployeeId() == employeeID) {
            	if(!found)
            		System.out.println("Employee Name is " + getEmployeeNameByID(leaveRequest.getEmployeeId()) + " and Line Manager name is " + getEmployeeNameByID(leaveRequest.getEmployeeId()));
                System.out.println(leaveRequest.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("LeaveRequest data not found");
        }
    }

    
    
    @Override
    public void getSubordinateEmployeeLeaveRequestDetails(int lineManagerID, int employeeID) {
        boolean found = false;
        
        for (LeaveRequest leaveRequest : leaveRequests) {
            if (leaveRequest.getLineManagerId() == lineManagerID && leaveRequest.getEmployeeId() == employeeID) {
            	if(!found)
            		System.out.println("Employee Name is " + getEmployeeNameByID(leaveRequest.getEmployeeId()) + " and Line Manager name is " + getEmployeeNameByID(leaveRequest.getLineManagerId()));
                System.out.println(leaveRequest.toString());
                found = true;
            }
        }
        if (!found) {
        	System.out.println("LeaveRequest data not found for EmployeeId: " + employeeID + " and LineManagerId: " + lineManagerID);
        }
    }

    
    
    @Override
    public void getAllSubordinateEmployeesLeaveRequestDetails(int lineManagerID) {
        boolean found = false;
        int empId = 0;
        for (LeaveRequest leaveRequest : leaveRequests) {
            if (leaveRequest.getLineManagerId() == lineManagerID) {
            	if(empId !=  leaveRequest.getEmployeeId())
            	{
            		empId = leaveRequest.getEmployeeId();
            		System.out.println("Employee Name is " + getEmployeeNameByID(leaveRequest.getEmployeeId()) + " and Line Manager name is " + getEmployeeNameByID(leaveRequest.getLineManagerId()));
            	}
                System.out.println(leaveRequest.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("LeaveRequest data not found");
        }
    }
    
    
    private String getEmployeeNameByID(int employeeID) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeID) {
                return employee.getName();
            }
        }
        return "Unknown";
    }
    
}

