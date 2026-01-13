package a0113.abstract1;

public class MainAni1 {
    public static void main(String[] args) {
        Animal dog = new Dog("뽀삐");
        Animal cat = new Cat("나비");

        dog.eat();
        dog.makeSound();
        System.out.println();
        cat.eat();
        cat.makeSound();
    }
}
