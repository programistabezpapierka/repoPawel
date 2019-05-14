/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmachine;

/**
 *
 * @author Paweł
 */

public class TicketMachine {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        moneyInsert value = new moneyInsert();
        System.out.println("Podaj wartość");
        value.mon();
        System.out.println("wartość" + " " + value.value);



    }
    
}
