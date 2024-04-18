package com.April;
/*
You are given an integer n and an integer array arr of size n+2. All elements of the array are in the range from 1 to n. Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.
Note: Return the numbers in their order of appearing twice. So, if X and Y are the repeating numbers, and X's second appearance comes before second appearance of Y, then the order should be (X, Y).
 */
public class Two_Duplicate_Numbers {
    public int[] twoRepeated(int arr[], int n){
        // Your code here
        int[]ans = new int[2];
        int idx =0;
        for(int i=0;i<n+2;i++){
            int indx = Math.abs(arr[i]);
            if(arr[indx]>0){
                arr[indx] = -arr[indx];
            }
            else{
                ans[idx++]=indx;
            }
        }
        return ans;
    }
}
