package Tasks.Store;

public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Наименование товра: " + name);
        System.out.println("Стоимость" + price);
    }
}
