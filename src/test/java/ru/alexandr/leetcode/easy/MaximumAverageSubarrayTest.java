package ru.alexandr.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumAverageSubarrayTest {

    private static final double DELTA = 1e-6; // точность сравнения

    @Test
    public void testExample1() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(12.75, result, DELTA);
    }

    @Test
    public void testExample2() {
        int[] nums = {5};
        int k = 1;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(5.0, result, DELTA);
    }

    @Test
    public void testAllNegative() {
        int[] nums = {-10, -20, -30, -5, -15};
        int k = 2;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        // Максимальное среднее будет (-5 + -15) / 2 = -10
        assertEquals(-10.0, result, DELTA);
    }

    @Test
    public void testAllPositive() {
        int[] nums = {4, 4, 4, 4, 4};
        int k = 3;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        // Любой подмассив длины 3 даст среднее 4
        assertEquals(4.0, result, DELTA);
    }

    @Test
    public void testKEqualsN() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        // Среднее всего массива (1+2+3+4+5)/5 = 3
        assertEquals(3.0, result, DELTA);
    }
}
