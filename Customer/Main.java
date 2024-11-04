package Tasks.Customer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new RegularCustomer("Иван", 100.0),
                new VIPCustomer("Мария", 150.0)
        );

        Store store = new Store();
        store.processPayments(customers, 50.0);
    }
}
