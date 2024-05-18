package hrms.boundary;

import hrms.entity.PerformanceReview;
import java.util.List;

public interface IPerformanceReviewClient {
    void getEmployeePerformanceReviewDetails(int employeeID);
    void getSubordinateEmployeePerformanceReviewDetails(int lineManagerID, int employeeID);
    void getAllSubordinateEmployeesPerformanceReviewDetails(int lineManagerID);
}
