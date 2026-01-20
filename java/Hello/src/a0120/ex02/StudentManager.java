package a0120.ex02;

import java.util.ArrayList;

public class StudentManager {

    public static void addStudent(ArrayList<Student> list, String name, int age, int score) {
        list.add(new Student(name, age, score));
    }

    public static void printAll(ArrayList<Student> list) {
        for (Student l : list) {
            System.out.println(l);
        }
    }

    public static Student findStudent(ArrayList<Student> list, String sname) {
        for (Student l : list) {
            if (l.name.equals(sname)) {
                return l;
            }
        }
        return null;
    }

    public static double getAverageScore(ArrayList<Student> list) {
        if (list.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Student l : list) {
            sum += l.score;
        }
        return (double) sum / list.size();
    }

}
