package ticket.machine;
import java.util.Scanner;
public class MoneyCalc {

    double ticketCost; // cena biletu
    double moneyValue; // wartość wpłacana
    double roznica; // różnica między powyższymi

// Metoda drukowania biletu, włącznie z obliczeniem wydawanej reszty lub kwoty, którą należy dopłacić.

    public void calkulation(){
        if(this.ticketCost > this.moneyValue){
            this.roznica = this.ticketCost - this.moneyValue;
            System.out.println("Dopłać" + " " + this.roznica);
            if(this.roznica > 0){
                do{
                    Scanner inputValue1 = new Scanner(System.in);
                    this.moneyValue = inputValue1.nextDouble();
                    this.roznica -= this.moneyValue;
                    if(this.roznica > 0){
                        System.out.println("Dopłać" + " " + this.roznica);
                    }
                    else if(this.roznica == 0){
                        System.out.println("Drukowanie biletu!");
                        break;
                    }
                    else{
                        System.out.println("Drukowanie biletu!");
                        System.out.println("Reszta");
                        System.out.println((-1) * this.roznica);
                        break;
                    }
                }
                while(this.ticketCost > this.moneyValue);}
        }
        else if (this.ticketCost < this.moneyValue){
            System.out.println("Reszta");
            this.roznica = this.moneyValue - this.ticketCost;
            System.out.println(this.roznica);
            System.out.println("Drukowanie biletu!");
        }
        else{
            System.out.println("Drukowanie biletu!");
        }
    }
}
