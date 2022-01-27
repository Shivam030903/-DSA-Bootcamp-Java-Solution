package com.shivam;

public class oddevenval {
    public static void main(String[] args) {
        int ans=count(356);
        System.out.println(ans);
    }

    private static int count(int i) {
        int ans=0;
        while (i>0){
            i=i/10;
            ans++;
        }
        return ans;
    }
}
