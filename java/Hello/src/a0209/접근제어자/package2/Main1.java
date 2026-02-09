package a0209.접근제어자.package2;

import a0209.접근제어자.package1.Parent;

public class Main1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();

        Parent parent = new Parent();
        // System.out.println(parent.message);
        // parent.showMessage();
    }
}
