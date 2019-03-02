package weekend01;
import java.util.Scanner;

public class FahrenheitConverterTest {
    public static void main(String[] args) {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jeżeli chcesz zamienić temperaturę ze skali Fahrenheita na temperaturę w skali Celsjusza wciśnij '1',");
        System.out.print("jeśli odwrotnie, wciśnij '2': ");
        int skala = scanner.nextInt();

        if (skala == 1) {
            System.out.print("Podaj temperatuję w skali Fahrenheita: ");
            double fahr = scanner.nextDouble();
            fahrenheitConverter.convertToCelsius(fahr);
            System.out.print("W skali Celsjusza: ");
        } else if (skala == 2) {
            System.out.print("Podaj temperatuję w skali Celsjusza: ");
            double cels = scanner.nextDouble();
            fahrenheitConverter.convertToFahrenheit(cels);
            System.out.print("W skali Fahrenheita: ");
        } else {
            System.out.println("Nie podałeś liczby poprawnie.");
        }
    }
}
