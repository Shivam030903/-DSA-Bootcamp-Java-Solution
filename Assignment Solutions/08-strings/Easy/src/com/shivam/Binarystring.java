package com.shivam;

public class Binarystring {
    public static void main(String[] args) {
        String string="0101";
        boolean result=checkOnesSegment(string);
        System.out.println(result);

    }
    public static boolean checkOnesSegment(String s) {
        int num = 0,num1=0;
        if ( s==null ||s.length()==0)

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='0'){
                num++;
            }else {
                num1++;
            }
        }

        return (num<num1);



    }
}
