package ticket.machine;

import ticket.machine.moneyInsert;

public class Main {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket(1, "Bilet normalny", 3.5);
        Ticket ticket2 = new Ticket(2, "Bilet ulgowy", 1.5);
        Ticket ticket3 = new Ticket(3, "Bilet godzinowy", 3.7);
        Ticket ticket4 = new Ticket(4, "Bilet dobowy", 10.5);
        System.out.println( ticket1.id + " " + ticket1.kind + ", cena: " + ticket1.prize);
        System.out.println( ticket2.id + " " + ticket2.kind + ", cena: " + ticket2.prize);
        System.out.println( ticket3.id + " " + ticket3.kind + ", cena: " + ticket3.prize);
        System.out.println( ticket4.id + " " + ticket4.kind + ", cena: " + ticket4.prize);

        moneyInsert value = new moneyInsert();
        System.out.println("Podaj wartość");
        value.mon();
        System.out.println("wartość" + " " + value.value);
    }
}
