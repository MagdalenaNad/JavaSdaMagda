package weekend01;
import java.util.Scanner;

public class Statement5 {
    public static void weekEnd(int a) {
        if (a==1){
            System.out.println("Poniedziałek, do weekendu 5 dni.");
        }
        else if (a==2) {
            System.out.println("Wtorek, do weekendu 4 dni.");
        }
        else if (a==3) {
            System.out.println("Środa, do weekendu 3 dni.");
        }
        else if (a==4) {
            System.out.println("Czwartek, do weekendu 2 dni.");
        }
        else if (a==5) {
            System.out.println("Piątek, do weekendu 1 dzień!");
        }
        else if (a==6) {
            System.out.println("Sobota, WEEKEND!!! " + (char) 9786);
        }
        else if (a==7) {
            System.out.println("Niedziela, WEEKEND!!! " + (char) 9786);
        }
        else {
            System.out.println("To nie jest liczba oznaczająca dzień tygodnia.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Podaj liczbę od 1 do 7: ");
        int dayOfWeek=scanner.nextInt();
        weekEnd(dayOfWeek);
    }
}
