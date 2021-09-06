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
    void shouldConvert3toIII() {
        assertEquals("III", Metoder.toRoman(3), "Should return III");
    }
    @Test
    void shouldConvert4toIV() {
        assertEquals("IV", Metoder.toRoman(4), "Should return IV");
    }
    @Test
    void shouldConvert5toV() {
        assertEquals("V", Metoder.toRoman(5), "Should return V");
    }
    @Test
    void shouldConvert6toVI() {
        assertEquals("VI", Metoder.toRoman(6), "Should return VI");
    }
    @Test
    void shouldConvert7toVII() {
        assertEquals("VII", Metoder.toRoman(7), "Should return VII");
    }
    @Test
    void shouldConvert8toVIII() {
        assertEquals("VIII", Metoder.toRoman(8), "Should return VIII");
    }
    @Test
    void shouldConvert9toIX() {
        assertEquals("IX", Metoder.toRoman(9), "Should return IX");
    }
    @Test
    void shouldConvert37toXXXVII() {
        assertEquals("XXXVII", Metoder.toRoman(37), "Should return XXXVII");
    }
    @Test
    void shouldConvert50toL() {
        assertEquals("L", Metoder.toRoman(50), "Should return L");
    }
    @Test
    void shouldConvert100toC() {
        assertEquals("C", Metoder.toRoman(100), "Should return C");
    }
    @Test
    void shouldConvert500toD() {
        assertEquals("D", Metoder.toRoman(500), "Should return D");
    }
    @Test
    void shouldConvert1000toM() {
        assertEquals("M", Metoder.toRoman(1000), "Should return M");
    }
    @Test
    void shouldConvert509toDIX() {
        assertEquals("DIX", Metoder.toRoman(509), "Should return DIX");
    }
}

