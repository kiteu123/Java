package a1230;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("\n--- 복합 연산 예제 ---");
        int score1 = 85;
        int score2 = 90;
        int score3 = 78;

        // 1. 각 점수를 인쇄
        System.out.println("score1 : " + score1);
        System.out.println("score2 : " + score2);
        System.out.println("score3 : " + score3);

        // 2. 총점과 평균을 구해서 인쇄
        int sum = score1 + score2 + score3;
        double average = sum / 3;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);

        // 3. 평균 60점 이상이면 합격

        if (average >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        boolean isPass = average >= 60;
        System.out.println("합격 : " + isPass);

        average = 90;

        // 4. 평균 90점 이상이면 우수
        if (average >= 90) {
            System.out.println("우수");
        } else {
            System.out.println("평범");
        }

        boolean isExcellent = average >= 90;
        System.out.println("성적 우수 : " + isExcellent);
    }
}
