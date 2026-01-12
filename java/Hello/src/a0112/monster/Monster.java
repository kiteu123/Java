package monster;

public class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
        name = s;
        hp = maxHp;
    }

    public void attack(Monster enemy) {
        int damage = 10;
        enemy.hp -= damage;

        // if (enemy.hp < 0) {
        // enemy.hp = 0;
        // }
        System.out.printf("[%s]의 공격 -> [%s]의 체력 : %d/%d\n", this.name, enemy.name, enemy.hp, maxHp);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;

            attacker.attack(defender);
            System.out.println();
        }
    }
}
