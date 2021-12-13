package com.shivam;
import java.util.Scanner;
public class Q6 {
    /*
    Write a program to print the circumference and area of a circle of radius
     entered by user by defining your own method.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float radius=in.nextFloat();
        circumference(radius);
        area(radius);


    }

    private static void area(float radius) {
        double area = radius*radius*Math.PI;
        System.out.println("Area of Circle " + area);
    }

    private static void circumference(float radius) {
        double circumference=2*radius*Math.PI;
        System.out.println( " Circumference of Circle : "+ circumference);

    }
}
