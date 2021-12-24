package com.shivam;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
//        Ques 7 --> Power In Java
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num= input.nextInt();
        System.out.println("Enter power");
        int power= input.nextInt();
        int p=1;
        while (power!=0){
            p*=num;
            power--;
        }
        System.out.println(p);
    }
}
