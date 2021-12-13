package com.shivam;

public class Q13 {
    public static void main(String[] args) {
        rangeprime(1,100);
    }

    private static void rangeprime(int start, int end ) {
        while (start<=end){
            int c=2;
            while (c<start){
                if (start%c==0){
                    // System.out.println("Not prime ");
                }
                if (start%c!=0){
                    System.out.println(start);
                }
                c++;
            }

//            System.out.print(start + " ");
            start++;
        }
    }
}
