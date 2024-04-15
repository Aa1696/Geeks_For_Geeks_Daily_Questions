package com.April;
import java.util.*;
/*
You are given an array arr[] of size n. You need to do the following:

You need to calculate the bitwise XOR of each element in the array with its corresponding index (indices start from 0).
After step1, print the array.
Now, set all the elements of arr[] to zero.
Now, print arr[].
 */
/*
This question needs the orchestration of it requirement so, I implemented the following:
1.Xor all the elements with their index and the corresponding function
2.Then print all the elements of the arr
3.And then all the elements were marked was zero as per the question requirement
 */
public class Xoring_And_Clearning {
    public void printArr(int n, int arr[]) {
        // code here
        for(int i=0;i<n;i++){
            if(i==n-1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void setToZero(int n, int arr[]) {
        // code here
        for(int i=0; i<n ;i++){
            arr[i]=0;
        }
    }

    public void xor1ToN(int n, int arr[]) {
        // code here
        for(int i=0; i<n;i++){
            arr[i] = arr[i]^i;
        }
    }
}
