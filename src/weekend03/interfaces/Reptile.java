package weekend03.interfaces;

public class Reptile implements Animal, Swimable {
    private String name;
    private int age;

    public Reptile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "oOoO";
    }

    @Override
    public String swim() {
        return name + " pływa";
    }

    @Override
    public int getAge() {
        return age;
    }
}
