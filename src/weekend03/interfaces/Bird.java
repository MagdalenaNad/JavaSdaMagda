package weekend03.interfaces;

public class Bird implements Animal, Flyable {
    private String name;
    private int age;


    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "que, que, que";
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
