
package Tasks.Customer;

import java.util.List;

public class Store {
    public void processPayments(List<Customer> customers, double amount) {
        for (Customer customer : customers) {
            customer.payBill(amount);
        }
    }
}
