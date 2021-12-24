package com.shivam;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
//        Q 25 -->  Sum Of A Digits Of Number
        Scanner input = new Scanner(System.in);
        int num=7992;
        int sum=0;
        int rem=0;
        while (num>0){
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of digits : " + sum);
    }
}
