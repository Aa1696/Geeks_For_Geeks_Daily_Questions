package com.April;
/*
Given an array of size n and a range [a, b]. The task is to partition the array around the range such that the array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.

Note: The generated output is 1 if you modify the given array successfully.

Geeky Challenge: Solve this problem in O(n) time complexity.
 */
public class Three_Way_Partition {
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] < a) {
                int tmp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = tmp;
                mid++;
                low++;
            } else if (arr[mid] > b) {
                int tmp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = tmp;
                high--;
            } else {
                mid++;
            }
        }
    }
}
