package yangus;

import java.util.List;

public interface Place {
    String getName();
    Coordinates getCoordinates();
    String getDescription();
    Contact getContactInfo();
    List<Review> getAllReviews();
    void addReview(Review review);


}