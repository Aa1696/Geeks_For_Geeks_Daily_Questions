package com.April;
/*
Given an array arr of n integers, count all pairs (arr[i], arr[j]) in it such that i*arr[i] > j*arr[j] and 0 ≤ i < j < n.

Note: 0-based Indexing is followed.
 */
public class Cnt_Inversion_Pairs {
    static int countPairs(int arr[], int n) {
        // Your code goes here
        //merge sort with inversion count
        for(int i=0;i<n;i++){
            arr[i] *=i;
        }
        return mergesort(arr,0,n-1);
    }
    static int mergesort(int[]arr,int low, int high){
        int inv_cnt=0;
        if(low<high){
            int mid = low + (high-low)/2;
            inv_cnt +=mergesort(arr,low,mid);
            inv_cnt +=mergesort(arr,mid+1,high);
            inv_cnt +=merge(arr,low,mid,high);
        }
        return inv_cnt;
    }
    static int merge(int[]arr,int low, int mid, int high){
        int k=0;
        int left =low;
        int right =mid+1;
        int n=high -low +1;
        int[]tmp = new int[n];
        int cnt =0;
        while(left<=mid && right<=high){
            if(arr[left]>arr[right]){
                tmp[k++]=arr[right++];
                cnt +=(mid-left+1);
            }
            else{
                tmp[k++]=arr[left++];
            }
        }
        while(left<=mid){
            tmp[k++] = arr[left++];
        }
        while(right<=high){
            tmp[k++] = arr[right++];
        }
        int j=low;
        for(int i=0;i<n;i++){
            arr[j++] = tmp[i];
        }
        return cnt;
    }
}
