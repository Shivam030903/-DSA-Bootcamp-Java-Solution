package com.shivam;

public class Q28 {
    public static void main(String[] args) {
        pattern28(5);
    }

    private static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalcolsinrow=row>n ? 2*n-row:row;

            int noofspaces=n-totalcolsinrow;
            for (int spaces = 0; spaces < noofspaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
