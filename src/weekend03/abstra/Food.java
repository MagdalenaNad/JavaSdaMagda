package weekend03.abstra;

public abstract class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public abstract String getTaste();
    public abstract FoodType getType();

    public String describe(){
        return getType()+": " + name + " ma smak " + getTaste()+".";
    }

    public String getName() {
        return name;
    }
}
