package a0114.abinter;

// 자식 클래스
public class Bird extends Animal implements Flyable {
    private String species;

    public Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        System.out.println(name + "짹짹 웁니다.");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name + " 이(가) 날아갑니다.");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println(name + " 이(가) 하늘을 날아갑니다.");
    }
}
