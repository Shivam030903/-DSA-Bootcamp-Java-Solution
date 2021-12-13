package com.shivam;
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        /*
        Ques 1 --> Define two methods to print the maximum and the
        minimum number respectively among three numbers entered by
        the user.

         */



        Scanner in = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter 3 numbers");
        num1=in.nextInt();
        num2=in.nextInt();
        num3=in.nextInt();
        maximum(num1,num2,num3);
        minimum(num1,num2,num3);
    }
    static void maximum(int a,int b,int c){
        int maximum=a;
        if (b>maximum){
            maximum=b;
        } if (c>maximum){
            maximum=c;
        }
        System.out.println("Maximum Number "+ maximum);
    }
    static void minimum(int a,int b,int c){
        int minimum=a;
        if (b<minimum){
            minimum=b;
        } if (c<minimum){
            minimum=c;
        }
        System.out.println( "Minimum Number "+ minimum);
    }

}

