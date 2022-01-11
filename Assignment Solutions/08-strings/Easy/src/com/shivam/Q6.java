package com.shivam;

public class Q6 {
    public static void main(String[] args) {
//        Q6 -->  Check if two strings are equivalent
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean cond=arrayStringsAreEqual(word1,word2);
        System.out.println(cond);

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1s="";
        String word2s="";
        for (int i = 0; i < word1.length; i++) {
            word1s+=word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            word2s+=word2[i];
        }
        if (word1s.equals(word2s)){
            return true;
        }else {
            return false;
        }




    }
}
