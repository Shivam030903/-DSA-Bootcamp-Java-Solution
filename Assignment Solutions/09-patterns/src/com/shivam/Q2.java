package com.shivam;

public class Q2 {
    public static void main(String[] args) {
        pattern2(5);
    }

    private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
