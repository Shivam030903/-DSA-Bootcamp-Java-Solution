package com.shivam;

//Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extracandies=3;
        int max=maximumelement(candies);
        List<Boolean> fans=kidsWithCandies(candies,extracandies,max);
        System.out.println(Arrays.toString(new List[]{fans}));

    }

    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies, int max) {
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            int newtotal=candies[i]+extraCandies;
            if (newtotal>=max){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return  ans;

    }

    private static int  maximumelement(int[] candies) {
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>max){
                max=candies[i];
            }
        }
        return max;
    }
}
