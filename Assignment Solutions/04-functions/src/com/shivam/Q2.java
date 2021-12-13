package com.shivam;
import java.util.Scanner;
public class Q2 {

//    Ques 2 --> Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n=in.nextInt();
        System.out.println(oddeven(n));

    }
    static String oddeven(int n){
        if(n%2==0){
            return "Even Number";
        }
        return "Odd Number";
    }


}
