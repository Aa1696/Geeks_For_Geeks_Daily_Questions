package com.April;
/*
Given a matrix of size n x m with 0’s and 1’s, you enter the matrix at cell (0,0) in left to right direction. Whenever you encounter a 0 you retain it in the same direction, else if you encounter a 1 you have to change the direction to the right of the current direction and change that 1 value to 0,
you have to find out from which index you will leave the matrix at the end.
 */
public class Exit_Point_Matrix {
    public int[] FindExitPoint(int n, int m, int[][] arr) {
        // code here
        String dir = "forward";
        int r=0;
        int c=0;
        while(r>=0 && r<n && c>=0 && c<m){
            if(arr[r][c]==1){
                arr[r][c]=0;
                if(dir == "forward"){
                    dir = "downward";
                    r++;
                    continue;
                }
                if(dir == "downward"){
                    dir = "left";
                    c--;
                    continue;
                }
                if(dir == "left"){
                    dir = "upward";
                    r--;
                    continue;
                }
                if(dir == "upward"){
                    dir = "forward";
                    c++;
                    continue;
                }
            }
            else{
                if(dir == "forward"){
                    c++;
                    continue;
                }
                if(dir == "downward"){
                    r++;
                    continue;
                }
                if(dir == "left"){
                    c--;
                    continue;
                }
                if(dir == "upward"){
                    r--;
                    continue;
                }
            }
        }
        if(dir == "forward"){
            return new int[]{r,c-1};
        }
        if(dir=="downward"){
            return new int[]{r-1,c};
        }
        if(dir=="left"){
            return new int[]{r,c+1};
        }
        if(dir == "upward"){
            return new int[]{r+1,c};
        }
        return new int[2];
    }
}
