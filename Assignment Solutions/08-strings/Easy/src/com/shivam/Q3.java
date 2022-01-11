package com.shivam;

//         G -> G
//        () -> o
//        (al) -> al

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        StringBuilder ans = interpret("G()(al)");
        System.out.println(Arrays.toString(new StringBuilder[]{ans}));

    }

    // Good approach
    public static StringBuilder interpret(String command){
        StringBuilder srt=new StringBuilder("");
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i)=='G'){
                srt.append('G');
            }
            else if (command.charAt(i) == '('){
                if (command.charAt(i+1)==')'){
                    srt.append('o');
                }
                else {
                    srt.append("al");
                }
            }
        }
        return  srt;
    }

    // Noob Approach
//    public static String interpret(String command) {
//        command=command.replace("()","o");
//        command=command.replace("(al)","al");
//        return  command;
//    }
}
