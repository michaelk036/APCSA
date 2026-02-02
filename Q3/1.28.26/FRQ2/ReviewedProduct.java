public class ReviewedProduct {
    private String name;
    private int totalReviews = 0;
    private int totalStars = 0;
    private int oneStarCount = 0;

    public static void main(String[] args) {
        ReviewedProduct pr = new ReviewedProduct("Widget");
        pr.avgStars();
        pr.addReview(1);
        pr.isBad();
        System.out.println(pr);

    }
    
    public ReviewedProduct(String name) {

    }

    public void addReview(int stars) {
        totalReviews++;
        totalStars += stars;

        if (stars == 1) {
            oneStarCount++;
        }
    }

    public double avgStars() {
        double avg = (double) totalStars / totalReviews;
        return avg;
    }

    public boolean isBad() {
        if (totalReviews < 3) {
            return false;
        }
        return oneStarCount >= totalReviews / 2;
    }

    public String toString() {
        return name + " " + avgStars() + " stars";
    }
}



/*
- all variables private
- all methods public
- just use `public`, `void` if it doesn't return anything, `int` `boolean` `double` `String` as return types

- only 2-3 lines in each method - simple programs
 */