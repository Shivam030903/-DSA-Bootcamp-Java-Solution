package com.shivam;

public class Q10 {
    public static void main(String[] args) {
        palidrome(221);
    }

    private static void palidrome(int num) {
        int temp=num;
        int rev=0;
        int rem=1;
        while (num>0){
            rem=num%10;
            num/=10;
            rev=rev*10+rem;


        }
        if (rev==temp){
            System.out.println("You Enter a palindrome number");
        }else {
            System.out.println("Entered number is not palindrome ");
        }
    }
}
