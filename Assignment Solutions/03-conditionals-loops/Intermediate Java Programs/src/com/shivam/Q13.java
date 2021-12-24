package com.shivam;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
//        Q 13 -->  Addition Of Two Numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        float num1=input.nextFloat();
        System.out.print("Enter number 2 : ");
        float num2=input.nextFloat();

        float sum= num1+num2;
        System.out.print("Sum : " + sum);
    }
}
