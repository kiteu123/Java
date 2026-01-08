package a0108;

public class ObjectEx01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;
        p1.sayHello();

        Person p2 = new Person();
        p2.name = "김철수";
        p2.age = 25;
        p2.sayHello();
        // 클래스와 객체는 다르다.
    }
}

class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + "이고 " + age + "살입니다.");
    }
}