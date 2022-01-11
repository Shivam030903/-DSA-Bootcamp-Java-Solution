package com.shivam;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans=largestAltitude(gain);
        System.out.println(ans);

    }
    public static int largestAltitude(int[] gain) {
        int nlength=gain.length+1;
        int[] arr=new int[nlength];
        arr[0]=0;
        for (int i = 1; i < nlength; i++) {
            arr[i]=gain[i-1];
        }
        for (int i = 1; i < nlength; i++) {
            arr[i]=arr[i]+arr[i-1];
        }

        int max=arr[0];
        for (int i = 1; i < nlength; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;



    }
}
