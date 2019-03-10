package weekend03.abstra;

public class Recipe {
    private String name;
    private Food[] ingredients;
    private int numberOfIngredients;

    public Recipe(String name, Food... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Recipe(String name, int numberOfIngredients) {
        this.name = name;
        this.numberOfIngredients = numberOfIngredients;
    }

//    Dodaj metodę do dodawania składników do listy.

}
