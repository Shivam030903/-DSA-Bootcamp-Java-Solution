package com.shivam;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
//        Ques 6 --> Calculate Commission Percentage
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sales");
        int sales=input.nextInt();
        System.out.println("Enter commission");
        int commision=input.nextInt();
        int commisionpercentage=(commision*100)/sales;
        System.out.println("Commission percentage : " + commisionpercentage + " %");

    }
}
