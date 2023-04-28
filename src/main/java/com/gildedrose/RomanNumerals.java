package com.gildedrose;

public class RomanNumerals {

    private static final String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] DECIMALS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static String decimalToRoman(int decimal) {
        StringBuilder roman = new StringBuilder();
        int i = 0;
        while (decimal > 0) {
            if (decimal - DECIMALS[i] >= 0) {
                roman.append(ROMAN_NUMERALS[i]);
                decimal -= DECIMALS[i];
            } else {
                i++;
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        int decimal = 1234;
        String roman = decimalToRoman(decimal);
        System.out.println(decimal + " in Roman numerals is " + roman);
    }
}
