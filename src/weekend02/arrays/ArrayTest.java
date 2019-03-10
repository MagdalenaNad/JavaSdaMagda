package weekend02.arrays;

import weekend02.coinpo.Car;

public class ArrayTest {
    public static void main(String[] args) {

       ArrayTask1 arrayTask1=new ArrayTask1();
//        arrayTask1.showStringArrayFor("Alicja", "nie", "ma", "psa");
//        arrayTask1.showArrayForEach("Alicja", "nie", "ma", "psa");
//
//        System.out.println(arrayTask1.sumOfNumbersInArray(2, 4, 5, 7, 2, 1));
//
//        arrayTask1.showIntArrayFor(arrayTask1.evenNumberTable(16));
//
//        arrayTask1.showFloatArrayFor(arrayTask1.doubleFloatTable(3.14F,6.1F,34,-56.33F));
//
//        arrayTask1.firstLastMedium(1, 2 );

//        Car[] vehicles=new Car[4];
//        vehicles[0]= new Car("Seat", "red" );
//        vehicles[1]= new Car("Volvo", "black" );
//        vehicles[2]= new Car("Audi", "green" );
//        vehicles[3]= new Car("Fiat", "blue" );

      // arrayTask1.reverseCars(vehicles);
//        for(Car i : arrayTask1.reverseCars(vehicles)) {
//            System.out.println(i);
//        }
        int[][] addMyNumbers={{3, 2, 1, 4},{5, 4, 3}, {7, 6, 5, 1}};
        System.out.println(arrayTask1.sumOfNumbersInTwoDimentionArray(addMyNumbers));

    }
}
