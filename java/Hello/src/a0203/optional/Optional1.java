package a0203.optional;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        MemberService service = new MemberService();
        Optional<String> name = service.findNameById(1);
        // if (name != null) {
        // System.out.println(name.length());
        // } else {
        // System.out.println("회원이 존재하지 않습니다.");
        // }
        name.ifPresent(n -> System.out.println(n.length()));
    }
}

class MemberService {
    public Optional<String> findNameById(int id) {
        if (id == 1) {
            return Optional.of("홍길동");
        }
        return Optional.empty();
    }
}