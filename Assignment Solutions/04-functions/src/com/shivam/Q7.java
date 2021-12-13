package com.shivam;

import java.util.Scanner;

public class Q7 {
    /*
    Ques 7 -->  Define a method to find out
    if a number is prime or not.

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num=in.nextInt();
        System.out.println(isprime(2));

    }

    private static boolean isprime(int num) {
        int count=2;
        while (count<num){
            if (num%count==0){
//                return false;

            }else {
                return true;
            }
            count++;
        }

        return false;
    }
}
