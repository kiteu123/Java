package a0113.book;

public class PrintBook extends Book {
    private int pagecount;
    private double weight;

    public PrintBook(String title, String author, String iSBN, int pagecount, double weight) {
        super(title, author, iSBN);
        this.pagecount = pagecount;
        this.weight = weight;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count : " + pagecount);
        System.out.println("Weight : " + weight + "kg");
    }

}
