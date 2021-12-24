package com.shivam;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
//        Ques 12 -->  Write a function to check if a given triplet is a Pythagorean triplet or not.
//        (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        Scanner input = new Scanner(System.in);
        int hypo,base,height;
        System.out.println("Enter Hypotenuse");
        hypo=input.nextInt();
        System.out.println("Enter Base");
        base=input.nextInt();
        System.out.println("Enter height");
        height=input.nextInt();
        boolean b = hypo * hypo == (base * base) + (height * height);
        if (b){
            System.out.println("Valid Pythagorean triplet");
        }
        else {
            System.out.println("InValid Pythagorean triplet");
        }
    }
}
