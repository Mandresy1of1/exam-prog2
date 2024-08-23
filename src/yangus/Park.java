package yangus;

import java.util.List;

public class Park extends AbstractPlace {
    public Park(String name, Coordinates coordinates, String description, Contact contact) {
        super(name, coordinates, description, contact);
    }

    public void addReview(Review review) {
        super.addReview(review);
    }

    @Override
    public List<Review> getAllReviews() {
        return super.getAllReviews();
    }
}

