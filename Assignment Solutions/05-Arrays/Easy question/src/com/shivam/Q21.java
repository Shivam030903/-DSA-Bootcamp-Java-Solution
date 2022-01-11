package com.shivam;

import java.util.Arrays;

public class Q21 {
    public static void main(String[] args) {
        // Two sum;
        int[] nums = {3,2,4};
        int target = 6;
        int[] arr=twoSum(nums,target);
        System.out.println(Arrays.toString(arr));
    }
    public  static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = i+1; j <=nums.length-1 ; j++) {
                if (nums[i] + nums[j] == target){
                    int[] arr= new int[]{i, j};
                    return arr;
                }
            }
        }

        return new int[]{-1, -1};
    }

}
