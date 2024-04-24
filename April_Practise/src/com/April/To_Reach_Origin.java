package com.April;
/*
You are standing on a point (x, y) and you want to go to origin (0, 0) by taking steps either left or up i.e. from each point you are
allowed to move either in (x-1, y) or (x, y-1). Find the number of paths from point to origin.
 */
public class To_Reach_Origin {
    static int mod =(int)1e9 +7;
    public static int ways(int n, int m){
        // complete the function
        int[][]memo = new int[n+1][m+1];
        return helper(n,m, memo);
    }
    public static int helper(int n, int m,int[][]memo){
        if(n<0 || m<0) return 0;
        if(n==0 && m==0){
            return 1;
        }
        if(memo[n][m] != 0) return memo[n][m];
        int ans= (helper(n-1,m,memo)%mod+helper(n,m-1,memo)%mod)%mod;
        return memo[n][m]=ans;
    }
}
