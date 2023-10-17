package fr.wildcodeschool.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException("L'argument 'candidate' ne peut pas être null");
        }

        String vowels = "";
        char[] letters = candidate.toCharArray();

            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }
        return vowels;
    }


    @Test
    @DisplayName("Return voyels if only voyels in argument")
    void vowelsWithVowelsOnly() {
        String input = "aeiou";
        assertEquals("aeiou", vowels(input));
    }

    @Test
    @DisplayName("Return doublons")
    void vowelsWithVowelsDoublonsy() {
        String input = "aeiouiuiu";
        assertEquals("aeiouiuiu", vowels(input));
    }

    @Test
    @DisplayName("Return empty string if consonant only")
    void vowelsWithConsonantsOnly() {
        String input = "trpbncvfd";
        assertEquals("", vowels(input));
    }

    @Test
    @DisplayName("Return empty string if numbers only")
    void vowelsWithnumber() {
        String input = "684843548";
        assertEquals("", vowels(input));
    }


    @Test
    @DisplayName("Return empty string if null argument")
    void vowelsWithnull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> {
            vowels(input);
        });
    }

}