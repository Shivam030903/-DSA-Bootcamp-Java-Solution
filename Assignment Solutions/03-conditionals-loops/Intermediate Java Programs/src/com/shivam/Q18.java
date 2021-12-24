package com.shivam;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
//        Q 18 --> Find if a number is palindrome or not
        Scanner input = new Scanner(System.in);
        int num= 455;
        int temp=num;
        int rem=0;
        int palindrome=0;
        while (num>0){
            rem=num%10;
            palindrome=palindrome*10+rem;
            num=num/10;
        }
        if (palindrome==temp){
            System.out.println("Enter numbered is a Palindrome number");
        }
        else{
            System.out.println("Enter numbered is a invalid Palindrome number");
        }
    }
}
