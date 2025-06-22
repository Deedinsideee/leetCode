package ru.alexandr.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {
    @Test
    public void testExample1() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(3, result);
    }

    @Test
    public void testExample2() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(2, result);
    }

    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1, 1};
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(5, result);
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(0, result);
    }

    @Test
    public void testSingleOne() {
        int[] nums = {0, 0, 1, 0, 0};
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(1, result);
    }

    @Test
    public void testAlternating() {
        int[] nums = {1, 0, 1, 0, 1, 0};
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(1, result);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int result = MaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        assertEquals(0, result);
    }
}
