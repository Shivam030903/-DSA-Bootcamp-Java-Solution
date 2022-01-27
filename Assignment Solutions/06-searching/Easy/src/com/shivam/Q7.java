package com.shivam;

public class Q7 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        long start=1;
        long end=letters.length-1;
        while(start<end){
            long mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else if(target>letters[mid]){
                start=mid+1;
            }
        }
        return letters[start % letters.length];


    }

}
