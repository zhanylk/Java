package Tasks.Store;

public class ElecGoods  extends  Product{

    private int warranty;

    public ElecGoods(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Грантия действует на " + warranty + " лет");
    }
}
