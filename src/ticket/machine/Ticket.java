package ticket.machine;

public class Ticket {
    int id;
    String kind;
    double price;

    public Ticket(int id, String kind, double price){
        this.id = id;
        this.kind = kind;
        this.price = price;
        System.out.println();
    }
}
