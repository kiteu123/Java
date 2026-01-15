package a0115.upcasting;

public class UpcastingTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";

        Triangle t = new Triangle();
        t.name = "정삼각형";

        Circle c = new Circle();
        c.name = "원형";

        Shape[] shapes = { s, t, c };
        // upcasting : 자식 클래스 타입을 부모 클래스 타입의 변수에 저장하는 것
        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("%d인 인덱스의 도형 : %s \n", i, shapes[i].name);
        }
    }
}

class Shape {
    String name;
}

// 자식클래스
class Square extends Shape {// 사각형도형
}

class Triangle extends Shape {// 삼각형도형
}

class Circle extends Shape {// 원형도형
}