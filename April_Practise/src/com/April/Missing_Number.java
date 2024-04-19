package com.April;
import java.util.*;
public class Missing_Number {
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m){
        Set<Integer>st = new HashSet<>();
        for(int i:b){
            st.add(i);
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i:a){
            if(!st.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
