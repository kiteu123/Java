package a1231;

public class Ex03 {
    public static void main(String[] args) {
        int colorPen = 5 * 12;
        int studentCount = 27;
        int divColorPen = colorPen / studentCount;
        System.out.println("학생 당 나눠가진 색연필 수 : " + divColorPen);
        int remainColorPen = colorPen % studentCount;
        System.out.println("남은 색연필 수 : " + remainColorPen);
    }
}
