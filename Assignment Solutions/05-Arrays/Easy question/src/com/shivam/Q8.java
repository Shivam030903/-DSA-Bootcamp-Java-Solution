package com.shivam;

//Input: nums = [8,1,2,2,3]
//        Output: [4,0,1,1,3]

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] small= smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(small));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int greater=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    greater++;
                }
            }
            ans[i]=greater;
        }

        return ans;
    }
}
