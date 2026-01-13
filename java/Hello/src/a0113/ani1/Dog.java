package a0113.ani1;

public class Dog extends Animal {

    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("breed : " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 이(가) 멍멍 짖습니다.");
    }

    public void bark() {
        System.out.println(name + " 이(가) 왈왈 짖습니다.");
    }

}
