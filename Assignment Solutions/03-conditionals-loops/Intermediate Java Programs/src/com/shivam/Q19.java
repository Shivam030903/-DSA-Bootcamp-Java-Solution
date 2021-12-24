package com.shivam;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
//        Q 19 -->  Future Investment Value
        // FV = pv*(1+i)n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Present value of money : ");
        float pv=input.nextFloat();
        System.out.print("Enter the Interest Rate : ");
        float investment=input.nextFloat();
        System.out.print("Enter the time period in years : ");
        float period=input.nextFloat();

        float fv= (float) (pv*(Math.pow((1+investment/100),period)));
        System.out.print("Future value : ");
        System.out.println(fv);


    }
}
