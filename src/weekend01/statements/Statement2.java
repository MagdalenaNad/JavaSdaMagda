package weekend01.statements;
import java.util.Scanner;

public class Statement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę oznaczającą ocenę (od 1 do 6): ");
        int nota = scanner.nextInt();
        ocena(nota);
    }

    public static void ocena(int a) {

        switch (a) {
            case 1:
                System.out.println("niedostateczny");
                break;
            case 2:
                System.out.println("dopuszczający");
                break;
            case 3:
                System.out.println("dostateczny");
                break;
            case 4:
                System.out.println("dobry");
                break;
            case 5:
                System.out.println("bardzo dobry");
                break;
            case 6:
                System.out.println("celujący");
                break;
            default:
                System.out.println("To nie jest ocena szkolna");
        }
    }
}
