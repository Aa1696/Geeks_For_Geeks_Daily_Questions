package May_Questions;
import java.util.*;
class Pair{
    int val,indx;
    Pair(int val, int indx){
        this.val = val;
        this.indx = indx;
    }
}
public class Root_To_Leaf_Path {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->b.val-a.val);
        int n = score.length;
        for(int i=0;i<n;i++){
            pq.add(new Pair(score[i],i));
        }
        int indx = 1;
        String[]ans = new String[n];
        while(!pq.isEmpty()){
            int orig_indx = pq.poll().indx;
            if(indx == 1){
                ans[orig_indx] = "Gold Medal";
                indx++;
            }
            else if(indx == 2){
                ans[orig_indx] = "Silver Medal";
                indx++;
            }
            else if(indx == 3){
                ans[orig_indx] =  "Bronze Medal";
                indx++;
            }
            else{
                ans[orig_indx] = ""+indx;
                indx++;
            }
        }
        return ans;
    }
}
