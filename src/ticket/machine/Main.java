package ticket.machine;

import ticket.machine.moneyInsert;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket( 2, "Bilet normalny", 3.5);
        Ticket ticket2 = new Ticket(2, "Bilet ulgowy", 1.5);
        Ticket ticket3 = new Ticket(3, "Bilet godzinowy", 3.7);
        Ticket ticket4 = new Ticket(4, "Bilet dobowy", 10.5);
        System.out.println( ticket1.id + " " + ticket1.kind + ", cena: " + ticket1.price);
        System.out.println( ticket2.id + " " + ticket2.kind + ", cena: " + ticket2.price);
        System.out.println( ticket3.id + " " + ticket3.kind + ", cena: " + ticket3.price);
        System.out.println( ticket4.id + " " + ticket4.kind + ", cena: " + ticket4.price);

        Map<Integer, Double> mapa = new HashMap(); // Inicjowanie metody hashmap. K to int, V to double
        mapa.put(1, ticket1.price); // przypisanie klucza i wartości. Klucz przypiany do id = 1, wartość to cena biletu w pierwszego
        mapa.put(2, ticket2.price); // K = id 2, V = cena biletu drugiego
        mapa.put(3, ticket3.price); // K = id 2, V = cena biletu drugiego
        mapa.put(4, ticket4.price); // K = id 2, V = cena biletu drugiego
        System.out.println(mapa); // drukowanie mapy
        mapa.get(1);

        Scanner buttonChoose = new Scanner(System.in);
        System.out.println("Wybierz bilet:");
        int button;
        button = buttonChoose.nextInt();

        if(button == 1){
            System.out.println(ticket1.kind + ": " + mapa.get(1));
        }
        if(button == 2){
            System.out.println(ticket2.kind + ": " + mapa.get(2));
        }
        if(button == 3){
            System.out.println(ticket3.kind + ": " + mapa.get(3) );
        }
        if(button == 4){
            System.out.println(ticket4.kind + ": " + mapa.get(4));
        }
    }
}
