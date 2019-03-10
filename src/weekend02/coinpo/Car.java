package weekend02.coinpo;

public class Car {
    private String brand;
    private String color;
    private Entertainment entertainmet = new Entertainment(0, 1);


    public Car(String brand, String color, Entertainment entertainmet) {
        this.brand = brand;
        this.color = color;
        this.entertainmet = entertainmet;
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void turnOnOF() {
        entertainmet.turnOnTurnOf();
    }

    public void selectStation(int station) {
        if (station > 0 && station < 100) {
            entertainmet.setStation(station);
        } else {
            System.out.println("Maximum station number is 100");
            entertainmet.setStation(100);
        }
    }

    public void changeVolume(double volume) {
        if (volume >= 0 && volume < 30) {
            entertainmet.setVolume(volume);
        } else {
            System.out.println("Maximum volume is 30.0");
            entertainmet.setVolume(30);
        }
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", entertainmet=" + entertainmet;
    }
}

