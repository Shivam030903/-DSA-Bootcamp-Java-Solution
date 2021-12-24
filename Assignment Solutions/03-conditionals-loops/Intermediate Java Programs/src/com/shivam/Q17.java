package com.shivam;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        System.out.println("Enter a string you want to reverse");
        Scanner input = new Scanner(System.in);
        String str=input.next();
        StringBuilder temp= new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        System.out.println(temp);
    }
}
