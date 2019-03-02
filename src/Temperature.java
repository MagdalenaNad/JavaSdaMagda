public class Temperature {
   // Utwórz nową klasę Temperature, która będzie posiadała pola: double temperature, String date, String hour.
    // Klasa określa temperaturę w skali Celsjusza w konkretnym dniu i o konkretnej godzinie.
    // Dodaj konstruktor inicjalizujący wszystkie trzy pola, metody-gettery dla każdego pola + dodaj metodę show()
    // która będzie zwracała napis w postaci: {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C

    double temperature;
    String date;
    String hour;

    public Temperature() {
    }

    public Temperature(double temperature, String date, String hour) {
        this.temperature = temperature;
        this.date = date;
        this.hour = hour;

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    public void show(){
        System.out.println(date +" "+ hour + " - " + temperature + (char)176 +"C");
    }
    public void showInFahrenheit(){
        FahrenheitConverter fahrenheitConverter=new FahrenheitConverter();
        System.out.println(date +" "+ hour + " - " + fahrenheitConverter.convertToFahrenheit(temperature) + (char)176 +"F");
    }

}
