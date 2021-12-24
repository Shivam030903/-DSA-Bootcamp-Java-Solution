package com.shivam;

public class Q26 {
    public static void main(String[] args) {
//        Q 26 -->  Kunal is allowed to go out with his friends only on the even days of a given month.
//        Write a program to count the number of days he can go out in the month of August.
        int days_in_august=31;
        System.out.println("Kunal is allowed on these dates of august month");
        for (int i = 1; i <= days_in_august; i++) {
            if (i%2==0){

                System.out.print(i + " ");
            }

        }
    }
}
