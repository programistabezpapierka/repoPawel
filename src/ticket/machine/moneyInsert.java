package ticket.machine;
import java.util.Scanner;
public class moneyInsert {
    double value;

    void mon(){
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Wrzuć monety");
        this.value = inputValue.nextDouble();

    }
}
