package s104_n2_e01_to_e07_assertJ;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OptionalBuitTest {

    OptionalBuit opBuit = new OptionalBuit();

    // Exercici 7
    @Test
    void assertOptionalBuitIsEmpty() {
        assertThat(opBuit.optionalBuit).isEmpty();
    }

}