package s104_n3_e01_tdd;

public class Calculator {
    private double total;

    public Calculator(double total) {
        this.total = total;
    }

    // Overload constructor to make total arg optional
    public Calculator() {
        this.total = 0;
    }

    public double getTotal() {
        return total;
    }

    public double add(double number) {
        return total += number;
    }

    public double subtract(double number) {
        return total -= number;
    }

    public double multiply(double number) {
        return total * number;
    }

    public double divide(double number) {
        return total / number;
    }
}
