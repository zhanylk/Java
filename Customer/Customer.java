package Tasks.Customer;

public class Customer {
    protected String name;
    protected double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;

    }

    public void payBill(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(name + " оплатил " + amount + " остаток " + balance);
        } else {
            System.out.println(name + " баланс имеется - " + amount);
        }
    }
}
