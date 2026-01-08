package a0108;

public class Main2 {
    public static void main(String[] args) {
        Student a = new Student();
        a.name = "홍길동";
        a.age = 20;
        a.info();

        Student s2 = new Student("이수만", 75);
        s2.info();
    }
}

class Student {
    String name;
    int age;

    Student() {
        System.out.println("기본 생성자 실행");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("이름 : " + name + ", 나이 : " + age);
    }
}
