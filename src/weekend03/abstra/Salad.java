package weekend03.abstra;

public class Salad extends Vegetable{
    private String taste;

    public Salad(String name, String taste) {
        super(name);
        this.taste = taste;
    }

    @Override
    public String getTaste() {
        return taste;
    }
}
