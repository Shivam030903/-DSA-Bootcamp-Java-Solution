package com.shivam;

public class Q5 {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        String result = sortSentence(str);
        System.out.println(result);
    }


    public static String sortSentence(String s) {
        String[] strarr = s.split(" ");
        String[] temp = new String[strarr.length];
        String res = "";
        for (int i = 0; i < strarr.length; i++) {
            int index = strarr[i].charAt(strarr[i].length() - 1) - '0';
            temp[index - 1] = strarr[i].substring(0, strarr[i].length() - 1);
        }
        for (int i = 0; i < temp.length; i++) {
            res += temp[i] + " ";
        }


        return res.trim();

    }
}