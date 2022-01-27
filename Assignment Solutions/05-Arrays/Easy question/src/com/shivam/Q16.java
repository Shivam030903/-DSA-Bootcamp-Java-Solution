package com.shivam;

public class Q16 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans=findNumbers(nums);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums) {
        int even=0;
        for (int i = 0; i < nums.length; i++) {
            int ans=count(nums[i]);
            if (ans%2==0){
                even++;
            }
        }
        return even;
    }
    private static int count(int i) {
        int ans=0;
        while (i>0){
            i=i/10;
            ans++;
        }
        return ans;
    }
}
