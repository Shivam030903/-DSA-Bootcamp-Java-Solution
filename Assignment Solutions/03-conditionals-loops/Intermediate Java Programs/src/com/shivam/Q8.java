package com.shivam;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
//        Ques 8 -->  Calculate Depreciation of Value
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchasing value of asset : ");
        int pamt=input.nextInt();
        System.out.print("Enter Depreciation Percentage : ");
        int depp=input.nextInt();
        System.out.print("Enter time(years) : ");
        int period=input.nextInt();
        for (int i = 1; i <= period; i++) {
            int depval=pamt/depp;
            pamt=pamt-depval;

        }
        System.out.print("Current value of asset"+pamt);

    }
}
