package com.April;

public class Reverse_Bits {
    static Long reversedBits(Long x) {
        // code here
        long reversed = 0;
        for(int i=0;i<32;i++){
            reversed = (reversed<<1) |(x&1);
            x=x>>1;
        }
        return reversed;
    }
}
