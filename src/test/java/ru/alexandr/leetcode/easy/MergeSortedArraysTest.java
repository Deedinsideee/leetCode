package ru.alexandr.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArraysTest {


    @Test
    public void testExample1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testExample2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testExample3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        MergeSortedArrays.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1}, nums1);
    }
}
