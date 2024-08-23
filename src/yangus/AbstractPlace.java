package yangus;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractPlace implements Place, Reviewable {
    private String name;
    private Coordinates coordinates;
    private String description;
    private Contact contact;
    private List<Review> reviews = new ArrayList<>();

public AbstractPlace(String name, Coordinates coordinates, String description, Contact contact) {
    this.name = name;
    this.coordinates = coordinates;
    this.description = description;
    this.contact = contact;
}

public String getName() {
    return name;
}

public Coordinates getCoordinates() {
    return coordinates;
}

public String getDescription() {
    return description;
}

public Contact getContactInfo() {
    return contact;
}

    public abstract List<Room> getRooms();

    public abstract double findCheapestHotelPrice();

    public void addReview(Review review) {
    reviews.add(review);
}

public List<Review> getAllReviews() {
    return reviews;
}
}