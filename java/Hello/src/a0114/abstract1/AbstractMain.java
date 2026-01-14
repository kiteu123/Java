package a0114.abstract1;

public class AbstractMain {
    public static void main(String[] args) {
        Animal dog = new Dog("뽀삐");
        Animal cat = new Cat("나비");
        dog.eat();
        dog.sound();
        System.out.println();
        cat.eat();
        cat.sound();
    }
}
