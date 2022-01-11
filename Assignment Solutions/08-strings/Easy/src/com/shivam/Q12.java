package com.shivam;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        String ans=reverseWords("Shivam Jain");
        System.out.println(ans);

    }
    public  static String reverseWords(String s) {
        StringBuilder str = new StringBuilder(" ");
        for (int cnum = s.length()-1; cnum >=0 ; cnum--) {
            str.append(s.charAt(cnum));

        }
        return str.toString();
    }
}
