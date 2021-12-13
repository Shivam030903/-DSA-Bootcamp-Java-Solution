package com.shivam;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {

        grades();
    }

    private static void grades() {
        Scanner in = new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5,total;
        System.out.println("Enter your marks out of 100");

        System.out.println("Enter marks scored in Economics");
        sub1=in.nextFloat();

        System.out.println("Enter marks scored in Business Studies");
        sub2=in.nextFloat();

        System.out.println("Enter marks scored in Informatics Practices");
        sub3=in.nextFloat();

        System.out.println("Enter marks scored in English");
        sub4=in.nextFloat();

        System.out.println("Enter marks scored in Accounts");
        sub5=in.nextFloat();

        total=sub1+sub2+sub3+sub4+sub5;
        float avg=(total/5);
        System.out.println("Total number scored : "+total);
        System.out.println("Average Score "+avg);

        // Grading System
        if (avg>=91 && avg<=100){
            System.out.println("AA");
        }
        else if (avg>=81 && avg<=90){
            System.out.println( " Grade : AB");
        }
        else if (avg>=71 && avg<=80){
            System.out.println(" Grade : BB");
        }
        else if (avg>=61 && avg<=70){
            System.out.println(" Grade : BC");
        }
        else if (avg>=51 && avg<=60){
            System.out.println(" Grade : CD");
        }
        else if (avg>=41 && avg<=50){
            System.out.println( " Grade : DD");
        }
        else if (avg<=40){
            System.out.println(" Result : Essential repeat");
        }



    }
}
