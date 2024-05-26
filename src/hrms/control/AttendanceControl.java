package hrms.control;

import java.util.List;

import hrms.boundary.IAttendanceClient;
import hrms.entity.Attendance;
import hrms.entity.Employee;

public class AttendanceControl  implements IAttendanceClient {
	private List<Attendance> attendanceList;
    private List<Employee> employeeList;

    // Constructor
    public AttendanceControl(List<Attendance> attendanceList, List<Employee> employeeList) {
        this.attendanceList = attendanceList;
        this.employeeList = employeeList;
    }

    @Override
    public void getEmployeeAttendanceDetails(int employeeID) {
        boolean found = false;
        for (Attendance attendance : attendanceList) {
            if (attendance.getEmployeeID() == employeeID) {
            	if(!found)
            		System.out.println("Employee Name is " + getEmployeeNameByID(attendance.getEmployeeID()) + " and Line Manager name is " + getEmployeeNameByID(attendance.getLineManagerID()));
                System.out.println(attendance.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Attendance data not found");
        }
    }

    @Override
    public void getSubordinateEmployeeAttendanceDetails(int lineManagerID, int employeeID) {
        boolean found = false;
        
        for (Attendance attendance : attendanceList) {
            if (attendance.getLineManagerID() == lineManagerID && attendance.getEmployeeID() == employeeID) {
            	if(!found)
            		System.out.println("Employee Name is " + getEmployeeNameByID(attendance.getEmployeeID()) + " and Line Manager name is " + getEmployeeNameByID(attendance.getLineManagerID()));
                System.out.println(attendance.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Attendance data not found");
        }
    }

    @Override
    public void getAllSubordinateEmployeesAttendanceDetails(int lineManagerID) {
        boolean found = false;
        int empId = 0;
        for (Attendance attendance : attendanceList) {
            if (attendance.getLineManagerID() == lineManagerID) {
            	if(empId !=  attendance.getEmployeeID())
            	{
            		empId = attendance.getEmployeeID();
            		System.out.println("Employee Name is " + getEmployeeNameByID(attendance.getEmployeeID()) + " and Line Manager name is " + getEmployeeNameByID(attendance.getLineManagerID()));
            	}
                System.out.println(attendance.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Attendance data not found");
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