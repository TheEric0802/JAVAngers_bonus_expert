package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void csvToArray_ShouldReturnArrayWithOneEmptyElement_WhenInputIsEmptyString() {
        assertArrayEquals(new String[]{""}, Main.csvToArray(""));
    }

    @Test
    void csvToArray_ShouldReturnArrayWithOneElement_WhenInputIsSingleString() {
        assertArrayEquals(new String[]{"Affe"}, Main.csvToArray("Affe"));
    }

    @Test
    void csvToArray_ShouldReturnArrayWithMultipleElements_WhenInputIsCommaSeparatedString() {
        assertArrayEquals(new String[]{"Affe", "Banane", "Pferd", "Tisch"}, Main.csvToArray("Affe,Banane,Pferd,Tisch"));
    }

    @Test
    void getQuersumme_ShouldReturn0_WhenInputIs0() {
        assertEquals(0, Main.getQuersumme(0));
    }

    @Test
    void getQuersumme_ShouldReturn5_WhenInputIs5() {
        assertEquals(5, Main.getQuersumme(5));
    }

    @Test
    void getQuersumme_ShouldReturn15_WhenInputIs12345() {
        assertEquals(15, Main.getQuersumme(12345));
    }

    @Test
    void getRomanNumber_ShouldReturnX_WhenInputIs10() {
        assertEquals("X", Main.getRomanNumber(10));
    }

    @Test
    void getRomanNumber_ShouldReturnIII_WhenInputIs3() {
        assertEquals("III", Main.getRomanNumber(3));
    }

    @Test
    void getRomanNumber_ShouldReturnVIII_WhenInputIs8() {
        assertEquals("VIII", Main.getRomanNumber(8));
    }

    @Test
    void getRomanNumber_ShouldReturnXV_WhenInputIs15() {
        assertEquals("XV", Main.getRomanNumber(15));
    }

    @Test
    void getRomanNumber_ShouldReturnXXIX_WhenInputIs29() {
        assertEquals("XXIX", Main.getRomanNumber(29));
    }

    @Test
    void getRomanNumber_ShouldReturnXLVII_WhenInputIs47() {
        assertEquals("XLVII", Main.getRomanNumber(47));
    }

    @Test
    void getRomanNumber_ShouldReturnLXXXIV_WhenInputIs84() {
        assertEquals("LXXXIV", Main.getRomanNumber(84));
    }

    @Test
    void getRomanNumber_ShouldReturnCXXIII_WhenInputIs123() {
        assertEquals("CXXIII", Main.getRomanNumber(123));
    }

    @Test
    void getRomanNumber_ShouldReturnCCXLV_WhenInputIs245() {
        assertEquals("CCXLV", Main.getRomanNumber(245));
    }

    @Test
    void getRomanNumber_ShouldReturnDCCLXXVIII_WhenInputIs778() {
        assertEquals("DCCLXXVIII", Main.getRomanNumber(778));
    }

    @Test
    void getRomanNumber_ShouldReturnMDCCCXLIV_WhenInputIs1844() {
        assertEquals("MDCCCXLIV", Main.getRomanNumber(1844));
    }
}