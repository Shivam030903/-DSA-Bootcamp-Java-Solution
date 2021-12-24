package com.shivam;

import java.util.Scanner;

public class Q13 {
//    Ques 13 -->  Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Starting range");
        int start=input.nextInt();
        System.out.println("Enter ending range");
        int end = input.nextInt();
        rangeprime(start,end);
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
