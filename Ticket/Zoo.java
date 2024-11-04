package Tasks.Ticket;

import java.util.List;

public class Zoo {
    public double calculateTotalCost(List<Ticket> tickets) {
        double total = 0;
        for (Ticket ticket : tickets) {
            total += ticket.getPrice();
        }
        System.out.println("Общая стоимость билета" + total);
        return total;
    }
}
