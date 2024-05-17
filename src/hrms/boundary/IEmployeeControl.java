package hrms.boundary;

public interface IEmployeeControl {
    void getEmployeeDetails(int employeeId);
    void getSubordinateEmployeeDetails(int lineManagerId, int employeeId);
    void getAllSubordinateEmployeesDetails(int lineManagerId);
}

