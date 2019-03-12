package ticket.machine;

public class Tickets {
    int id;
    String kind;
    double prize;

    public Tickets(int id, String kind, double prize){
        this.id = id;
        this.kind = kind;
        this.prize = prize;
        System.out.println();
    }
}
