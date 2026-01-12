package aven;

public class Avenger {
    String name;
    int hp;

    public Avenger(String s, int i) {
        name = s;
        hp = i;
    }

    void punch(Avenger enemy) {
        System.out.printf("[%s]의 펀치", name);
        enemy.hp -= 10;
        System.out.printf(" -> %s의 체력 %d\n: ", enemy.name, enemy.hp);
    }
}
