package Tasks.Ticket;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ticket> tickets = List.of(
                new AdultTicket(),
                new AdultTicket(),
                new ChildTicket(),
                new ChildTicket(),
                new ChildTicket()
        );


        Zoo zoo = new Zoo();
        zoo.calculateTotalCost(tickets);
    }
}
