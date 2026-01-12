package food;

public class FoodClass {
    public static void main(String[] args) {
        Food chicken = new Food("치킨", 19800);
        Food pizza = new Food("피자", 29700);
        System.out.printf("Food { name : %s, price : %,3d원}\n", chicken.getName(), chicken.getPrice());
        System.out.printf("Food { name : %s, price : %,3d원}\n", pizza.getName(), pizza.getPrice());

    }

}
