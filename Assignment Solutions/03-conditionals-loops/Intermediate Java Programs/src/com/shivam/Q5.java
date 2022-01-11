package com.shivam;

import java.util.Scanner;

public class Q5 {
//    Q 5 -->  Calculate Distance Between Two Points
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1,x2,y1,y2;
        System.out.println("Enter value of x1");
        x1=input.nextInt();
        System.out.println("Enter value of y1");
        y1=input.nextInt();
        System.out.println("Enter value of y2");
        y2=input.nextInt();
        System.out.println("Enter value of x2");
        x2=input.nextInt();
        double difference=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("Difference between "+"("+x1+","+y1+"),"+"("+x2+","+y2+") --> "+difference);
    }
}
