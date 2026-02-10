package a0210.casting;

public class Main3 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.method();
    }
}

class Parent1 {
    Parent1() {
        System.out.println("Parent 생성자");
    }

    void method() {
        System.out.println("Parent method");
    }
}

class Child1 extends Parent1 {
    Child1() {
        System.out.println("Child 생성자");
    }

    void method() {
        System.out.println("Child method");
    }
}