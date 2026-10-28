package s104_n2_e01_to_e07_assertJ;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static s104_n2_e01_to_e07_assertJ.OutOfBounds.getItemByIndex;

class OutOfBoundsTest {

    // Exercici 6
    @ParameterizedTest(name = "Ensure input index is not out of bounds")
    @ValueSource(ints = {5, 9})
    void assertIndexOutOfBoundsError(int index) {
        assertThatThrownBy(() -> getItemByIndex(new int[]{10, 20, 30}, index))
                .isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}