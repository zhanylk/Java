package Tasks.Store;

public class Cloth  extends Product{
    private String size;

    public Cloth(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер " + size);
    }
}
