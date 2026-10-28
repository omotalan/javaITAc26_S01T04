package s104_n3_e01_tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    @DisplayName("El total inicial és 0.")
    void calculatorStartsWithTotalZero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @ParameterizedTest(name = "El mètode add(x) incrementa el total.")
    @ValueSource(ints = {5})
    void addMethodAddsToTotal(int number) {
        Calculator calculator = new Calculator();
        assertThat(calculator.add(number)).isEqualTo(number);
    }

    @ParameterizedTest(name = "El mètode add(x) incrementa el total.")
    @ValueSource(ints = {25})
    void subtractMethodSubtractsFromTotal(int number) {
        Calculator calculator = new Calculator();
        assertThat(calculator.subtract(number)).isEqualTo(-number);
    }

    @ParameterizedTest(name = "El mètode multiply(x) multiplica el total pel valor passat.")
    @CsvSource({"21, 2"})
    void multiplyMethodMultipliesTotalByInput(int total, int number) {
        Calculator calculator = new Calculator(total);
        assertThat(calculator.multiply(number)).isEqualTo(total*number);
    }

    @ParameterizedTest(name = "El mètode divide(x) actualitza correctament el total dividint pel valor.")
    @CsvSource({"15, 4"})
    void divideMethodDividesTotalByInput(double total, double number) {
        Calculator calculator = new Calculator(total);
        assertThat(calculator.divide(number)).isEqualTo(total/number);
    }


}
