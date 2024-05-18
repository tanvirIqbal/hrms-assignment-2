import control.PerformanceReviewControl;
import entity.PerformanceReview;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PerformanceReviewControl control = new PerformanceReviewControl();
        List<PerformanceReview> reviews = control.createPerformanceReviews();

        for (PerformanceReview review : reviews) {
            System.out.println(review);
        }
    }
}
