package com.shivam;

public class Q6 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int noofspaces=n-i;
            for (int spaces = 1; spaces <= noofspaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=i; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
