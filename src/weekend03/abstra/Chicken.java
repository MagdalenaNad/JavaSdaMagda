package weekend03.abstra;

public class Chicken extends Meat{
    private String taste;

    public Chicken(String name, String taste) {
        super(name);
        this.taste = taste;
    }

    @Override
    public String getTaste() {
        return taste;
    }
}
