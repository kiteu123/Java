package a0119.studentApp;

import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 20));
        list.add(new Student("김철수", 22));
        list.add(new Student("이기자", 25));

        printAll(list);

        System.out.println("=== 수정 ===");
        boolean result = updateStudent(list, "홍길동", 25);
        if (result) {
            System.out.println("수정 완료");
        } else {
            System.out.println("수정 실패");
        }
        printAll(list);

        System.out.println("=== 삭제 ===");
        boolean delResult = deleteStudent(list, "김철수");
        if (delResult) {
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제 실패");
        }
        printAll(list);

        System.out.println("=== 검색 ===");
        Student s = findStudent(list, "홍길동");
        System.out.println(s);
    }

    private static Student findStudent(ArrayList<Student> list, String string) {
        for (Student l : list) {
            if (l.name.equals(string)) {
                return l;
            }
        }
        return null;
    }

    private static boolean deleteStudent(ArrayList<Student> list, String string) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(string)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean updateStudent(ArrayList<Student> list, String name, int newAge) {
        for (Student l : list) {
            if (l.name.equals(name)) {
                l.age = newAge;
                return true;
            }
        }
        return false;
    }

    private static void printAll(ArrayList<Student> list) {
        for (Student l : list) {
            System.out.println(l);
        }
    }
}
