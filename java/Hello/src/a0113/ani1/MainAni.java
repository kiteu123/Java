package a0113.ani1;

public class MainAni {
    public static void main(String[] args) {
        Dog dog = new Dog("뽀삐", 3, "골든 리트리버");
        Cat cat = new Cat("나비", 2, "검은색");

        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.bark();
        dog.displayInfo();

        System.out.println();

        cat.eat();
        cat.sleep();
        cat.makeSound();
        cat.scratch();
        cat.displayInfo();
    }
}
