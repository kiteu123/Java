package a0108.member;

public class Member {
    String id;
    String password;
    String name;

    public Member(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("이름 : " + name);
    }
}
