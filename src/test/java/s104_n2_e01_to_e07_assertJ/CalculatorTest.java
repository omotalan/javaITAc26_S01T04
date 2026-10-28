package s104_n2_e01_to_e07_assertJ;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // Exercici 1
    @Test
    void shouldReturnTrueWhenValuesAreIdentical() {
        boolean result = calculator.areNumbersEqual(42, 42);
        assertThat(result).isTrue();
    }

    // Exercici 2
    @Test
    void shouldReturnFalseWhenValuesDiffer() {
        boolean result = calculator.areNumbersEqual(42, 99);
        assertThat(result).isFalse();
    }

    // Exercici 3
    @Test
    void shouldReturnTrueWhenContentsMatch() {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};

        boolean result = calculator.areArraysIdentical(first, second);
        assertThat(result).isTrue();
    }
}