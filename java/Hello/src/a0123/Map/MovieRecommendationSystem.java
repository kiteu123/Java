package a0123.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRecommendationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> movies = new HashMap<>();
        movies.put("인터스텔라", 9.2);
        movies.put("어벤져스", 8.5);
        movies.put("기생충", 9.0);
        movies.put("겨울왕국", 8.7);
        movies.put("토이스토리", 9.1);
        movies.put("라라랜드", 8.8);
        movies.put("매트릭스", 8.9);

        HashMap<String, Double> movieRatings = new HashMap<>();

        System.out.println("=== 영화 평점 입력 === ");
        System.out.println("영화를 보고 평점을 입력하세요. (종료: '종료') > ");

        while (true) {
            System.out.println("\n === 영화 목록 ===");
            for (Map.Entry<String, Double> entry : movies.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("\n평점을 입력할 영화명을 입력하세요. (종료: '종료') > ");
            String movieTitle = sc.nextLine();

            if (movieTitle.equals("종료")) {
                sc.close();
                break;
            }
            if (!movies.containsKey(movieTitle)) {
                System.out.println("해당 영화가 없습니다. 다시 입력해주세요.");
                continue;
            }

            double rating;
            while (true) {
                System.out.println("평점을 입력하세요. (0.0 ~ 10.0) > ");
                rating = sc.nextDouble();
                sc.nextLine();

                if (rating < 0.0 || rating > 10.0) {
                    System.out.println("평점은 0.0부터 10.0 사이여야 합니다.");
                } else {
                    break;
                }
            }

            movieRatings.put(movieTitle, rating);
            System.out.println(movieTitle + "에 " + rating + "점을 주셨습니다.");

            System.out.println("\n=== 입력한 평점 ===");
            double sum = 0.0;

            for (Map.Entry<String, Double> entry : movieRatings.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + "점");
                sum += entry.getValue();
            }

            if (!movieRatings.isEmpty()) {
                double average = sum / movieRatings.size();
                System.out.printf("\n평균 평점 : %.2f점\n", average);
            } else {
                System.out.println("\n평균 평점 : 0.0점");
            }

            System.out.println("\n === 추천 영화 (9.0점 이상) ===");
            boolean found = false;

            for (Map.Entry<String, Double> entry : movies.entrySet()) {
                String movie = entry.getKey();
                double score = entry.getValue();

                if (score >= 9.0 && !movieRatings.containsKey(movie)) {
                    System.out.println(movie + " : " + score + "점");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("추천할 영화가 없습니다.");
            }

        }
    }

}
