package weekend03.abstra;

public class FoodTaste {
    public static void main(String[] args) {
        Chicken chicken=new Chicken("Kurczak pieczony", "soczysty");
        Ham ham=new Ham("Szynka parmeńska", "słony");
        Carrot carrot=new Carrot("Marchewka", "słodki");
        Salad salad=new Salad("Saładka jarzynowa", "świąt");

        Food[] menu={chicken, ham, carrot, salad};

        for (Food food : menu) {
            System.out.println(food.describe());
        }
    }
}
