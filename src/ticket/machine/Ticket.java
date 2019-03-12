package ticket.machine;

public class Ticket {
    int id;
    String kind;
    double prize;

    public Ticket(int id, String kind, double prize){
        this.id = id;
        this.kind = kind;
        this.prize = prize;
        System.out.println();
    }
}
