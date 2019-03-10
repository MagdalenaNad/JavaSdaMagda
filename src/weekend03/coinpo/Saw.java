package weekend03.coinpo;

public class Saw extends Tool {
    private double lenght;

    public Saw(String model, double price, double lenght) {
        super(model, price);
        this.lenght = lenght;
    }
    public String showTool(){
        return super.showTool()+ ", długość: " + lenght;
    }

    public double getLenght() {
        return lenght;
    }
}
