package weekend03.coinpo;

public class Hammer extends Tool {
    private double weight;

    public Hammer(String model, double price, double weight) {
        super(model, price);
        this.weight = weight;
    }
    public String showTool(){
        return super.showTool()+ ", masa: " + weight;
    }


    public double getWeight() {
        return weight;
    }



}
