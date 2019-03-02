package weekend01;
import java.util.Scanner;

public class Statement4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę od 48 do 122: ");
        int uniCode = scanner.nextInt();
        unicode(uniCode);

    }

    public static void unicode(int a) {
        if ((a >= 48) && (a <= 57)) {
            System.out.println("Kod odpowiada cyfrze od 0 do 9, konkretnie cyfrze " + (char)a + ".");
        } else if ((a >= 65) && (a <= 90)) {
            System.out.println("Kod odpowiada wielkiej literze od A do Z, konkretnie literze " + (char)a + ".");
        } else if ((a >= 97) && (a <= 122)) {
            System.out.println("Kod odpowiada małej literze od a do z, konkretnie literze " + (char)a + ".");
        } else {
            System.out.println("Ten kod nie odpowiada cyfrze ani literze łacińskiej.");
        }

    }
}
