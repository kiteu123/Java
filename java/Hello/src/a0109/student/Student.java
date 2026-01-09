public class Student {
    private String name;
    private int korean;
    private int english;
    private int math;
    private int sum = 0;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public void printInfo() {
        System.out.println("=== " + name + "학생 정보 ===");
        System.out.println("국어: " + korean + "점");
        System.out.println("영어: " + english + "점");
        System.out.println("수학: " + math + "점");
        System.out.println("총점: " + calcTotal() + "점");
        System.out.println("평균: " + String.format("%.2f", calcAvg()) + "점");
        System.out.println("등급:" + calcGrade());
    }

    public double calcAvg() {
        return calcTotal() / 3.0;
    }

    public int calcTotal() {
        sum = korean + english + math;
        return sum;
    }

    // private String calcGrade() {
    // double avg = calcAvg();
    // if (avg >= 90) {
    // return "A";
    // } else if (avg >= 80) {
    // return "B";
    // } else if (avg >= 70) {
    // return "C";
    // } else if (avg >= 60) {
    // return "D";
    // } else {
    // return "F";
    // }
    // }

    private String calcGrade() {
        double avg = calcAvg();
        if (avg >= 90)
            return "A";
        else if (avg >= 80)
            return "B";
        else if (avg >= 70)
            return "C";
        else if (avg >= 60)
            return "D";
        else
            return "F";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    

}
