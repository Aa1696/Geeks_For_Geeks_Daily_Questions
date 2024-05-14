package May_Questions;
import java.util.*;
class Pair1
{
    int x,y,dist;
    Pair1
(int x, int y, int dist){
        this.x =x;
        this.y = y;
        this.dist = dist;
    }
}
public class Path_with_Minimum_Effort {
    public static int MinimumEffort(int rows, int col, int[][] heights) {
        // code here
        PriorityQueue<Pair1
>pq = new PriorityQueue<>((a,b)->a.dist - b.dist);
        int[][]dist = new int[rows][col];
        for(int i=0; i<rows; i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        pq.add(new Pair1
(0,0,0));
        int[][]dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!pq.isEmpty()){
            Pair1
 p = pq.poll();
            if(p.x == rows-1 && p.y == col-1){
                return p.dist;
            }
            for(int i=0; i<4; i++){
                int x = dir[i][0] + p.x;
                int y = dir[i][1] + p.y;
                if(x>=0 && x<rows && y>=0 && y<col){
                    int res = Math.max(Math.abs(heights[x][y]-heights[p.x][p.y]),dist[p.x][p.y]);
                    if(dist[x][y] > res){
                        dist[x][y] = res;
                        pq.add(new Pair1
(x,y,dist[x][y]));
                    }
                }
            }
        }
        return 0;
    }
}
