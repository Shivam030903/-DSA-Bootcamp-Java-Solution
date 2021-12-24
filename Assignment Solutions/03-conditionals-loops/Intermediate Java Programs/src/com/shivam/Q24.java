package com.shivam;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
//        Q 24 -- > Check Leap Year Or Not
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year you want to check leap year or not : ");
        int year=input.nextInt();

        if (year%4==0 && !(year%100==0) || year%400==0){
            System.out.println("You Enter a leap year");
        }else {
            System.out.println("Enterd year is not a leap year");
        }
    }
}
