package hrms.boundary;

public interface ILeaveRequestClient {
    void getEmployeeLeaveRequestDetails(int employeeId);
    void getSubordinateEmployeeLeaveRequestDetails(int lineManagerId, int employeeId);
    void getAllSubordinateEmployeesLeaveRequestDetails(int lineManagerId);
}

