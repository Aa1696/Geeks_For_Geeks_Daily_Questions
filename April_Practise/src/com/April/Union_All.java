package com.April;
import java.util.*;
/*
Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays.
 */
public class Union_All {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        Set<Integer> st= new TreeSet<>();
        for(int i:arr1){
            st.add(i);
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i:arr2){
            st.add(i);
        }
        for(int i:st){
            ans.add(i);
        }
        return ans;
    }
}
