package ticket.machine;
import java.util.Scanner;

class MoneyInsert {
    double value;


     void moneyInput(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Wrzuć monety");
        this.value = inputValue.nextDouble();

        if( this.value != 0.2 && this.value != 0.5 && this.value != 1.0){

                do {
                    System.out.println("Błędny nomiał.");
                    System.out.println("Wprowadź dopuszczalny nominał");
                    Scanner inputValue1 = new Scanner(System.in);
                    this.value = inputValue1.nextDouble();
                    System.out.println("Nominał = " + this.value);

                }
                while (this.value != 0.2 && this.value != 0.5 && this.value != 1.0);

        }

    }
}
