package com.shivam;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String result=restoreString(s,indices);
        System.out.println(Arrays.toString(new String[]{result}));
    }
    public static String restoreString(String s, int[] indices) {
        char[] chararr=new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chararr[indices[i]]=s.charAt(i);
        }
        return String.valueOf(chararr);
    }
}
