package pl.javastart.security.calculator;

public class Calculator {
    static Result calculate (double a, double b, String operator) {
        double result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Undefinied operator: " + operator);
        };
        return new Result(a, b, operator, result);
    }
}
