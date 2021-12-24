package com.shivam;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
//        Ques 4 -> Calculate Discount Of Product
        Scanner input=new Scanner(System.in);
        System.out.println("MRP of product");
        float original_price=input.nextFloat();
        System.out.println("Selling price of product");
        float final_price=input.nextFloat();
        float discount=original_price-final_price;
        System.out.println("Discount on product " + discount );

    }
}
