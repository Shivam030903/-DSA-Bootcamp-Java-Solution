package com.shivam;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        //    Q 15 -->  Armstrong Number In Java
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number you want to check armstrong number or not");
        int num=input.nextInt();
        int temp=num;
        int sum=0;
        int rem=0;
        while (num>0){
            rem=num%10;
            sum+=Math.pow(rem,3);
            num=num/10;
        }
        if (temp==sum){
            System.out.println("You enter a valid armstrong number ");
        }
        else {
            System.out.println("You enter a invalid armstrong number ");
        }
    }
}
