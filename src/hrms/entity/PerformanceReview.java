package hrms.entity;

import java.util.Date;

public class PerformanceReview {
    private int employeeId;
    private int lineManagerId;
    private Date reviewDate;
    private String feedback;
    private double rating;
    private String goals;

    // Default constructor
    public PerformanceReview() {
    }

    // Constructor with all properties as parameters
    public PerformanceReview(int employeeId, int lineManagerId, Date reviewDate, String feedback, double rating, String goals) {
        this.employeeId = employeeId;
        this.lineManagerId = lineManagerId;
        this.reviewDate = reviewDate;
        this.feedback = feedback;
        this.rating = rating;
        this.goals = goals;
    }

    // Getter and Setter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getLineManagerId() {
        return lineManagerId;
    }

    public void setLineManagerId(int lineManagerId) {
        this.lineManagerId = lineManagerId;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    // toString method
    @Override
    public String toString() {
        return "PerformanceReview {" +
               "\n  Employee ID       : " + employeeId +
               "\n  Line Manager ID   : " + lineManagerId +
               "\n  Review Date       : " + reviewDate +
               "\n  Feedback          : '" + feedback + '\'' +
               "\n  Rating            : " + rating +
               "\n  Goals             : '" + goals + '\'' +
               "\n}";
    }

}
