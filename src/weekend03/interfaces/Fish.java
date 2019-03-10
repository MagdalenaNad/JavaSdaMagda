package weekend03.interfaces;

public class Fish implements Animal, Swimable {
    private String name;
    private int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "bul, bul";
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
