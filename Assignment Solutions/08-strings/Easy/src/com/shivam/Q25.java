package com.shivam;

public class Q25 {
    public static void main(String[] args) {
        String ques="()";
        boolean result=isValid(ques);
        System.out.println(result);
    }
    public static boolean isValid(String s) {

        if (s==null && s.length()==0){
            return false;
        }
        for (int i = 0; i < s.length()-1; i=i+2) {
//            if (s.charAt(i)=='(' | s.charAt(i)=='[' || s.charAt(i)=='{' ){
//                if (s.charAt(i+1)==')' | s.charAt(i+1)==']' || s.charAt(i+1)=='}'){
//                    return true;
//                }
//            }
            if (s.charAt(i)=='(' && s.charAt(i+1)==')'){
                return true;
            }if (s.charAt(i)=='[' && s.charAt(i+1)==']'){
                return true;
            }if (s.charAt(i)=='{' && s.charAt(i+1)=='}'){
                return true;
            }

        }
        return false;
}
}
