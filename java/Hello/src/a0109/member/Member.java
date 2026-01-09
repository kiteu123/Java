package a0109.member;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member {
    private String name;
    private String email;
    private LocalDate joinDate;

    public Member(String name, String email, LocalDate joinDate) {
        this.name = name;
        this.email = email;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getMemberGrade() {
        long days = getJoinDays();
        if (days >= 365)
            return "VIP";
        else if (days >= 180)
            return "GOLD";
        else if (days >= 90)
            return "Silver";
        else
            return "BRONZE";
    }

    private long getJoinMonths() {
        return ChronoUnit.MONTHS.between(joinDate, LocalDate.now());
    }

    public long getJoinDays() {
        return ChronoUnit.DAYS.between(joinDate, LocalDate.now());
    }

    public void printMemberInfo() {
        System.out.println("\n===회원정보===");
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.println("가입일: " + joinDate);
        System.out.println("가입 기간: " + getJoinDays() + "일 (" + getJoinMonths() + "개월)");
        System.out.println("회원 등급: " + getMemberGrade());
    }

}
