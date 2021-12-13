package com.shivam;
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 21 -->  Fibonacci Series In Java Programs
        System.out.println("Enter nth Fibonacci Number  ");
        int num=in.nextInt();
        int p=0;
        int i=1;

        while (p<=num){
            int temp=i;
            i=i+p;
            p=temp;

        }
        System.out.println(p);
    }
}
