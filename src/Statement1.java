import java.util.Scanner;

public class Statement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolną liczbę całkowitą: ");
        int number = scanner.nextInt();
        checkNumber(number);

    }
    public static void checkNumber(int a){

        if (a>10000) {
            System.out.println("Większa od 10000.");
        } else if (a>1000){
            System.out.println("Liczba z przedziału 1001-10000.");
        } else if (a>100) {
            System.out.println("Liczba z przedziału 101 - 1000.");
        } else if (a>10) {
            System.out.println("Liczba z przedziału 11-100.");
        } else if (a>0) {
            System.out.println("Liczba z przedziału 1-10.");
        }else{
            System.out.println("Ta liczba nie jest dodatnia.");
        }
    }

}
