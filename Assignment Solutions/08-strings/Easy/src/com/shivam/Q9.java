package com.shivam;

public class Q9 {
//    Ques    Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//            Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
    public static void main(String[] args) {
        String number = "123456789";
        StringBuilder answer= new StringBuilder("");
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i)>=1 || number.charAt(i)<10){
                char ans=figureout(i);
                answer.append(ans);

            }
        }
        System.out.println(answer.toString());



    }

    private static char figureout(int i) {
        int number=96 + i;
        char result= (char) number;

        return result;
    }

}
