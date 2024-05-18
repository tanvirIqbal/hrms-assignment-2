package hrms.control;

import boundary.IPerformanceReviewClient;
import entity.PerformanceReview;

import java.util.ArrayList;
import java.util.List;

public class PerformanceReviewControl implements IPerformanceReviewClient {
    private List<PerformanceReview> performanceReviewList;

    // Constructor
    public PerformanceReviewControl(List<PerformanceReview> performanceReviewList) {
        this.performanceReviewList = performanceReviewList;
    }

    @Override
    public void getEmployeePerformanceReviewDetails(int employeeID) {
        boolean found = false;
        for (PerformanceReview review : performanceReviewList) {
            if (review.getEmployeeId() == employeeID) {
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
                System.out.println(review);
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
        for (PerformanceReview review : performanceReviewList) {
            if (review.getLineManagerId() == lineManagerID) {
                System.out.println(review);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Performance review data not found");
        }
    }
}
