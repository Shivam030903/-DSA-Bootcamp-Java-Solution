package com.shivam;
import java.util.Scanner;
public class Q5 {
    /*
    Ques 5 --> Define a method that returns the product of two numbers entered by user.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter Number 1");
        n1=in.nextInt();
        System.out.println("Enter Number 2");
        n2=in.nextInt();
        int ans=product(n1,n2);
        System.out.println( " Product : " + ans);

    }

    private static int product(int n1, int n2) {
        int product=n1*n2;
        return product;
    }
}
