package ticket.machine;
import java.util.Scanner;

public class moneyInsert {
    double value;

    public void moneyInput(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Wrzuć monety");
        this.value = inputValue.nextDouble();
        if(this.value != 0.2 || this.value != 0.5 || this.value != 1.0 || this.value != 2.0 || this.value != 5.0 || this.value != 10|| this.value != 20){
//            do{
                System.out.println("Błędny nomiał.");
                System.out.println("Wprowadź dopuszczalny nominał");
                Scanner inputValue1 = new Scanner(System.in);
                this.value = inputValue1.nextDouble();
//                break;
//            }
//            while(this.value >= 0 );

        }

    }
}
