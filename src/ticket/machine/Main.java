package ticket.machine;

import ticket.machine.moneyInsert;

public class Main {

    public static void main(String[] args) {

        Tickets ticket1 = new Tickets(1, "Bilet normalny", 3.5);
        Tickets ticket2 = new Tickets(2, "Bilet ulgowy", 1.5);
        Tickets ticket3 = new Tickets(3, "Bilet godzinowy", 3.7);
        Tickets ticket4 = new Tickets(4, "Bilet dobowy", 10.5);
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
