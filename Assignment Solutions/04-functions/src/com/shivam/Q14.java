package com.shivam;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n natural numbers");
        int num = in.nextInt();
        nsnum(num);
    }

    private static void nsnum(int num) {
        int sum = 0;
        int i=1;
        while (i<=num){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first "+ num + " natural numbers are : "+sum);
    }
}
