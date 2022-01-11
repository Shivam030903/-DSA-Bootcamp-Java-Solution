package com.shivam;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {7};
        int target = 7;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] pos = new int[2];
        pos[0]=-1;
        pos[1]=-1;
        for (int i = 0; i < n; i++) {
            if (nums[i]==target){
                pos[0]=i;
                break;
            }
        }
        for (int j = n-1; j >= 0; j--) {
            if (nums[j]==target){
                pos[1]=j;
                break;
            }
        }
        return pos;
    }
}
