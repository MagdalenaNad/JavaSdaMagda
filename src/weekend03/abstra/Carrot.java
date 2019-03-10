package weekend03.abstra;

public class Carrot extends Vegetable {
    private String taste;

    public Carrot(String name, String taste) {
        super(name);
        this.taste = taste;
    }

    @Override
    public String getTaste() {
        return taste;
    }
}
