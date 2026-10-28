package s104_n3_e01_tdd;

public class Calculator {
    private int total = 0;

    public Calculator() {
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
}
