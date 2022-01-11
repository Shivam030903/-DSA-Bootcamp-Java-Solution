package com.shivam;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
//        Q 23 -->  Perfect Number In Java
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number you want to check if it is perfect or not : ");
        int num=input.nextInt();
        int sum=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0){
                sum+=i;
            }
        }
        if (num==sum){
            System.out.println("You enter a perfect number");
        }else {
            System.out.println("Enterd number is not perfect");
        }
    }
}
