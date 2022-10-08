package org.lxx.sort;

public class QuickSort {
    public static void quickSort(int[] nums, int start , int end){
        if (nums == null || nums.length <= 1 || start >= end){
            return;
        }
        int i = start;
        int j = end;
        int target = nums[i];
        while (i < j){
            while (nums[j] >= target && i < j){
                j--;
            }
            if (i < j){
                swap(nums, i, j);
            }
            while (nums[i] <= target && i < j){
                i++;
            }
            if (i < j){
                swap(nums, i, j);
            }
        }
        quickSort(nums, start, i - 1);
        quickSort(nums, i + 1, end);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
