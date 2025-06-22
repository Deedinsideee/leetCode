package ru.alexandr.leetcode.medium;

import org.junit.jupiter.api.Test;
import ru.alexandr.leetcode.medium.LongestSubstringWithoutRepeatingCharacters;

import static org.junit.jupiter.api.Assertions.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testExample1() {
        String s = "abcabcbb";
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(3, result); // "abc"
    }

    @Test
    public void testExample2() {
        String s = "bbbbb";
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(1, result); // "b"
    }

    @Test
    public void testExample3() {
        String s = "pwwkew";
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(3, result); // "wke"
    }

    @Test
    public void testEmptyString() {
        String s = "";
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(0, result); // Пустая строка — длина 0
    }

    @Test
    public void testAllUnique() {
        String s = "abcdef";
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(6, result); // Вся строка уникальна
    }

    @Test
    public void testLongRepeatingPattern() {
        String s = "abcabcabcabc";
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(3, result); // "abc"
    }

    @Test
    public void testWithSpacesAndSymbols() {
        String s = "a b!c@d#e$f%g^";
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        assertEquals(14, result); // все уникальны
    }
}
