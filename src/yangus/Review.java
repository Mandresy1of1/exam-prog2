package yangus;

import java.time.LocalDate;

public class Review {
    private String reviewerName;
    private int rating;
    private String comment;
    private LocalDate date;

    public Review(String reviewerName, int rating, String comment, LocalDate date) {
        this.reviewerName = reviewerName;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public LocalDate getDate() {
        return date;
    }
}
