package s104_n2_e01_to_e07_assertJ;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MapaTest {

    @Test
    void assertMap() {
        Mapa testMap = new Mapa();

        // Exercici 5
        assertThat(testMap.getMap()).containsKey("Player2");
    }
}

