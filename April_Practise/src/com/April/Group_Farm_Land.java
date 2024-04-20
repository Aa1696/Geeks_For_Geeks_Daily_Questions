package com.April;
import java.util.*;
public class Group_Farm_Land {
    int[][]dir = {{1,0},{-1,0},{0,1},{0,-1}};
    int r,c;
    public int[][] findFarmland(int[][] land) {
        int n = land.length;
        int m = land[0].length;
        boolean[][]visited = new boolean[n][m];
        List<int[]>lst = new ArrayList<>();
        for(int i = 0 ; i<n ;i++){
            for(int j = 0; j<m ;j++){
                if(!visited[i][j] && land[i][j]==1){
                    r=0;c=0;
                    dfs(visited,land, i, j);
                    lst.add(new int[]{i,j,r,c});
                }
            }
        }
        int[][]ans = new int[lst.size()][4];
        int indx =0;
        for(int[] tmp:lst){
            for(int i=0;i<tmp.length;i++){
                ans[indx][i] = tmp[i];
            }
            indx++;
        }
        return ans;
    }
    public void dfs(boolean[][]visited, int[][]land, int i, int j){
        visited[i][j] = true;
        r = Math.max(r,i);
        c = Math.max(c,j);
        for(int k=0;k<dir.length;k++){
            int x = dir[k][0] + i;
            int y = dir[k][1] + j;
            if(x>=0 && x<land.length && y>=0 && y<land[0].length && !visited[x][y] && land[x][y]==1){
                dfs(visited,land,x,y);
            }
        }
    }
}
