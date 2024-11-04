package Tasks.Ticket;

public class Ticket {
    protected double price;
    protected String type;

    public Ticket(double price, String type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
