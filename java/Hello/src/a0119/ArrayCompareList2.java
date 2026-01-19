package a0119;

import java.util.ArrayList;

public class ArrayCompareList2 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();

        list.add(new Student1("홍길동", 20));
        list.add(new Student1("김철수", 22));

        for (Student1 s : list) {
            System.out.println(s);
        }
    }
}

class Student1 {
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }

}
