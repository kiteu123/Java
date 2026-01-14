package a0114.abstract1;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    public void eat() {
        System.out.println(name + " 이(가) 먹습니다.");
    }
}
