package student;

public class Student {
    private String name;
    private int score;
    public static String schoolName = "한국대학교";

    public Student(String name, int score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }
}
