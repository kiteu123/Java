package a0109.product;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("===상품 총 금액 계산===");
        Product product1 = new Product("노트북", 1000000, 2);
        Product product2 = new Product("마우스", 25000, 3);
        Product product3 = new Product("키보드", 50000, 1);

        product1.setDiscountRate(0.1);
        product2.setDiscountRate(0.15);

        System.out.println();
        product1.printProductInfo();
        product2.printProductInfo();
        product3.printProductInfo();

    }
}
