package com.April;
/*
Given two integers n, m and a 2D matrix mat of dimensions nxm, the task is to find the maximum sum of an hourglass.
An hourglass is defined as a part of the matrix with the following form:


 */
public class Max_Sum_Hour_Glass {
    int findMaxSum(int n, int m, int mat[][]) {
        // code here
        if(n<3 || m<3) return -1;
        int max = -1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max = Math.max(max,solve(i,j,n,m,mat));
            }
        }
        return max;
    }
    static int solve(int i,int j,int n,int m,int mat[][]){
        if(j-1<0 || j+1>=m || i+1>=n || i+2>=n) return -1;
        int ans = mat[i][j];
        ans+=mat[i][j-1]+mat[i][j+1]+mat[i+1][j]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j-1];
        return ans;
    }
}
