package hrms.control;

import java.util.List;

import hrms.boundary.IAttendanceClient;
import hrms.entity.Attendance;
import hrms.entity.Employee;

import java.util.ArrayList;

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
                System.out.println(attendance);
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
        for (Attendance attendance : attendanceList) {
            if (attendance.getLineManagerID() == lineManagerID) {
                System.out.println(attendance);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Attendance data not found");
        }
    }
}
