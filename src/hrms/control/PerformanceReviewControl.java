package control;

import entity.PerformanceReview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PerformanceReviewControl {

    // Function to create a list of 6 hard-coded PerformanceReview records
    public List<PerformanceReview> createPerformanceReviews() {
        List<PerformanceReview> reviews = new ArrayList<>();

        reviews.add(new PerformanceReview(101, 201, new Date(), "Excellent performance", 4.8, "Lead new projects"));
        reviews.add(new PerformanceReview(102, 202, new Date(), "Good job overall", 4.0, "Enhance teamwork skills"));
        reviews.add(new PerformanceReview(103, 203, new Date(), "Satisfactory work", 3.5, "Improve punctuality"));
        reviews.add(new PerformanceReview(104, 204, new Date(), "Needs improvement", 2.8, "Focus on technical skills"));
        reviews.add(new PerformanceReview(105, 205, new Date(), "Outstanding contribution", 5.0, "Mentor new employees"));
        reviews.add(new PerformanceReview(106, 206, new Date(), "Below expectations", 2.0, "Develop better time management"));

        return reviews;
    }
}
