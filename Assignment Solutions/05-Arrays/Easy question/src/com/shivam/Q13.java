package com.shivam;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flipped=flipAndInvertImage(image);
        for (int i = 0; i < flipped.length; i++) {
            System.out.println(Arrays.toString(flipped[i]));
        }


    }


    public static int[][] flipAndInvertImage(int[][] image) {
        // Code for flip image
        int m=image.length;
        int n=image[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp=image[i][j] ^1;
                image[i][j]=image[i][n-j-1] ^1;
                image[i][n-j-1]=temp;
            }

        }


        // Code for Invert image
//        for (int row = 0; row < image.length; row++) {
//            for (int col = 0; col < image[row].length; col++) {
//                if (image[row][col]==0){
//                    image[row][col]=1;
//                }else if (image[row][col]==1){
//                    image[row][col]=0;
//                }
//            }
//        }
        return image;


    }
}
