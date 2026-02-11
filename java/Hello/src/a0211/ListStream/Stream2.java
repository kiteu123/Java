package a0211.ListStream;

import java.util.ArrayList;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        // ArrayList 생성
        List<Student_1> studentList = new ArrayList<>();

        // 객체추가
        studentList.add(new Student_1(101, "Alice", 20));
        studentList.add(new Student_1(102, "Bob", 22));
        studentList.add(new Student_1(103, "Charlie", 21));

        System.out.println("Student List 출력");
        printList(studentList);
    }

    private static void printList(List<Student_1> studentList) {
        studentList.forEach(System.out::println);
    }
}

class Student_1 {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student_1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}