package test.java.s104_n1_e02_dni;

import main.java.s104_n1_e02_dni.CalculoDni;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculoDniTest {

    private final CalculoDni calcDni = new CalculoDni();

    @ParameterizedTest(name = "Assign correct letter to DNI base number")
    @CsvSource({
            "98754632, S",
            "12345678, Z",
            "21759846, Y",
            "36170585, A",
            "42424242, Y",
            "98765432, M",
            "75649823, V",
            "87654321, X",
            "12398755, F",
            "60898129, V",
            "31415926, L",
            "28419926, E"
    })

    void appliesFormulaToEightDigitNumbers(int input, char expected) {
        assertEquals(expected, calcDni.calculateDniLetter(input));
    }

    @ParameterizedTest(name = "Throws on negative numbers")
    @ValueSource(ints = {-789456, -87654321, -28_419_926})
    void rejectsNegativeNumbers(int input) {
        assertThrows(IllegalArgumentException.class, () -> calcDni.validatePositiveNumber(input));
    }


    @ParameterizedTest(name = "Throws on numbers that are not eight digits long")
    @ValueSource(ints = {0, -1234567, 9_999_999, 100_000_000})
    void rejectsNumbersThatAreNotEightDigits(int input) {
        assertThrows(IllegalArgumentException.class, () -> calcDni.validateNumberSize(input));
    }
}
