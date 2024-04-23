package com.April;

public class Rohans_Love {
    static int firstElement(int n) {
        // code here
        //Basic observation
        int mod = (int)1e9+7;
        int prev1 = 1;
        int prev2 = 1;
        if(n<=2){
            return prev1;
        }
        for(int i=3;i<=n;i++){
            int x = prev1;
            prev1 = (prev1+prev2)%mod;
            prev2 = x;
        }
        return prev1;
    }
}
