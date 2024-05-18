package hrms.control;

import boundary.IPerformanceReviewClient;
import entity.PerformanceReview;
import java.util.List;

public class PerformanceReviewControl implements IPerformanceReviewClient {

    @Override
    public List<PerformanceReview> createPerformanceReviews() {
        return HardcodedPerformanceReview.getHardcodedReviews();
    }
}
