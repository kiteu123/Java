package a0106;

public class String3 {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = str.charAt(0);
        System.out.println("인덱스 0번 글자 " + ch);

        char ch6 = str.charAt(6);
        System.out.println("인덱스 6번 글자 " + ch6);

        int index1 = str.indexOf('o');
        int index2 = str.indexOf("World");
        int index3 = str.indexOf('x');

        System.out.println(index1 + " " + index2 + " " + index3);

        int lastIndex = str.lastIndexOf('o');
        System.out.println("o 마지막 위치 : " + lastIndex);
    }
}
