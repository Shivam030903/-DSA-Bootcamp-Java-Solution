package com.shivam;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
//        Ques 9 --> Write a program to print the factorial of a number by defining a method named
//        'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=in.nextInt();
        Factorial(num);
    }

    private static void Factorial(int num) {
        int fact=1;
        while (num>1){
            fact*=num;
            num--;
        }
        System.out.println(fact);
    }
}
