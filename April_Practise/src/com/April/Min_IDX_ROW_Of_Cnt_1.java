package com.April;
/*
Given a 2D binary matrix(1-based indexed) a of dimensions nxm , determine the row that contains the minimum number of 1's.
Note: The matrix contains only 1's and 0's. Also, if two or more rows contain the minimum number of 1's, the answer is the lowest of those indices.
 */
public class Min_IDX_ROW_Of_Cnt_1 {
    int minRow(int n, int m, int a[][]) {
        // code here
        int ans = Integer.MAX_VALUE;
        int new_cnt = -1;
        for(int i=0;i<n;i++){
            int cnt =0;
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    cnt++;
                }
            }
            if(new_cnt == -1 || ans>cnt){
                new_cnt = i;
                ans = cnt;
            }
        }
        return new_cnt+1;
    }
}
