package weekend02.arrays;

import weekend02.coinpo.Car;

public class ArrayTask1 {
    public void showStringArrayFor(String... table) {
        for (int i = 0; i < table.length; i++) System.out.print(table[i] + " ");
        System.out.println("");
    }
    public void showIntArrayFor(int... table) {
        for (int i = 0; i < table.length; i++) System.out.print(table[i] + " ");
        System.out.println("");
    }
    public void showFloatArrayFor(float... table) {
        for (int i = 0; i < table.length; i++) System.out.print(table[i] + " ");
        System.out.println("");
    }
    public void showArrayForEach(String... table) {
        for (String i : table) {
            System.out.println(i);
        }
    }

    public int sumOfNumbersInArray(int... table) {
        int k = 0;
        for (int i = 0; i < table.length; i++) {
            k = k + table[i];
        }
        return k;
    }
    public int sumOfNumbersInTwoDimentionArray(int[][] table) {
        int k = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j=0; j<table[i].length; j++){
            k = k + table[i][j];
        }
        }
        return k;
    }

    public int[] evenNumberTable(int count){
        int[] table = new int[count];
        for (int i = 0; i < count; i++) table[i] = 2 * (i+1);
        return table;
    }
    public float[] doubleFloatTable(float... table){
        float[] doubleTable = new float[table.length];
        for (int i = 0; i < table.length; i++) doubleTable[i] = 2 * table[i];
        return doubleTable;
    }

//    Napisz metodę, która jako parametr przyjmuje zmienną typu double[] i wyświetla na konsoli:
//    pierwszy, środkowy (jeden lub dwa środkowe) i ostatni element tablicy, a także średnią
//    arytmetyczną wszystkich liczb z tabeli.

    public void firstLastMedium(double... table){
        double first=table[0];
        double last=table[table.length-1];
        System.out.println("Pierwszy: " + first);
        if (table.length%2==1){
            double medium=table[(int)table.length/2];
            System.out.println("Środkowy: " + medium);
        }
        else {
            double medium1=table[table.length/2-1];
            double medium2=table[table.length/2];
            System.out.println("Środkowe: "+ medium1+" oraz "+ medium2);
        }
        System.out.println("Ostatni: "+ last);
        double k = 0;
        for (int i = 0; i < table.length; i++) {
            k = k + table[i];
        }
        System.out.println("Średnia wyrazów wynosi: " + k/table.length);
    }
//    Napisz metodę, która jako parametr przyjmuje zmienną typu Car[]
//    (klasę Car powinieneś mieć utworzoną w ramach poprzednich zadań) i zwróci tablicę z odwróconą kolejnością elementów.
    public Car[] reverseCars(Car... vehicles){
        Car[] reVehicles= new Car[vehicles.length];
        for (int i=0; i<vehicles.length; i++){
            reVehicles[i]=vehicles[vehicles.length-1-i];
        }
        return reVehicles;
    }
}
