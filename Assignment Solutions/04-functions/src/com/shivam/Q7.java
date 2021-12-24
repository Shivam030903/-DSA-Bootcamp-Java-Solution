package com.shivam;

import java.util.Scanner;

public class Q7 {
    /*
    Ques 7 -->  Define a method to find out
    if a number is prime or not.

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number you want to check prime or not");
        int num=in.nextInt();
        System.out.println(isprime(num));

    }

    private static boolean isprime(int num) {
        if (num<=1){
            return false;
        }
        int count=2;
        while (count*count<=num){
            if (num%count==0){
//                return false;
            }
            count++;
        }
        return count*count > num;
    }
}
