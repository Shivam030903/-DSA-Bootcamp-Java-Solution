package com.shivam;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,30},
            {3,2,6},
                {10,2,3}
        };
        int value=maximumWealth(arr);
        System.out.println(value);

    }
    public static int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for (int row = 0; row < accounts.length; row++) {
            int wealth=0;
            for (int col = 0; col <accounts[row].length ; col++) {
                wealth+=accounts[row][col];
            }
            if (wealth>maxwealth){
                maxwealth=wealth;
            }
        }
        return maxwealth;

    }
}
