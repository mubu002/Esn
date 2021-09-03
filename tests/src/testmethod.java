import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testmethod {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", Metoder.toRoman(1));
    }
}

