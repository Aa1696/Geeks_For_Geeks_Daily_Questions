package com.April;
/*
Given two arrays a and b both of size n. Given q queries in an arrray query each having a positive integer x denoting an index of the array a. For each query,
your task is to find all the elements less than or equal to a[x] in the array b.
 */
public class Count_the_Elements {
    public static int[] countElements(int a[], int b[], int n, int query[], int q){
        int[]ans = new int[q];
        for(int i=0;i<q;i++){
            int x=a[query[i]];
            int cnt=0;
            for(int j=0;j<b.length;j++){
                if(b[j]<=x){
                    cnt++;
                }
            }
            ans[i]=cnt;
        }
        return ans;
    }
}
