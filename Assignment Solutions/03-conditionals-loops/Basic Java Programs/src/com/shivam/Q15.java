package com.shivam;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Ques 15 -->  Volume Of Prism
        float base,height;
        System.out.println("Enter Base");
        base=in.nextFloat();
        System.out.println("Enter Height");
        height=in.nextFloat();
        float volume = base*height;
        System.out.printf("Volume of Prism : %.2f",volume);


    }
}
