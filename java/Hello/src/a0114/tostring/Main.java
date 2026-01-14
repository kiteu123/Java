package a0114.tostring;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("김철수", 45);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1);
        System.out.println(p2);
    }
}
