package com.shivam;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=in.nextInt();
        Factorial(num);
    }

    private static void Factorial(int num) {
        int fact=1;
        while (num>1){
            fact*=num;
            num--;
        }
        System.out.println(fact);
    }
}
