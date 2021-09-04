import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testmethod {
    @Test
    void shouldConvert1ToI() {
         assertEquals("I", Metoder.toRoman(1), "Should return I");

    }
    @Test
    void shouldConvert2toII() {
        assertEquals("II", Metoder.toRoman(2), "Should return II");
    }
    @Test
    void shouldConvert3toII() {
        assertEquals("III", Metoder.toRoman(3), "Should return III");
    }
}

