package com.shivam;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
//        Ques 8 --> To find out whether the given String is Palindrome or not.
        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to check if it is a palindrome");
        original=sc.nextLine();
        int length=original.length()-1;
        for (int i = length; i >= 0; i--) {
            reverse=reverse+original.charAt(i);



        }
        if (original.equals(reverse)){
            System.out.println("Input is Palindrome");
        }else {
            System.out.println("Entered input is not a Palindrome");
        }




        // This code used when want to check a number
//        int num= sc.nextInt();
////        Solved while getting full knowledge
//        int temp=num;
//        int sum=0;
//        int rem=0;
//        while (num>0){
//            rem=num%10;
//            num/=10;
//            sum=rem+sum*10;
//
//        }
//
//        if (temp==sum){
//            System.out.println("Palindrome Number");
//        }else {
//            System.out.println("Not Palindrome Number");
//        }

        
    }
}
