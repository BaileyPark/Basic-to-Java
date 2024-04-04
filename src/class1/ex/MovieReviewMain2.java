package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        MovieReview aboutTime = new MovieReview();

        MovieReview[] review = {inception, aboutTime};

        review[0].title = "인셉션";
        review[0].review = "인생은 무한 루프";

        review[1].title = "어바웃 타임";
        review[1].review = "인생 시간 영화!";

        for (MovieReview m : review) {
            System.out.println("영화 제목: " + m.title + " 리뷰: " + m.review);
        }

    }
}
