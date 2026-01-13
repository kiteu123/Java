package a0113.car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("===car1(기본 생성자)");
        System.out.println("Model : " + car1.model);
        System.out.println("Color : " + car1.color);
        System.out.println();

        Car car2 = new Car("제네시스", "검정색");
        System.out.println("Model : " + car2.model);
        System.out.println("Color : " + car2.color);
        System.out.println();
    }
}
