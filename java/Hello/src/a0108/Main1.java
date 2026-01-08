package a0108;

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.model = "테슬라 모델3";
        myCar.color = "white";
        myCar.speed = 100;
        myCar.accelerate();
        myCar.stop();

        Car yourCar = new Car();
        yourCar.model = "아이오닉6";
        yourCar.accelerate();
    }
}

class Car {
    String model;
    String color;
    int speed;

    void accelerate() {
        speed += 10;
        System.out.println(model + "의 속도가 " + speed + "km/h가 되었습니다.");
    }

    void stop() {
        speed = 0;
        System.out.println(model + "이 멈췄습니다.");
    }
}
