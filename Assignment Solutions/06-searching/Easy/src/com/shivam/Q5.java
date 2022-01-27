package com.shivam;

public class Q5 {
    public static void main(String[] args) {
        boolean ans=isPerfectSquare(16);
        System.out.println(ans);

    }
    public  static boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (mid*mid==num){
                return true;
            }else if (mid*mid>num){
                end=mid-1;
            }else if (mid*mid<num){
                start=mid+1;
            }
        }
        return false;

    }
}
