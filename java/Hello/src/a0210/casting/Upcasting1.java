package a0210.casting;

public class Upcasting1 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("멍멍");
    }
}