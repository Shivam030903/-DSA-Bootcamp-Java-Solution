package com.shivam;

public class Q10 {
    public static void main(String[] args) {
        String word = "abc";
        String[] patterns = {"a","abc","bc","d"};
        int ans=numOfStrings(patterns,word);
        System.out.println(ans);

    }
    public static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            char words=word.charAt(i);
            for (int j = 0; j < patterns.length; j++) {
                String indivisual=patterns[i];
                for (int k = 0; k < indivisual.length(); k++) {
                    if (words==indivisual.charAt(k));
                    count++;
                }
            }
        }

        return count;

    }
}
