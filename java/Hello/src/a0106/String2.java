package a0106;

public class String2 {
    public static void main(String[] args) {
        String firstName = "홍";
        String lastName = "길동";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String str = "Hello";
        str = str.concat("World");
        System.out.println(str);

        String str1 = "Hello";
        int len = str1.length();
        System.out.println("문자열 길이 : " + len);

        // boolean empty = str1.isEmpty();
        String emptyStr = "";
        boolean isEmp = emptyStr.isEmpty();
        System.out.println("Empty? " + isEmp);
    }
}
