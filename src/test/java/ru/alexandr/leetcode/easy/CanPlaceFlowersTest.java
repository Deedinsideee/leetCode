package ru.alexandr.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersTest {

    @Test
    public void testExample1() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertTrue(result);
    }

    @Test
    public void testExample2() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertFalse(result);
    }

    @Test
    public void testEmptySpots() {
        int[] flowerbed = {0, 0, 0, 0, 0};
        int n = 2;
        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertTrue(result); // можно посадить в позиции 0 и 3, например
    }

    @Test
    public void testFull() {
        int[] flowerbed = {1, 0, 1, 0, 1};
        int n = 1;
        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertFalse(result);
    }

    @Test
    public void testEdgeSingleEmpty() {
        int[] flowerbed = {0};
        int n = 1;
        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertTrue(result);
    }

    @Test
    public void testEdgeSingleFull() {
        int[] flowerbed = {1};
        int n = 1;
        boolean result = CanPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertFalse(result);
    }


}
