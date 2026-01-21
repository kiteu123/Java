package a0121.ex02;

public class Car {
    String brand;
    String model;
    int year;

    public Car() {

    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year + "]";
    }

    public int getAge(int i) {
        return i - year;
    }

}
