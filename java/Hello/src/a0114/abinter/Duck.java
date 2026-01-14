package a0114.abinter;

class Duck extends Animal implements Flyable, Swimable {
    private String color;

    public Duck(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        System.out.println(name + " 이(가) 꽥꽥 웁니다.");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name + " 이(가) 걸어다닙니다.");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println(name + " 이(가) 낮게 날아다닙니다.");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println(name + " 이(가) 연못에서 수영합니다.");
    }

}
