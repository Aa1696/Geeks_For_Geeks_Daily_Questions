/*
Intuition:

1. To check the count of the pair of set bits at the given bit for all numbers of the array.


2. After finding the total pairs, we can add the net value of the bit by checking (1<<I)*total_pairs

3. Will include the value into the ans.

Approach:

1. Will run the for loop from 0 to 64

2. At each bit, calculate the total pairs of set bits of numbers in the array

3. After completion of step 2, add the net value i.e total_set_bit_pairs *(1<<i ith bit value getting 2^i) contributed in how many pairs

4. after traversing all the bits will return the answer.



Time Complexity:

O(64*n)

Space Complexity:
O(1)
 */
package com.April;

public class Product_Of_And {
    static long pairAndSum(int n, long arr[]) {
        // code here
        long ans = 0l;
        for (int i = 0; i < 64; i++) {
            long bit = 1l << i;
            long cnt = 0;
            for (int j = 0; j < n; j++) {
                //calculating the total set bit at the given bit of the all numbers
                //in the array and then find the pair and will multiply the pair by the
                //int value of the given bit as it is contributing into the all the element
                if ((arr[j] & bit) > 0) {
                    cnt++;
                }
            }
            ans += ((cnt * (cnt - 1) / 2) * (bit));
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        long[] arr = new long[]{5, 10, 15};
        System.out.println(pairAndSum(n,arr));
    }
}
