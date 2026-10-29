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

    public void add(double number) {
        this.total += number;
    }

    public void subtract(double number) {
        this.total -= number;
    }

    public void multiply(double number) {
        this.total = this.total * number;
    }

    public void divide(double number) {
        if (number == 0.0) {
            throw new ArithmeticException("Division by zero is undefined.");
        }
        this.total = this.total / number;
    }

    public void reset() {
        this.total = 0;
    }
}
