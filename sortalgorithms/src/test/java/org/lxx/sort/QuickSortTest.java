package org.lxx.sort;


import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] nums = {4, 5, 7, 8, 6, 5, 44, 87};
        QuickSort.quickSort(nums, 0, 7);
        Assert.assertArrayEquals(nums, new int[]{4,5,5,6,7,8,44,87});
    }
}