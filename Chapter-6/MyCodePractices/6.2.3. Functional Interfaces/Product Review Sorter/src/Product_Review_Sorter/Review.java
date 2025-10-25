package Product_Review_Sorter;

import java.time.LocalDate;

public class Review {
    private String product;
    private int rating;
    private LocalDate reviewDate;

    public Review(String product, int rating, LocalDate reviewDate) {
        this.product = product;
        this.rating = rating;
        this.reviewDate = reviewDate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "product='" + product + '\'' +
                ", rating=" + rating +
                ", reviewDate=" + reviewDate +
                '}';
    }
}
