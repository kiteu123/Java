package a0113.abstract1;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // 추상 메서드 - 몸체가 없는 메서드
    // 선언만 있고 구현이 없음
    // 자식 클래스에서 오버라이딩해야함

    abstract void makeSound();

    public void eat() {
        System.out.println(name + " 이(가) 먹습니다.");
    }
}
