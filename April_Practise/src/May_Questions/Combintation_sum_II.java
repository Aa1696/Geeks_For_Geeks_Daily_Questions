package May_Questions;
import java.util.*;
public class Combintation_sum_II {
    List<List<Integer>>ans;
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        // Code Here.
        Arrays.sort(arr);
        ans = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();
        helper(arr,0,n,k,curr);
        return ans;
    }
    public void helper(int[]arr, int indx, int n, int sum, List<Integer>curr){
        if(sum<0) return;
        if(sum==0){
            if(ans.contains(curr)) return;
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(indx==n){
            if(sum==0){
                if(ans.contains(curr)) return;
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i=indx;i<n;i++){
            curr.add(arr[i]);
            helper(arr,i+1,n,sum-arr[i],curr);
            curr.remove(curr.size()-1);
        }
    }
}
