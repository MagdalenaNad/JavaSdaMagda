package weekend02.enums;

public enum Currency {
    ZLOTY(1, "PLN"),
    DOLAR(3.8, "USD"),
    EURO(4.3, "EUR"),
    JEN(3.4, "JPY"),
    POUND(5.1, "GBP");

    protected double currency;
    protected String symbol;

    Currency(double currency, String symbol) {
        this.currency = currency;
        this.symbol = symbol;
    }

    Currency() {
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currency=" + currency +
                ", symbol='" + symbol + '\'' +
                '}';
    }

    public double getCurrency() {
        return currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void exchangeFromPln(double n) {
        double ex = n / currency;
        int k = (int) (100 * ex);
        System.out.println(n + " PLN -> " + (double) k / 100 + " " + symbol);

    }

    public void exchangeToPln(double n) {
        double ex = n * currency;
        int k = (int) (100 * ex);
        System.out.println(n + " " + symbol + " -> " + (double) k / 100 + " PLN");

    }


}
