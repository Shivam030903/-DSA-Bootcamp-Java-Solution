package com.shivam;
import java.util.Scanner;
public class Q4 {
/*
    Ques 4 --> Write a program to print the sum of two numbers
    entered by user by defining your own method.

 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1=in.nextInt();
        System.out.println("Enter number 2 :");
        int num2=in.nextInt();

        sum2num(num1,num2);

    }

    private static void sum2num(int a, int b) {
        int ans=a+b;
        System.out.println( "Sum : " + ans);
    }
}
