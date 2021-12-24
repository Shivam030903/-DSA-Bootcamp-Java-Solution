package com.shivam;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nnumber=0;
        int epnumber=0;
        int opnumber=0;
        System.out.println("Enter Numbers ");
//        Q 27 -->  Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
//        from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        while (true){
            int number=input.nextInt();
            if (number==0){
                break;
            }
            if (number<0){
                nnumber+=number;
            }
            if (number>0 && number%2==0 ){
                epnumber+=number;
            }
            if (number>0 && !(number%2==0)){
                opnumber+=number;
            }
        }
        System.out.println("Sum of negative number " + nnumber);
        System.out.println("Sum of even positive number " + epnumber);
        System.out.println("Sum of odd positive number " + opnumber);
    }
}
