package a0205.jinair;

import java.time.LocalDate;
import java.time.Period;

public class Passenger {
    private String name;
    private int birthDate;
    private String pw;
    private String seat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Passenger(String name, int birthDate, String pw) {
        this.name = name;
        this.birthDate = birthDate;
        this.pw = pw;
    }

    public Passenger(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // 15세 이상
    public boolean man15(Passenger p) {
        int y = p.birthDate / 10000;
        int m = (p.birthDate % 10000) / 100;
        int d = p.birthDate % 100;
        if (y > 0 && y <= 26) {
            y = y + 2000;
        } else {
            y += 1900;
        }
        LocalDate birthDate2 = LocalDate.of(y, m, d);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate2, currentDate).getYears();
        return age > 15;
    }

}
