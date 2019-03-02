import java.util.Scanner;

public class FahrenheitConverter {
    public double convertToCelsius(double fahrenheit) {
        double cels = 5 * (fahrenheit - 32) / 9;
        return cels;
    }

    public double convertToFahrenheit(double celsius) {
        double fahr = (9 * celsius) / 5 + 32;
        return fahr;
    }




    }



