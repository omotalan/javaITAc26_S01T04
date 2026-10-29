package s104_n3_e01_tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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
        calculator.add(number);
        assertThat(calculator.getTotal()).isEqualTo(number);
    }

    @ParameterizedTest(name = "El mètode add(x) incrementa el total.")
    @ValueSource(ints = {25})
    void subtractMethodSubtractsFromTotal(int number) {
        Calculator calculator = new Calculator();
        calculator.subtract(number);
        assertThat(calculator.getTotal()).isEqualTo(-number);
    }

    @ParameterizedTest(name = "El mètode multiply(x) multiplica el total pel valor passat.")
    @CsvSource({"21, 2"})
    void multiplyMethodMultipliesTotalByInput(int total, int number) {
        Calculator calculator = new Calculator(total);
        calculator.multiply(number);
        assertThat(calculator.getTotal()).isEqualTo(total*number);
    }

    @ParameterizedTest(name = "El mètode divide(x) actualitza correctament el total dividint pel valor.")
    @CsvSource({"15, 4"})
    void divideMethodDividesTotalByInput(double total, double number) {
        Calculator calculator = new Calculator(total);
        calculator.divide(number);
        assertThat(calculator.getTotal()).isEqualTo(total/number);
    }

    @ParameterizedTest(name = "Dividir per zero ha de generar una excepció (ArithmeticException).")
    @CsvSource({"15, 0"})
    void divideByZeroThrowsArithmeticException(double total, double number) {
        Calculator calculator = new Calculator(total);
        assertThatThrownBy(() -> {
            calculator.divide(number);
        }).isInstanceOf(ArithmeticException.class);
    }

    @ParameterizedTest(name = "El mètode reset() ha de tornar el total a 0.")
    @ValueSource(doubles = {35, 0, 198.4578})
    void resetMethodReturnsTotalToZero(double total) {
        Calculator calculator = new Calculator(total);
        calculator.reset();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @ParameterizedTest(name = "El mètode getTotal() ha de retornar el valor actual del total.")
    @ValueSource(doubles = {35, 3, 198.4578})
    void getTotalMethodReturnsCurrentTotal(double number) {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
        calculator.add(number);
        assertThat(calculator.getTotal()).isEqualTo(number);
        calculator.add(number/2);
        assertThat(calculator.getTotal()).isEqualTo(number+(number/2));
    }


}
