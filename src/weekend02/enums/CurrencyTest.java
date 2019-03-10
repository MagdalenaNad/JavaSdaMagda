package weekend02.enums;

public class CurrencyTest {
    public static void main(String[] args) {
        Currency.EURO.exchangeFromPln(34.13);
        Currency.EURO.exchangeToPln(100.29);

        System.out.println(Operation.PLUS.calculate(3,6));
        System.out.println(Operation.DIVIDE.calculate(3,6));
        Currency.POUND.exchangeFromPln(20.25);
        Currency.POUND.exchangeToPln(500.32);
        System.out.println(Currency.JEN);
        Currency value=Currency.valueOf("ZLOTY");
        System.out.println(value);

    }

}
