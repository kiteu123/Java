public class Ramyeon {
    public static void main(String[] args) {
        buy();
        boil();
        put();
        eat();
    }

    private static void eat() {
        System.out.println("라면을 먹는다.");
    }

    private static void put() {
        System.out.println("라면을 넣는다.");
    }

    private static void boil() {
        System.out.println("라면을 끓인다.");
    }

    private static void buy() {
        System.out.println("라면을 사온다.");
    }

}
