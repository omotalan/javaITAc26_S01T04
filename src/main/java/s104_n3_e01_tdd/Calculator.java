package s104_n3_e01_tdd;

public class Calculator {
    private int total;

    public Calculator(int total) {
        this.total = total;
    }

    // Overload constructor to make total arg optional
    public Calculator() {
        this.total = 0;
    }

    public int getTotal() {
        return total;
    }

    public int add(int number) {
        return total += number;
    }

    public int subtract(int number) {
        return total -= number;
    }

    public int multiply(int number) {
        return total * number;
    }
}
