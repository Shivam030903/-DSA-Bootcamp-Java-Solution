package com.shivam;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[]nums = {0,2,1,5,3,4};
        int[] ans=new int[6];
        permutation(nums,ans);
        System.out.println(Arrays.toString(ans));
    }

    private static void permutation(int[] nums, int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            ans[i]=nums[nums[i]];
        }
    }
}
