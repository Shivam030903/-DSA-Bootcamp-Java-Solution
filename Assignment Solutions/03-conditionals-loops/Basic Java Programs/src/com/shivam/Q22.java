package com.shivam;
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 22 -->  Subtract the Product and Sum of Digits of an Integer
        int n=234;
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            product*=rem;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(product);
        System.out.println(product-sum);
    }
}
