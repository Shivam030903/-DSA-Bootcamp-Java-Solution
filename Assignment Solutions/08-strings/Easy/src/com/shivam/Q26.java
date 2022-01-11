package com.shivam;

import java.util.Arrays;

public class Q26 {
    public static void main(String[] args) {
        String s = "Hello World";
//        String[] strarr=s.split(" ");
//        System.out.println(Arrays.toString(strarr));
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
    public static int lengthOfLastWord(String str) {

        if (str==null &&str.length()==0){
            return -1;
        }
        str=str.trim();
        int count=0;
        String[] strarr=str.split(" ");
        String ansstr=strarr[strarr.length-1];

        for (int i = 0; i < ansstr.length(); i++) {
            count++;
        }

        return count;

    }
}
