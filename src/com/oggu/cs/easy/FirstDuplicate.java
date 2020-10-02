package com.oggu.cs.easy;

import java.util.Arrays;

public class FirstDuplicate {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 1, 3, 5, 3, 2};
        System.out.println(Arrays.toString(nums) + " -- firstDuplicate: " + firstDuplicate(nums));

        nums = new int[]{2, 1, 1, 3, 5, 3, 2};
        System.out.println(Arrays.toString(nums) + " -- firstDuplicate: " + firstDuplicate(nums));
    }

    static int firstDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            if (nums[Math.abs(nums[i]) - 1] < 0) return Math.abs(nums[i]);
            else nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] * -1;

        return -1;
    }
}
