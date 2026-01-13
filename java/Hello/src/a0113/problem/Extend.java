package a0113.problem;

public class Extend {
    public static void main(String[] args) {
        Student student = new Student("민수", 20, "컴퓨터공학");
        Teacher teacher = new Teacher("김선생", 40, "자바");

        student.introduce();
        student.work();
        student.study();
        student.displayInfo();

        System.out.println();

        teacher.introduce();
        teacher.work();
        teacher.teach();
        teacher.displayInfo();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println(name + "입니다.");
    }

    public void work() {
        System.out.println(name + " 이(가) 일을 합니다.");
    }

    public void displayInfo() {
        System.out.println("이름 : " + name + ", 나이 : " + age);
    }

}

class Student extends Person {
    String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void work() {
        System.out.println(name + " 이(가) 공부를 합니다.");
    }

    public void study() {
        System.out.println(name + " 이(가) " + major + " 을(를) 공부합니다.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("전공 : " + major);
    }

}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void work() {
        System.out.println(name + " 이(가) 수업을 합니다.");
    }

    public void teach() {
        System.out.println(name + " 이(가) " + subject + " 을(를) 가르칩니다.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("과목 : " + subject);
    }
}