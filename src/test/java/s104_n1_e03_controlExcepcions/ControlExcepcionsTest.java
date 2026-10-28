package test.java.s104_n1_e03_controlExcepcions;

import main.java.s104_n1_e03_controlExcepcions.ControlExcepcions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControlExcepcionsTest {

    private int[] intList;

    @BeforeEach
    void setUp() {
        intList = new int[]{10, 20, 30};
    }


    @ParameterizedTest(name = "Ensure input index is not out of bounds")
    @ValueSource(ints = {5, 9})
    void throwsWhenIndexOutOfBounds(int input) {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ControlExcepcions.getItemByIndex(intList, input));
    }


}