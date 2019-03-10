package weekend03.abstra;

public class Ham extends Meat {
    private String taste;

    public Ham(String name, String taste) {
        super(name);
        this.taste = taste;
    }

    @Override
    public String getTaste() {
        return taste;
    }
}
