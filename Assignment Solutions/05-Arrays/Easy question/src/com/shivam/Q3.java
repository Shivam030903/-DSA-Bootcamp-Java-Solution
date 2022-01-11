package com.shivam;

import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {
	// write your code here
        int[] arr= {1,2,3,4};
        runningSum(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] runningSum(int[] nums) {
        int temp=0;
        for (int i = 1; i <= nums.length-1; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }

}
