package ticket.machine;

import java.util.HashMap;
import java.util.Map;

class TicketMachine {
    void start() {
        Ticket ticket1 = new Ticket(1, "Bilet normalny", 3.5);
        Ticket ticket2 = new Ticket(2, "Bilet ulgowy", 1.5);
        Ticket ticket3 = new Ticket(3, "Bilet godzinowy", 3.7);
        Ticket ticket4 = new Ticket(4, "Bilet dobowy", 10.5);
        System.out.println(ticket1.id + " " + ticket1.kind + ", cena: " + ticket1.price);
        System.out.println(ticket2.id + " " + ticket2.kind + ", cena: " + ticket2.price);
        System.out.println(ticket3.id + " " + ticket3.kind + ", cena: " + ticket3.price);
        System.out.println(ticket4.id + " " + ticket4.kind + ", cena: " + ticket4.price);

        Map<Integer, Double> mapa = new HashMap<>(); // Inicjowanie metody hashmap. K to int, V to double
        mapa.put(1, ticket1.price); // przypisanie klucza i wartości. Klucz przypiany do id = 1, wartość to cena biletu w pierwszego
        mapa.put(2, ticket2.price); // K = id 2, V = cena biletu drugiego
        mapa.put(3, ticket3.price); // K = id 2, V = cena biletu drugiego
        mapa.put(4, ticket4.price); // K = id 2, V = cena biletu drugiego
        System.out.println(mapa); // drukowanie mapy


        TickSel biletuWybor = new TickSel();
        biletuWybor.ticketSelect();
        MoneyInsert monIns = new MoneyInsert();

        switch (biletuWybor.buttonId) {
            case (1):
                System.out.println("Rodzaj biletu: " + ticket1.kind);
                System.out.println("Cena: " + mapa.get(1));
                monIns.moneyInput();
                MoneyCalc m1 = new MoneyCalc();
                m1.ticketCost = mapa.get(1);
                m1.moneyValue = monIns.value;
                m1.calkulation();
                break;

            case (2):
                System.out.println("Rodzaj biletu: " + ticket2.kind);
                System.out.println("Cena: " + mapa.get(2));
                monIns.moneyInput();
                MoneyCalc m2 = new MoneyCalc();
                m2.ticketCost = mapa.get(2);
                m2.moneyValue = monIns.value;
                m2.calkulation();
                break;

            case (3):
                System.out.println("Rodzaj biletu: " + ticket3.kind);
                System.out.println("Cena: " + mapa.get(3));
                monIns.moneyInput();
                MoneyCalc m3 = new MoneyCalc();
                m3.ticketCost = mapa.get(3);
                m3.moneyValue = monIns.value;
                m3.calkulation();
                break;

            case (4):
                System.out.println("Rodzaj biletu: " + ticket4.kind);
                System.out.println("Cena: " + mapa.get(4));
                monIns.moneyInput();
                MoneyCalc m4 = new MoneyCalc();
                m4.ticketCost = mapa.get(4);
                m4.moneyValue = monIns.value;
                m4.calkulation();

                break;

            default:
                System.out.println("Nie wybrano żadnego biletu");
        }
    }
}
