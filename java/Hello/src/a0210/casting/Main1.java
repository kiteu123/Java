package a0210.casting;

public class Main1 {
    public static void main(String[] args) {

    }
}

class Parent {
    int x = 100;

    void show() {
        System.out.println("Parent: " + x);
    }
}

class Child extends Parent {
    int x = 200;

    void show() {
        System.out.println("Child: " + x);
    }
}
