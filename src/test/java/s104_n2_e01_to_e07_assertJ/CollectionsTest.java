package s104_n2_e01_to_e07_assertJ;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;

public class CollectionsTest {

    // Exercici 4
    @Test
    void exercici4AssercionsLlistes() {
        Cotxe cotxe = new Cotxe("SEAT");
        Passatger passatger = new Passatger("Ada");
        String text = "M'agrada el meu cotxe!";
        String textNotAdded = "Odio el meu cotxe.";

        ArrayList<Object> llistaDiversa = new ArrayList<>();
        llistaDiversa.add(cotxe);
        llistaDiversa.add(passatger);
        llistaDiversa.add(text);

        // Assertions
        assertThat(llistaDiversa).containsExactly(cotxe, passatger, text);
        assertThat(llistaDiversa).containsExactlyInAnyOrder(passatger, cotxe, text);
        assertThat(llistaDiversa).containsOnlyOnce(passatger);
        assertThat(llistaDiversa).doesNotContain(textNotAdded);
    }

}
