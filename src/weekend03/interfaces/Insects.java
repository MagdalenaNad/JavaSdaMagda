package weekend03.interfaces;

public class Insects implements Animal, Flyable {
    private String name;
    private int age;

    public Insects(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "bzzzzz";
    }

    @Override
    public String fly() {
        return name + " lata";
    }

    @Override
    public int getAge() {
        return age;
    }
}
