package hrms.boundary;

public interface IAttendanceClient {
	 void getEmployeeAttendanceDetails(int employeeID);
	 void getSubordinateEmployeeAttendanceDetails(int lineManagerID, int employeeID);
	 void getAllSubordinateEmployeesAttendanceDetails(int lineManagerID);
}
