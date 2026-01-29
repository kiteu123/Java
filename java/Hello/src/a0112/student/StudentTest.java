package student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("김철수", 90);
        Student s2 = new Student("이영희", -10);

        System.out.println("학교 : " + a0129.student.schoolName);
        System.out.println(s1.getName() + " / 점수: " + s1.getScore());
        System.out.println(s2.getName() + " / 점수: " + s2.getScore());

        s2.setScore(95);

        System.out.println("점수 수정 후");
        System.out.println(s2.getName() + " / 점수: " + s2.getScore());
    }
}
