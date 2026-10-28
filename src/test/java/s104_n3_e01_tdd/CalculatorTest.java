package s104_n3_e01_tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void calculatorStartsWithTotalZero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }
}
