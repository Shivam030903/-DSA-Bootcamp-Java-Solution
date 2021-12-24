package com.shivam;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
//        Q 11 -->  Compound Interest Java Program
        Scanner input= new Scanner(System.in);
        double principle,rate,time;
        System.out.print("Enter principle amount : ");
        principle=input.nextDouble();
        System.out.print("Enter rate : " );
        rate=input.nextDouble();
        System.out.print("Enter time : ");
        time=input.nextDouble();

        /* Calculate compound interest */
        double CI = principle *
                (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is "+ CI);
    }
}
