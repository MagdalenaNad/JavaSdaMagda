import java.util.Scanner;

public class ComputerPrice {
    double VAT = 1.23;

    public double getComputerPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ceny częsci komputera NETTO:");
        System.out.print("- płyta główna: ");
        double mainboard = scanner.nextDouble();
        System.out.print("- procesor: ");
        double cPU = scanner.nextDouble();
        System.out.print("- pamięć RAM: ");
        double memory = scanner.nextDouble();
        System.out.print("- dysk twardy: ");
        double hardDrive = scanner.nextDouble();
        double computerPrice = mainboard + cPU + memory + hardDrive;
        return computerPrice * VAT;
    }

    public double getMonitorPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj cenę monitora NETTO: ");
        double monitor = scanner.nextDouble();
        return monitor * VAT;
    }

    public double getComputerAndMonitorPrize() {
        double computerAndMonitorPrize = getComputerPrice() + getMonitorPrice();
        return computerAndMonitorPrize;
    }

}
