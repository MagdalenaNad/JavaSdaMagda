package weekend02.enums;

public enum Operation {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char sign;

    Operation(char sign) {
        this.sign = sign;
    }

    public double calculate(double a, double b) {
        double result = 0.0;
        switch (this) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case DIVIDE:
                result = a / b;
                break;
            case MULTIPLY:
                result = a * b;
                break;
        }
        return result;
    }
}
