package weekend03.abstra;

public abstract class Meat extends Food {

    public Meat(String name) {
        super(name);
    }
    public FoodType getType(){return FoodType.MEAT;}

}
