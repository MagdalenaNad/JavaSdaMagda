package weekend01;
import java.util.Scanner;

public class RunComputerPrize {
    public static void main(String[] args) {
        ComputerPrice computerPrice = new ComputerPrice();
        System.out.println("Wybierz opcję: ");
        System.out.println("'1' - cena komputera,");
        System.out.println("'2' - cena monitora,");
        System.out.println("'3' - cena komputera z monitorem.");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        if (choice==1) {
            System.out.println("Cena brutto komputera: " + computerPrice.getComputerPrice() + "zł");
        }
        else if (choice==2){
            System.out.println("Cena brutto monitora: " + computerPrice.getMonitorPrice() + "zł");
        }
        else if (choice==3) {
            System.out.println("Cena brutto komputera z monitorem: " + computerPrice.getComputerAndMonitorPrize() + "zł");
        }
        else
            System.out.println("Niepoprawnie wybrana opcja.");
    }
}
