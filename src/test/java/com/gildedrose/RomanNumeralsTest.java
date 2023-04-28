package com.gildedrose;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class RomanNumeralsTest {

    @Test
    public void shouldConvertSingleDigitNumberToRoman() {
        int number = 1;
        assertTrue(RomanNumerals.decimalToRoman(number).equals("I"));
    }

    @Test
    public void shouldConvertAnyDigitToRoman() {
        int number = 14;
        assertTrue(RomanNumerals.decimalToRoman(number).equals("XIV"));
    }
}
