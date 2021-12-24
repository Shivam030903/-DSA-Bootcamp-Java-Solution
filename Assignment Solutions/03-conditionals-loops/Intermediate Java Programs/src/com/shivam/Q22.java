package com.shivam;

import java.util.Locale;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
//        Q 22 -->  Java Program Vowel Or Consonant
        System.out.println("Enter a Character you want to check Vowel or Consonant");
        Scanner input = new Scanner(System.in);
        char ch = input.next().toLowerCase().trim().charAt(0);
        if (ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
            System.out.println("You Enter a Vowel");
        }
        else {
            System.out.println("You enter a Consonant");
        }
    }
}
