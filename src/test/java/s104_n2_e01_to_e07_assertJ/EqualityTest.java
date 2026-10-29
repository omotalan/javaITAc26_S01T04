package s104_n2_e01_to_e07_assertJ;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EqualityTest {

    // Exercici 1
    @Test
    void shouldReturnTrueWhenValuesAreIdentical() {
        Integer num1 = 42;
        Integer num2 = 42;

        assertThat(num1).isEqualTo(num2);
    }

    @Test
    void shouldReturnFalseWhenValuesDiffer() {
        Integer num1 = 42;
        Integer num2 = 99;

        assertThat(num1).isNotEqualTo(num2);
    }

    // Exercici 2
    @Test
    void shouldReturnTrueWhenReferenceIsEqual() {
        Integer num3 = 42;
        Integer num4 = num3;

        assertThat(num3).isSameAs(num4);
    }

    @Test
    void shouldReturnFalseWhenReferenceIsDifferent() {
        Integer num3 = 42;
        Integer num4 = 36;

        assertThat(num3).isNotSameAs(num4);
    }

    // Exercici 3
    @Test
    void shouldReturnTrueWhenContentsMatch() {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};

        assertThat(first).isEqualTo(second);
    }

    @Test
    void shouldReturnFalseWhenContentsDiffer() {
        int[] first = {1, 2, 3};
        int[] second = {1, 78, 3};

        assertThat(first).isNotEqualTo(second);
    }
}