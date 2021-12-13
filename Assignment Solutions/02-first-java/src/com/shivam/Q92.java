package com.shivam;

import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
//        Ques 9 --> To find Armstrong Number between two given number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = in.nextInt();
        int temp=num;
        int sum=0;
        while (num>0){
            int rem=num%10;
            int rem3=rem*rem*rem;
            sum+=rem3;
            num=num/10;

        }
        if (temp==sum){
            System.out.println("Entered number is a armstrong number");
        }else {
            System.out.println("Entered number is not  a armstrong number");
        }
    }
}
