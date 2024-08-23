package yangus;


import java.util.ArrayList;
import java.util.List;

public class Hotel extends AbstractPlace {
        private List<Room> rooms;

        public Hotel(String name, Coordinates coordinates, String description, Contact contact) {
            super(name, coordinates, description, contact);
            this.rooms = new ArrayList<>();
        }

        @Override
        public List<Room> getRooms() {
            return rooms;
        }

        public void addRoom(Room room) {
            rooms.add(room);
        }

        @Override
        public double findCheapestHotelPrice() {
            return rooms.stream()
                    .mapToDouble(Room::getPricePerNight)
                    .min()
                    .orElse(Double.MAX_VALUE);
        }

        @Override
        public void addReview(Review review) {
            super.addReview(review);
        }

        @Override
        public List<Review> getAllReviews() {
            return super.getAllReviews();
        }

}
