package com.shivam;

public class Q8 {
    public static void main(String[] args) {
        boolean result=halvesAreAlike("SKhivam");
        System.out.println(result);

    }
    public static boolean halvesAreAlike(String str) {

        int strlen=str.length();
        int ane=str.length()/2;

        StringBuilder astr= new StringBuilder("");
        StringBuilder bstr= new StringBuilder("");
        for (int i = 0; i < ane; i++) {
            astr.append(str.charAt(i));
        }
        for (int j = ane; j <strlen ; j++) {
            bstr.append(str.charAt(j));
        }
        int counta=countvovel(astr.toString());
        int countb=countvovel(bstr.toString());

        if (counta==countb){
            return true;
        }else {
            return false;

        }
    }

    public static int countvovel(String str){
        int noofvovel=0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a') || str.charAt(i) =='A'){
                noofvovel++;
            }if ((str.charAt(i) == 'e') || str.charAt(i) =='E'){
                noofvovel++;
            }if ((str.charAt(i) == 'i') || str.charAt(i) =='I'){
                noofvovel++;
            }if ((str.charAt(i) == 'o') || str.charAt(i) =='O'){
                noofvovel++;
            }if ((str.charAt(i) == 'u') || str.charAt(i) =='U'){
                noofvovel++;
            }
        }
        return noofvovel;
    }

}
