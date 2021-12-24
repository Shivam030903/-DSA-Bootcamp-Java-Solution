package com.shivam;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //    Q 14 -->  Sum Of N Numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n=input.nextInt();

        // First approach
        int fsum=0;
        for (int i = 1; i <= n; i++) {
            fsum+=i;
        }
        System.out.print("Sum of n natural nummber : "+fsum);
        System.out.println();
        // Second approach
        int wsum=0;
        for (int i = 1; i <= n; i++) {
            wsum+=i;
        }
        System.out.print("Sum of n natural nummber : "+wsum);



    }
}
