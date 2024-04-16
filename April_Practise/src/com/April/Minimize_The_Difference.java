package com.April;

public class Minimize_The_Difference {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // code here
        //Given window can create two parts array before starting the window and from the
        //end of the window
        int ans = Integer.MAX_VALUE;
        int[]min_left = new int[n];
        int[]max_left = new int[n];
        int[]min_right = new int[n];
        int[]max_right = new int[n];
        //finding min and max in left part of the window
        for(int i=0;i<n;i++){
            if(i==0){
                min_left[i]=arr[i];
                max_left[i]=arr[i];
            }
            else{
                min_left[i] = Math.min(min_left[i-1],arr[i]);
                max_left[i] = Math.max(max_left[i-1],arr[i]);
            }
        }
        //finding min and max in right part of the window
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                min_right[i] = arr[i];
                max_right[i] = arr[i];
            }
            else{
                min_right[i] = Math.min(min_right[i+1],arr[i]);
                max_right[i] = Math.max(max_right[i+1],arr[i]);
            }
        }
        for(int i=0;i<=n-k;i++){
            int posl=i-1;
            int posr=i+k;
            int left_min = Integer.MAX_VALUE;
            int right_max = Integer.MIN_VALUE;
            //Maintaing the min and max in the left part of the window
            if(posl>=0){
                left_min = Math.min(left_min,min_left[posl]);
                right_max = Math.max(right_max,max_left[posl]);
            }
            //Maintaing the min and max in the left part of the window
            if(posr<n){
                left_min = Math.min(left_min,min_right[posr]);
                right_max = Math.max(right_max,max_right[posr]);
            }
            ans = Math.min(ans, Math.abs(right_max - left_min));
        }
        return ans;
    }
}
