package hrms.boundary;

public interface IEmployeeClient {
    void getEmployeeDetails(int employeeId);
    void getSubordinateEmployeeDetails(int lineManagerId, int employeeId);
    void getAllSubordinateEmployeesDetails(int lineManagerId);
}

