package com.shivam;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
//        Ques 9 --> To find Armstrong Number between two given number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Starting number of series");
        int start=in.nextInt();
        System.out.println("Enter Ending number of series");
        int end=in.nextInt();
        System.out.println("Following armstrong number between series are ");
        while (start<=end){
            int num=start;
            int temp=start;
            int sum=0;

            while (num>0){
                int rem=num%10;
                int rem3=rem*rem*rem;
                sum+=rem3;
                num/=10;
            }
            if (sum==temp){

                System.out.print(start + " , ");
            }else {
                // nothing print
            }

            start++;
        }
    }
}
