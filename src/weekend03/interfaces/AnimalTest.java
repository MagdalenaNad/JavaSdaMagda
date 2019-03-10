package weekend03.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        Bird mewa=new Bird("Mewa śmieszka", 6);
        Fish rybka=new Fish("Błazenek", 1);
        Insects robak=new Insects("Osa", 3);
        Reptile gad=new Reptile("Gekon", 103);
        Animal[] animals={mewa, rybka, robak, gad};

        for (Animal animal : animals) {
            animal.print();

        }
    }

}
