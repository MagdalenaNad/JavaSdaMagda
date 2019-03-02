package weekend01;
import java.util.Scanner;

public class Statement3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rzymską cyfrę od I do IX");
        String rzym = scanner.next();
        arabska(rzym);
    }

    public static void arabska(String rzym){
        switch (rzym){
            case "I":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 1"); break;
            case "II":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 2"); break;
            case "III":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 3"); break;
            case "IV":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 4"); break;
            case "V":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 5"); break;
            case "VI":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 6"); break;
            case "VII":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 7"); break;
            case "VIII":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 8"); break;
            case "IX":
                System.out.println("Rzymskiej liczbie " + rzym +" odpowiada arabska liczba 9"); break;
                default:
                    System.out.println("To nie jest rzymska liczba z zakresu 1-9");


        }
    }



}
