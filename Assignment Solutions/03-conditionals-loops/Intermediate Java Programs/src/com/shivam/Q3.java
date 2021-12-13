package com.shivam;
import  java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
//        Ques 3 -->  Calculate Average Of N Numbers
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int i=1;
        int sum=0;
        while (true){
            sum+=num;
            num=in.nextInt();
            i++;
        }

    }
}

