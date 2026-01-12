package monster;

public class MonsterTest {
    public static void main(String[] args) {

        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("스켈레톤");
        Monster.battle(orc, skeleton);
    }
}
