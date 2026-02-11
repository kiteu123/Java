package a0211.sort.hak4;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // ===== 더미 데이터 =====
        students.add(new Student("홍길동", 20, 2023001));
        students.add(new Student("김철수", 22, 2023002));
        students.add(new Student("이영희", 21, 2023003));
        students.add(new Student("박민수", 23, 2023004));
        students.add(new Student("최지훈", 19, 2023005));
        students.add(new Student("강다은", 20, 2023006));
        // ======================

        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();
        sc.nextLine();

        // 학생 정보 입력
        for (int i = 0; i < n; i++) {

            System.out.print("학생 이름: ");
            String name = sc.nextLine();

            System.out.print("학생 나이: ");
            int age = sc.nextInt();

            System.out.print("학생 학번: ");
            int id = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, age, id));
        }

        // 정렬 기준 선택
        System.out.println("\n정렬 기준 선택");
        System.out.println("1. 이름  2. 나이  3. 학번");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(students, new NameComparator());
                break;

            case 2:
                Collections.sort(students, new AgeComparator());
                break;

            case 3:
                Collections.sort(students, new IdComparator());
                break;

            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        // 출력
        System.out.println("\n정렬된 학생 목록");

        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}

/* ================= Student ================= */

class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int studentId;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name +
                ", age=" + age +
                ", id=" + studentId + "]";
    }

    // 기본 정렬 : 이름순
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

/* ================= Comparator ================= */

// 이름순
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

// 나이순
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}

// 학번순
class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentId() - o2.getStudentId();
    }
}
