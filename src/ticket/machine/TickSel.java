package ticket.machine;
import java.util.Scanner;
public class TickSel {
    int buttonId;

    public void ticketSelect(){
        Scanner buttonChoose = new Scanner(System.in);
        System.out.println("Wybierz bilet");
        this.buttonId = buttonChoose.nextInt();

    }
}
