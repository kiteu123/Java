package a0109.product;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private double discountRate;
    private double VAT;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountRate = 0.0;
        this.VAT = 0.1;
    }

    public void printProductInfo() {
        System.out.println("=========== 영수증 ===========");
        System.out.println("===상품 정보===");
        System.out.println("상품명: " + name);
        System.out.println("단가: " + String.format("%,d", price) + "원");
        System.out.println("수량: " + quantity + "개");
        System.out.println("총 금액: " + String.format("%,d", calcTotalPrice()) + "원");
        if (discountRate > 0) {
            System.out.println("할인율: " + (discountRate * 100) + "%");
            System.out.println("할인 금액: " + String.format("%,d", calcDiscountAmount()) + "원");
            System.out.println("할인 후 금액: " + String.format("%,d", calcFinalPrice()) + "원");
        }
        System.out.println("부가세: " + String.format("%,.0f", calcVATPrice()) + "원");
        System.out.println("최종 결제 금액: " + String.format("%,.0f", calcFinalFinalPrice()) + "원");
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    private double calcFinalFinalPrice() {
        return calcFinalPrice() + calcVATPrice();
    }

    private double calcVATPrice() {
        return calcFinalPrice() * VAT;
    }

    private int calcFinalPrice() {
        return calcTotalPrice() - calcDiscountAmount();
    }

    private int calcDiscountAmount() {
        return (int) (calcTotalPrice() * discountRate);
    }

    private int calcTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscountRate(double discountRate) {
        if (discountRate < 0 || discountRate > 1) {
            System.out.println("할인율은 0.0 ~ 1.0 사이여야합니다.");
            return;
        }
        this.discountRate = discountRate;
    }

}
