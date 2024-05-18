package boundary;

import entity.PerformanceReview;

import java.util.List;

public interface IPerformanceReviewClient {
    List<PerformanceReview> createPerformanceReviews();
}
