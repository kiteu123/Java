package a0120.hw;

public class StringEx7 {
    // p,316~317

    public static void main(String[] args) {
        String str = "Hello My Name is Hong Gil Dong";

        System.out.println(str.charAt(6));
        System.out.println(str.equals("Hello My Name is Hong Gil Dong"));
        System.out.println(str.indexOf("Hong"));
        System.out.println(str.indexOf('H'));
        System.out.println(str.substring(17));
        System.out.println(str.substring(6, 13));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Dong"));
        System.out.println(str.replace("Hong", "Kim"));
        System.out.println(str.replaceAll("Name", "NickName"));
        System.out.println(str.toString());

        str = "   안녕 하세요,     반갑습니다.       ";
        System.out.println(str.trim());
        System.out.println(str.replace(" ", ""));
        str = String.valueOf(10);
        str = String.valueOf(10.5);

        str = "홍길동,이순신,유관순,안중근";
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "번 인덱스 값 = " + arr[i]);
        }
    }
}
